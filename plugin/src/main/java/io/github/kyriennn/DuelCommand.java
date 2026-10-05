package io.github.kyriennn;

import io.papermc.paper.command.brigadier.BasicCommand;
import io.papermc.paper.command.brigadier.CommandSourceStack;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Locale;

public class DuelCommand implements BasicCommand {
    private final Arena arena;
    private final ArenaPlugin plugin;

    public DuelCommand(Arena arena, ArenaPlugin plugin){
        this.arena = arena;
        this.plugin = plugin;
    }

    public void execute(CommandSourceStack source, String[] args){
        if(!(source.getSender() instanceof Player player)){
            // use source.getSender() instead of player because this check is for non-players
            source.getSender().sendPlainMessage("Only players can send this command");
            return;
        }
        if(args.length < 2 || !(args[0].equals("setspawn"))) {
            player.sendPlainMessage("Usage: /duel setspawn <1/2/lobby>");
            return;
        }

        if(!player.isOp()){
            player.sendPlainMessage("You do not have permission to do that");
            return;
        }

        switch(args[1].toLowerCase()){
            case "1": arena.setSpawn1(player.getLocation()); break;
            case "2": arena.setSpawn2(player.getLocation()); break;
            case "lobby": arena.setLobby(player.getLocation()); break;
            default: player.sendPlainMessage("Usage: /duel setspawn <1/2/lobby>"); return;
            }
        //saving the coordinates to the config for valid choices
        arena.save(plugin.getConfig());
        plugin.saveConfig();
        player.sendPlainMessage("Set " + args[1] + " to your current position");
        }
    }