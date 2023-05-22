package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.world.item.SwordItem;

public class CaliberItem extends SwordItem {
    public CaliberItem(Properties properties) {
        super(Tiers.CALIBER_TIER, 4, -2.4f, properties);
    }
}
