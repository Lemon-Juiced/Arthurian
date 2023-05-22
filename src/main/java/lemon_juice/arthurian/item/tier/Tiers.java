package lemon_juice.arthurian.item.tier;

import lemon_juice.arthurian.item.ModItems;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    /* WOOD(0, 59, 2.0F, 0.0F, 15, () -> {return Ingredient.of(ItemTags.PLANKS);}),
     * STONE(1, 131, 4.0F, 1.0F, 5, () -> {return Ingredient.of(ItemTags.STONE_TOOL_MATERIALS);}),
     * IRON(2, 250, 6.0F, 2.0F, 14, () -> {return Ingredient.of(Items.IRON_INGOT);}),
     * DIAMOND(3, 1561, 8.0F, 3.0F, 10, () -> {return Ingredient.of(Items.DIAMOND);}),
     * GOLD(0, 32, 12.0F, 0.0F, 22, () -> {return Ingredient.of(Items.GOLD_INGOT);}),
     * NETHERITE(4, 2031, 9.0F, 4.0F, 15, () -> {return Ingredient.of(Items.NETHERITE_INGOT);});
     */

    /* Ascalon: Dragon-Slaying Sword
     * Caliburn: Exaclibur Mimic (Not Quite As Powerful)
     * Durandal: Unbreakable
     * Excalibur: Unbreakable
     */

    public static final ForgeTier ASCALON_TIER = new ForgeTier(4, 1561, 10.0F, 4.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
    public static final ForgeTier CALIBURN_TIER = new ForgeTier(4, 2031, 10.0F, 4.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
    public static final ForgeTier DURANDAL_TIER = new ForgeTier(4, -1, 10.0F, 4.0F, 18, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
    public static final ForgeTier EXCALIBUR_TIER = new ForgeTier(5, -1, 12.0F, 5.0F, 22, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.METEORIC_IRON_INGOT.get()));
}
