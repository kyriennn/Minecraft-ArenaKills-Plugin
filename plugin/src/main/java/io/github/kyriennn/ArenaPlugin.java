package io.github.kyriennn;

// i remember bukkit from back in the day lmao
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ArenaPlugin extends JavaPlugin implements Listener{
    @Override
    public void onEnable(){
        getLogger().info("ArenaKills Enabled!");
        //adding a the Plugin version of Listener from the Pong Project
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        event.getPlayer().sendPlainMessage("Welcome to ArenaKills, " + event.getPlayer().getName() + "!");
    }

}
