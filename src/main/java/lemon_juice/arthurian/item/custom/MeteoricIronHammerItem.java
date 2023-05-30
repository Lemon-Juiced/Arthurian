package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.ModItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class MeteoricIronHammerItem extends Item {
    public MeteoricIronHammerItem(Properties properties) {
        super(properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
        return new ItemStack(ModItems.METEORIC_IRON_HAMMER.get());
    }
}
