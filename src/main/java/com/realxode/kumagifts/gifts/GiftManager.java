package com.realxode.kumagifts.gifts;

import org.bukkit.Material;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;

public class GiftManager {

    public void spawnGift(Gift gift) {
        ArmorStand armorStand = (ArmorStand) gift.getLocation().getWorld().spawnEntity
                (gift.getLocation(), EntityType.ARMOR_STAND);

        armorStand.setInvulnerable(true);
        armorStand.setCanPickupItems(false);
        armorStand.setInvisible(true);
        armorStand.setSmall(true);
        if (gift.getMaterial().getType() == Material.PLAYER_HEAD) {

        }
        armorStand.getEquipment().setHelmet(gift.getMaterial());
    }

}
