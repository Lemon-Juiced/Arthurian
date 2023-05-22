package lemon_juice.arthurian.creativetab;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.block.ModBlocks;
import lemon_juice.arthurian.item.ModItems;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;

public class CreativeTabs {

    public static ResourceLocation ARTHURIAN_TAB = new ResourceLocation(Arthurian.MOD_ID, "arthurian");

    public static void registerTabs(CreativeModeTabEvent.Register event) {
        // Arthurian Tab
        event.registerCreativeModeTab(ARTHURIAN_TAB, builder -> builder
                .title(Component.translatable("itemGroup.arthurian"))
                .icon(() -> new ItemStack(ModItems.EXCALIBUR.get()))
                .displayItems((features, output) -> {
                    output.accept(new ItemStack(ModItems.ASCALON.get()));
                    output.accept(new ItemStack(ModItems.CALIBURN.get()));
                    output.accept(new ItemStack(ModItems.DURANDAL.get()));
                    output.accept(new ItemStack(ModItems.EXCALIBUR.get()));

                    output.accept(new ItemStack(ModItems.METEORIC_IRON_INGOT.get()));
                    output.accept(new ItemStack(ModItems.METEORIC_IRON_NUGGET.get()));
                    output.accept(new ItemStack(ModItems.RAW_METEORIC_IRON.get()));

                    output.accept(new ItemStack(ModItems.STARSTEEL_INGOT.get()));
                    output.accept(new ItemStack(ModItems.STARSTEEL_NUGGET.get()));

                    output.accept(new ItemStack(ModBlocks.METEORIC_IRON_BLOCK.get()));
                    output.accept(new ItemStack(ModBlocks.METEORIC_IRON_ORE.get()));
                    output.accept(new ItemStack(ModBlocks.DEEPSLATE_METEORIC_IRON_ORE.get()));
                    output.accept(new ItemStack(ModBlocks.RAW_METEORIC_IRON_BLOCK.get()));

                    output.accept(new ItemStack(ModBlocks.STARSTEEL_BLOCK.get()));
                }));
    }
}

