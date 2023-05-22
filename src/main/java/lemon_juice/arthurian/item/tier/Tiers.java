package lemon_juice.arthurian.item.tier;

import lemon_juice.arthurian.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final ForgeTier CALIBER_TIER = new ForgeTier(4, 2031, 10.0F, 4.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
    public static final ForgeTier EXCALIBUR_TIER = new ForgeTier(5, -1, 12.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
}
