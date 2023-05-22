package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Dragon-Slayer Sword
 * Should do extra damage and weaken the Ender Dragon
 */
public class AscalonItem extends SwordItem {
    public AscalonItem(Properties properties) {
        super(Tiers.ASCALON_TIER, 4, -2.4f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity damagedEntity, LivingEntity userEntity) {
        // This effect based code might not be working - so it may need to be converted to direct damage done to the dragon
        if(damagedEntity instanceof EnderDragon){
            damagedEntity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 500, 2));
            damagedEntity.addEffect(new MobEffectInstance(MobEffects.HARM, 20, 5));
        }
        itemStack.hurtAndBreak(1, userEntity, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.arthurian.ascalon"));
    }
}
