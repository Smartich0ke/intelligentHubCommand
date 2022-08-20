package com.nikolaipatrick.intelligenthubcommand;

import org.bukkit.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class commandHub implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("§cthis isn't a console command");
            return true;
        }
        else {
            Player player = (Player) sender;
            World world = player.getWorld();
            Location serverHub = new Location(Bukkit.getWorld("world"), 0, 0, 0);
            if(!world.getName().equals("world")) {
                player.teleport(serverHub);
                return true;
            }
            else {
                IntelligentHubCommand.sendPlayerToServer(player, "hub");
                return true;
            }

        }
    }
}
