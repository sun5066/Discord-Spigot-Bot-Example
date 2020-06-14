package com.like.sun.discordbot.listener;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bukkit.Bukkit;

public class BotListener extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        User user = e.getAuthor();
        Message msg = e.getMessage();

        if (user.isBot()) return;

        String MsgContentRaw = msg.getContentRaw();
        String userName = user.getName();
        Bukkit.broadcastMessage(String.format("§9§l[Discord] §f< %s > %s", userName, MsgContentRaw));
    }
}
