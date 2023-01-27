package com.nikolaipatrick.intelligenthubcommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

@SuppressWarnings("DataFlowIssue")
public final class IntelligentHubCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting IntelligentHubCommand v1.1.0 for ArtichokeMC...");
        getLogger().info("A Nikolai Patrick plugin - 2022");
        getCommand("hub").setExecutor(new commandHub());
        getCommand("lobby").setExecutor(new commandHub());
        getCommand("l").setExecutor(new commandHub());
        this.getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye!");
    }
    public static void sendPlayerToServer(Player player, String server) {
        try {
            ByteArrayOutputStream b = new ByteArrayOutputStream();
            DataOutputStream out = new DataOutputStream(b);
            out.writeUTF("Connect");
            out.writeUTF(server);
            player.sendPluginMessage(IntelligentHubCommand.getPlugin(IntelligentHubCommand.class), "BungeeCord", b.toByteArray());
            b.close();
            out.close();
        }
        catch (Exception e) {
            player.sendMessage(ChatColor.RED+"Error when trying to connect to "+server);
        }
    }
}
