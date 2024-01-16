package rip.plugins.simpleinfobroadcast;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.jetbrains.annotations.NotNull;

public class ReloadCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        SimpleInfoBroadcast.getInstance().reloadConfig();
        SimpleInfoBroadcast.getInstance().loadMessages();
        SimpleInfoBroadcast.getInstance().startBroadcastTask();
        Message.sendMessage(commandSender,"<green>Reloaded config!");
        return true;
    }
}
