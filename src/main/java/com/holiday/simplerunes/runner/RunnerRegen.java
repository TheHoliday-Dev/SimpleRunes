package com.holiday.simplerunes.runner;

import com.holiday.simplerunes.abstracts.Runner;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;

public class RunnerRegen extends Runner {
    public RunnerRegen(NamespacedKey runnerKey, String description) {
        super("Regen", runnerKey, new ItemStack(Material.PIGLIN_BANNER_PATTERN), description);
    }
}
