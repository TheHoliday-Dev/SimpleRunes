package com.holiday.simplerunes.abstracts;

import com.holiday.simplerunes.listener.CustomGUIListener;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.Plugin;

public abstract class GUIRunner extends CustomGUIListener {
    protected String title;
    protected int size;

    public GUIRunner(String title, int size, Plugin plugin) {
        this.title = title;
        this.size = size;
    }

    public abstract Inventory createInventory(Player player, boolean status);
}
