package lemon_juice.arthurian.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import lemon_juice.arthurian.Arthurian;
import lemon_juice.arthurian.block.ModBlocks;
import lemon_juice.arthurian.entity.ModEntities;
import lemon_juice.arthurian.entity.custom.KingArthurEntity;
import lemon_juice.arthurian.entity.custom.KnightEntity;
import lemon_juice.arthurian.entity.custom.MerlinEntity;
import lemon_juice.arthurian.item.ModItems;
import lemon_juice.arthurian.villager.ModVillagers;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.ambient.AmbientCreature;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.SpawnPlacementRegisterEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = Arthurian.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    public static class ForgeEvents{
        @SubscribeEvent
        public static void addCustomTrades(VillagerTradesEvent event){
            if(event.getType() == ModVillagers.KILN_SMITH.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();
                // Level 1
                ItemStack trade1 = new ItemStack(ModItems.METEORIC_IRON_INGOT.get(), 4);
                ItemStack trade2 = new ItemStack(ModItems.KILN_BRICK.get(), 16);
                int villagerLevel = 1;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), trade1,10,8,0.02F));
                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), trade2,10,8,0.02F));

                // Level 2
                ItemStack trade3 = new ItemStack(ModBlocks.METEORIC_IRON_BLOCK.get(), 1);
                ItemStack trade4 = new ItemStack(ModBlocks.KILN_BRICKS.get(), 4);
                villagerLevel = 2;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), trade3,10,8,0.02F));
                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), trade4,10,8,0.02F));

                // Level 3
                ItemStack trade5 = new ItemStack(ModItems.STARSTEEL_NUGGET.get(), 5);
                ItemStack trade6 = new ItemStack(ModBlocks.KILN.get(), 1);
                villagerLevel = 3;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), trade5,10,8,0.02F));
                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 2), trade6,10,8,0.02F));

                // Level 4
                ItemStack trade7 = new ItemStack(ModItems.STARSTEEL_INGOT.get(), 2);
                ItemStack trade8 = new ItemStack(ModItems.CALIBURN_REPLICA.get(), 1);
                villagerLevel = 4;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 4), trade7,10,8,0.02F));
                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32), trade8,10,8,0.02F));

                // Level 5
                ItemStack trade9 = new ItemStack(ModBlocks.STARSTEEL_BLOCK.get(), 1);
                ItemStack trade10 = new ItemStack(ModItems.ASCALON.get(), 1); // The Only Current Way To Get Ascalon
                villagerLevel = 5;

                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 9), trade9,10,8,0.02F));
                trades.get(villagerLevel).add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 64), trade10,1,8,0.02F));

            }

        }
    }

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.KING_ARTHUR.get(), KingArthurEntity.setAttributes());
        event.put(ModEntities.KNIGHT.get(), KnightEntity.setAttributes());
        event.put(ModEntities.MERLIN.get(), MerlinEntity.setAttributes());
    }

    @SubscribeEvent
    public static void entitySpawnRestriction(SpawnPlacementRegisterEvent event) {
        event.register(ModEntities.KING_ARTHUR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.KNIGHT.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
        event.register(ModEntities.MERLIN.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, AmbientCreature::checkMobSpawnRules, SpawnPlacementRegisterEvent.Operation.REPLACE);
    }

}
