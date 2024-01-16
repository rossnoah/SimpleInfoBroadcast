package rip.plugins.simpleinfobroadcast;

import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.title.Title;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class Message {

    private static final MiniMessage miniMessage = MiniMessage.miniMessage();

    public static void sendMessage(Player player, String message) {
        player.sendMessage(MiniMessage.miniMessage().deserialize(message));
    }
    public static void sendMessage(CommandSender sender, String message) {
        sender.sendMessage(MiniMessage.miniMessage().deserialize(message));
    }

    public static void sendTitle(Player player, String title, String subtitle) {

        Title titleMessage = Title.title(
                miniMessage.deserialize(title),
                miniMessage.deserialize(subtitle)
        );
        player.showTitle(titleMessage);

    }

    public static void broadcastMessage(String message) {
        for(Player player:Bukkit.getOnlinePlayers()){
            Message.sendMessage(player,message);
        }
    }

    public static void broadcastMessage(String message,boolean log) {
        for(Player player:Bukkit.getOnlinePlayers()){
            Message.sendMessage(player,message);
        }
        if(log) {
            Bukkit.getLogger().info(message);
        }
    }


}
