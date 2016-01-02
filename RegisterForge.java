package com.offline.forge;

import com.offline.forge.ExprRegenOfPlayer;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.entity.Player;

import ch.njol.skript.Skript;
import ch.njol.skript.lang.ExpressionType;

public class RegisterForge extends JavaPlugin{
    public void onEnable(){
        Skript.registerAddon(this);
        //register regeneration of player
        Skript.registerExpression(ExprRegenOfPlayer.class, Number.class, ExpressionType.PROPERTY, "%player%'s regen[eration]", "regeneration of %player%");
    }
}
