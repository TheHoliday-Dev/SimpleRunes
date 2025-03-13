package com.holiday.simplerunes;

import com.holiday.simplerunes.commands.MainCommand;
import com.holiday.simplerunes.gui.BookGUIRunner;
import com.holiday.simplerunes.gui.RunnerGUIRunner;
import com.holiday.simplerunes.listener.InteractBookListener;
import com.holiday.simplerunes.listener.InteractRunnerListener;
import com.holiday.simplerunes.utils.BookRunnable;
import com.holiday.simplerunes.utils.MapUtils;
import com.holiday.simplerunes.utils.PDHUtils;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        PDHUtils pdhUtils = new PDHUtils(this);
        MapUtils mapUtils = new MapUtils();
        BookGUIRunner bookGUIRunner = new BookGUIRunner(pdhUtils, mapUtils);

        Objects.requireNonNull(getCommand("runner")).setExecutor(new MainCommand(pdhUtils));
        getCommand("runner").setTabCompleter(new MainCommand(pdhUtils));

        BookRunnable bookRunnable = new BookRunnable(this, pdhUtils);
        bookRunnable.runTaskTimer(this, 0L, 1L);

        getServer().getPluginManager().registerEvents(bookGUIRunner, this);
        getServer().getPluginManager().registerEvents(new RunnerGUIRunner(pdhUtils, mapUtils), this);
        getServer().getPluginManager().registerEvents(new InteractBookListener(pdhUtils, this, mapUtils, bookGUIRunner), this);
        getServer().getPluginManager().registerEvents(new InteractRunnerListener(pdhUtils, this, mapUtils), this);
    }
}
