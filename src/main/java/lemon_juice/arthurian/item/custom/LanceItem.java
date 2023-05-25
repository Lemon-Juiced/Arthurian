package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.ChatFormatting;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Does More Damage On Horseback
 */
public class LanceItem extends SwordItem {
    public LanceItem(Properties properties) {
        super(Tiers.LANCE_TIER, 4, -2.4f, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack itemStack, LivingEntity damagedEntity, LivingEntity userEntity) {
        // Does Extra Damage On Horseback
        if(userEntity.isPassenger()){
            damagedEntity.hurt(new DamageSource((Holder<DamageType>) DamageTypes.PLAYER_ATTACK), 6.0f);
        }

        // Normal hurtEnemy code
        itemStack.hurtAndBreak(1, userEntity, (p_43296_) -> {
            p_43296_.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.arthurian.lance").withStyle(ChatFormatting.AQUA));
    }
}
