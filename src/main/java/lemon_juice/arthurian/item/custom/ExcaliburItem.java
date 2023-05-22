package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.world.item.SwordItem;

public class ExcaliburItem extends SwordItem {
    public ExcaliburItem(Properties properties) {
        super(Tiers.EXCALIBUR_TIER, 4, -2.4f, properties);
    }
}
