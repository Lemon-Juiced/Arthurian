package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.world.item.SwordItem;

public class AscalonItem extends SwordItem {
    public AscalonItem(Properties properties) {
        super(Tiers.ASCALON_TIER, 4, -2.4f, properties);
    }
}
