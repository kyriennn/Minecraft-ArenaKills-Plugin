package io.github.kyriennn;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;

public class Arena {
    private Location spawn1;
    private Location spawn2;
    private Location lobby;

 // no need for constructor, because all fields are null until runtime when player sets them

    //getters
    public Location getSpawn1(){
        return spawn1;
    }
    public Location getSpawn2(){
        return spawn2;
    }
    public Location getLobby(){
        return lobby;
    }

    //setters
    public void setSpawn1(Location spawn1){
        this.spawn1 = spawn1;
    }
    public void setSpawn2(Location spawn2){
        this.spawn2 = spawn2;
    }
    public void setLobby(Location lobby){
        this.lobby = lobby;
    }

    // method to determine whether the duel can start. duel only starts when all spawns and lobby are set
    public boolean isReady(){
        return spawn1 != null && spawn2 != null && lobby != null;
    }

    public void save(FileConfiguration config){
        config.set("arena.spawn1", spawn1);
        config.set("arena.spawn2", spawn2);
        config.set("lobby.spawn", lobby);
    }
    public void load(FileConfiguration config){
        spawn1 = config.getLocation("arena.spawn1");
        spawn2 = config.getLocation("arena.spawn2");
        lobby = config.getLocation("lobby.spawn");
    }
}
