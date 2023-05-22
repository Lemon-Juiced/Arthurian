package lemon_juice.arthurian.item.custom;

import lemon_juice.arthurian.item.tier.Tiers;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Replica Blade of Excalibur
 */
public class CaliburnReplicaItem extends SwordItem {
    public CaliburnReplicaItem(Properties properties) {
        super(Tiers.CALIBURN_TIER, 3, -2.4f, properties);
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag flag) {
        components.add(Component.translatable("tooltip.arthurian.caliburn").withStyle(ChatFormatting.AQUA));
    }
}
