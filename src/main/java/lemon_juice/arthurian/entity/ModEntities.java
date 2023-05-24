package lemon_juice.arthurian.entity;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Arthurian.MOD_ID);

    public static final RegistryObject<EntityType<KnightEntity>> KNIGHT =
            ENTITY_TYPES.register("knight",
                    () -> EntityType.Builder.of(KnightEntity::new, MobCategory.MONSTER)
                            .sized(2.0f, 1.0f)
                            .build(new ResourceLocation(Arthurian.MOD_ID, "knight").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
