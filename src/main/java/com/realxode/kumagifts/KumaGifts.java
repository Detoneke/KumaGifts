package com.realxode.kumagifts;

import com.realxode.kumagifts.file.YamlCreator;
import org.bukkit.plugin.java.JavaPlugin;

public final class KumaGifts extends JavaPlugin {

    private final YamlCreator storage = new YamlCreator(this, "storage.yml");
    private final YamlCreator gifts = new YamlCreator(this, "gifts.yml");

    @Override
    public void onEnable() {
        this.saveDefaultConfig();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public YamlCreator getStorage() {
        return storage;
    }

    public YamlCreator getGifts() {
        return gifts;
    }
}
