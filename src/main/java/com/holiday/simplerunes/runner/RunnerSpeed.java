package com.holiday.simplerunes.runner;

import com.holiday.simplerunes.abstracts.Runner;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class RunnerSpeed extends Runner {
    public RunnerSpeed(NamespacedKey runeSpeed, String description) {
        super("Speed", runeSpeed, new ItemStack(Material.PIGLIN_BANNER_PATTERN), description);
    }
}
