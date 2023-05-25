package lemon_juice.arthurian.villager;

import com.google.common.collect.ImmutableSet;
import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.block.ModBlocks;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.lang.reflect.InvocationTargetException;

public class ModVillagers {
    public static final DeferredRegister<PoiType> POI_TYPES = DeferredRegister.create(ForgeRegistries.POI_TYPES, Arthurian.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS = DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Arthurian.MOD_ID);

    public static final RegistryObject<PoiType> KILN_POI = POI_TYPES.register("kiln_poi", () -> new PoiType(ImmutableSet.copyOf(ModBlocks.KILN.get().getStateDefinition().getPossibleStates()),1, 1));

    public static final RegistryObject<VillagerProfession> KILN_SMITH = VILLAGER_PROFESSIONS.register("kiln_smith", () -> new VillagerProfession("kiln_smith", x -> x.get() == KILN_POI.get(), x -> x.get() == KILN_POI.get(), ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_WEAPONSMITH));

    public static void registerPOIs(){
        try {
            ObfuscationReflectionHelper.findMethod(PoiType.class, "registerBlockStates", PoiType.class).invoke(null, KILN_POI.get());
        } catch (InvocationTargetException | IllegalAccessException exception) {
            exception.printStackTrace();
        }
    }

    public static void register(IEventBus eventBus){
        POI_TYPES.register(eventBus);
        VILLAGER_PROFESSIONS.register(eventBus);
    }
}
