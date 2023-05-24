package lemon_juice.arthurian.block;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.block.custom.ExcaliburBlock;
import lemon_juice.arthurian.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Arthurian.MOD_ID);

    public static final RegistryObject<Block> EXCALIBUR_BLOCK = registerBlock("excalibur_block", () -> new ExcaliburBlock(BlockBehaviour.Properties.of(Material.METAL).strength(5.0F, 6.0F).noOcclusion()));

    public static final RegistryObject<Block> METEORIC_IRON_BLOCK = registerBlock("meteoric_iron_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));
    public static final RegistryObject<Block> METEORIC_IRON_ORE = registerBlock("meteoric_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE).requiresCorrectToolForDrops().strength(3.0F, 3.0F)));
    public static final RegistryObject<Block> DEEPSLATE_METEORIC_IRON_ORE = registerBlock("deepslate_meteoric_iron_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(METEORIC_IRON_ORE.get()).requiresCorrectToolForDrops().strength(4.5F, 3.0F)));
    public static final RegistryObject<Block> RAW_METEORIC_IRON_BLOCK = registerBlock("raw_meteoric_iron_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));

    public static final RegistryObject<Block> STARSTEEL_BLOCK = registerBlock("starsteel_block", () -> new Block(BlockBehaviour.Properties.of(Material.METAL).requiresCorrectToolForDrops().strength(5.0F, 6.0F)));


    /******************************** Registry ********************************/
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
