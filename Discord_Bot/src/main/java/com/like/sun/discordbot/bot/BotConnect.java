package com.like.sun.discordbot.bot;

import com.like.sun.discordbot.listener.BotListener;
import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class BotConnect {
    public static JDA jda;

    public static void startBot() {
        JDABuilder jb = new JDABuilder(AccountType.BOT);
        jb.setAutoReconnect(true);
        jb.setStatus(OnlineStatus.ONLINE);
        jb.setToken("Token 입력");
        jb.addEventListeners(new BotListener());

        try {
            jda = jb.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }
    }
}
