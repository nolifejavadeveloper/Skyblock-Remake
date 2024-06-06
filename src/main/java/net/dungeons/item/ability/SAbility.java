package net.dungeons.item.ability;

import net.dungeons.player.DungeonsPlayer;

import javax.swing.*;

public interface SAbility {
    public ActionType getActionType();
    public ActionModifier getActionModifier();
    public void execute(DungeonsPlayer player);
}
