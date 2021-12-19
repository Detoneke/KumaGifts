package com.realxode.kumagifts.gifts;

import com.realxode.kumagifts.KumaGifts;
import org.bukkit.Location;
import org.bukkit.inventory.ItemStack;

public class Gift {

    private String name;
    private ItemStack material;
    private Location location;
    private KumaGifts plugin;

    public Gift(KumaGifts plugin) {
        this.plugin = plugin;
    }

    public Gift(String name) {
        this.name = name;
    }

    public Gift(String name, ItemStack material) {
        this.name = name;
        this.material = material;
    }

    public Gift(String name, ItemStack material, Location location) {
        this.name = name;
        this.material = material;
        this.location = location;
    }

    public void save(String name, ItemStack material, Location location) {
        String materialName = material.getType().name();
        plugin.getStorage().set("gifts." + name + ".material", materialName);
        String rawLocation = location.getWorld().getName() + ", "
                + location.getX()
                + ", " + location.getY()
                + ", " + location.getZ();
        /*
        String[] args = rawLocation.split(", ");
        location = new Location(Bukkit.getWorld(args[0]),
                Integer.parseInt(args[1]),
                Integer.parseInt(args[2]),
                Integer.parseInt(args[3]));
         */
        plugin.getStorage().set("gifts." + name + ".location", rawLocation);
    }

    public String headValue() {
        return plugin.getStorage().getString("gifts." + name + ".head-value");
    }

    public String getName() {
        return name;
    }

    public ItemStack getMaterial() {
        return material;
    }

    public Location getLocation() {
        return location;
    }
}
