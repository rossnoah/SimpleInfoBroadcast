package rip.plugins.simpleinfobroadcast;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.List;

public final class SimpleInfoBroadcast extends JavaPlugin {

    private static SimpleInfoBroadcast instance;
    private static int index = 0;
    private List<String> messages;

    private int taskId = -1; // Task ID for the scheduled task

    @Override
    public void onEnable() {
        instance = this;
        this.saveDefaultConfig();
        this.getCommand("sibreload").setExecutor(new ReloadCommand());
        loadMessages();
        startBroadcastTask();

    }

    @Override
    public void onDisable() {
    }
    public void startBroadcastTask() {
        if (taskId != -1) {
            Bukkit.getScheduler().cancelTask(taskId); // Cancel existing task if there is one
        }

        int interval = getConfig().getInt("interval", 10) * 20; // Convert to ticks
        taskId = Bukkit.getScheduler().scheduleSyncRepeatingTask(this, () -> {
            if (messages.isEmpty()) return;
            Message.broadcastMessage(   this.getConfig().getString("prefix") + messages.get(index),this.getConfig().getBoolean("log"));
            index = (index + 1) % messages.size();
        }, 0, interval);
    }


    public void loadMessages() {
        messages = getConfig().getStringList("messages");
        index = 0; // Reset index
    }

    public static SimpleInfoBroadcast getInstance() {
        return instance;
    }
}