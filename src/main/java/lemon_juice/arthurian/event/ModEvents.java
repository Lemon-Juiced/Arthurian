package lemon_juice.arthurian.event;

import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.entity.ModEntities;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Arthurian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KNIGHT.get(), KnightEntity.setAttributes());
    }
}
