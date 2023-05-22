package lemon_juice.arthurian.item;

import lemon_juice.arthurian.Arthurian;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Arthurian.MOD_ID);

    public static final RegistryObject<Item> METEORIC_IRON_INGOT = ITEMS.register("meteoric_iron_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METEORIC_IRON_NUGGET = ITEMS.register("meteoric_iron_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_METEORIC_IRON = ITEMS.register("raw_meteoric_iron", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
