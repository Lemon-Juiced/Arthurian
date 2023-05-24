package lemon_juice.arthurian;

import lemon_juice.arthurian.block.ModBlocks;
import lemon_juice.arthurian.creativetab.CreativeTabs;
import lemon_juice.arthurian.entity.ModEntities;
import lemon_juice.arthurian.entity.client.renderer.KnightRenderer;
import lemon_juice.arthurian.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib.GeckoLib;

@Mod(Arthurian.MOD_ID)
public class Arthurian {
    public static final String MOD_ID = "arthurian";

    public Arthurian() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register Items & Blocks
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register Creative Tab
        modEventBus.addListener(CreativeTabs::registerTabs);

        // Initialize GeckoLib (Just In Case)
        GeckoLib.initialize();

        // Register Entities
        ModEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            EntityRenderers.register(ModEntities.KNIGHT.get(), KnightRenderer::new);
        }
    }
}
