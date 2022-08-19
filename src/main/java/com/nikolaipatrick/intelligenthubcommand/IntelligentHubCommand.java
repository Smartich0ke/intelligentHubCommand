package com.nikolaipatrick.intelligenthubcommand;

import org.bukkit.plugin.java.JavaPlugin;

public final class IntelligentHubCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("Starting IntelligentHubCommand v1.0.0-SNAPSHOT...");
        getLogger().info("A Nikolai Patrick plugin - 2022");

    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye!");
    }
}
