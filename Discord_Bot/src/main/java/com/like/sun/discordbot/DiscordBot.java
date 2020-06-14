package com.like.sun.discordbot;

import com.like.sun.discordbot.bot.BotConnect;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordBot extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        BotConnect.startBot();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
