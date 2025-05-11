package uk.co.anttheantster.antsutilities.items.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import uk.co.anttheantster.antsutilities.AntsUtilities;

import java.util.function.Consumer;

public class AngelRingItem extends Item {

    public AngelRingItem() {
        super(new Item.Properties()
                .stacksTo(1)
                .setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(AntsUtilities.MOD_ID, "angel_ring"))));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltips, TooltipFlag flags) {
        if (flags.hasShiftDown()) {
            tooltips.accept(Component.translatable("item.antsutilities.angel_ring.tooltip").withStyle(ChatFormatting.AQUA));
            tooltips.accept(Component.translatable("item.antsutilities.angel_ring.tooltip2").withStyle(ChatFormatting.GOLD));
            return;
        }
        tooltips.accept(Component.translatable("item.antsutilities.angel_ring.tooltip_no_shift").withStyle(ChatFormatting.GRAY));
        super.appendHoverText(stack, context, tooltipDisplay, tooltips, flags);
    }

}
