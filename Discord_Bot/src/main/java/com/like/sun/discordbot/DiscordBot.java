package com.like.sun.discordbot;

import com.like.sun.discordbot.bot.BotConnect;
import org.bukkit.plugin.java.JavaPlugin;

public final class DiscordBot extends JavaPlugin {

    /**
     * Author Discord : LIKE#3897
     * 제 코드를 예제로 봐주셔서 감사합니다.
     * 코딩 재밌게 하시길 바래요!
     * */
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
