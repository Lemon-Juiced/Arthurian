package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class DurandalItem extends SwordItem {

    public DurandalItem(Properties properties) {
        super(Tiers.DURANDAL_TIER, 4, -2.4f, properties);
    }
}
