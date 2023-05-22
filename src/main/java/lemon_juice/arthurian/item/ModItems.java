package lemon_juice.arthurian.item;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.item.custom.AscalonItem;
import lemon_juice.arthurian.item.custom.CaliburnItem;
import lemon_juice.arthurian.item.custom.DurandalItem;
import lemon_juice.arthurian.item.custom.ExcaliburItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Arthurian.MOD_ID);

    public static final RegistryObject<Item> ASCALON = ITEMS.register("ascalon", () -> new AscalonItem(new Item.Properties()));
    public static final RegistryObject<Item> CALIBURN = ITEMS.register("caliburn", () -> new CaliburnItem(new Item.Properties()));
    public static final RegistryObject<Item> DURANDAL = ITEMS.register("durandal", () -> new DurandalItem(new Item.Properties()));
    public static final RegistryObject<Item> EXCALIBUR = ITEMS.register("excalibur", () -> new ExcaliburItem(new Item.Properties()));

    public static final RegistryObject<Item> METEORIC_IRON_INGOT = ITEMS.register("meteoric_iron_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> METEORIC_IRON_NUGGET = ITEMS.register("meteoric_iron_nugget", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_METEORIC_IRON = ITEMS.register("raw_meteoric_iron", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> STARSTEEL_INGOT = ITEMS.register("starsteel_ingot", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STARSTEEL_NUGGET = ITEMS.register("starsteel_nugget", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
