package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.world.item.SwordItem;

public class CaliburnItem extends SwordItem {
    public CaliburnItem(Properties properties) {
        super(Tiers.CALIBER_TIER, 4, -2.4f, properties);
    }
}
