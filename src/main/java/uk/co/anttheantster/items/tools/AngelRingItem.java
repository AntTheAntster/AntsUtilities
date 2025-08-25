package uk.co.anttheantster.items.tools;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import uk.co.anttheantster.AntsUtilities;

import java.util.function.Consumer;

public class AngelRingItem extends Item {

    public AngelRingItem() {
        super (new Item.Properties()
                .stacksTo(1)
                .fireResistant()
                .rarity(Rarity.EPIC)
                .setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "angel_ring"))));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltips, TooltipFlag flags) {

        if (flags.hasShiftDown()){
            tooltips.accept(Component.translatable("tooltip.antsutilities.angel_ring.shift").withStyle(ChatFormatting.AQUA));
            tooltips.accept(Component.translatable("tooltip.antsutilities.angel_ring.shift_1").withStyle(ChatFormatting.GOLD));
        } else {
            tooltips.accept(Component.translatable("tooltip.antsutilities.angel_ring.no_shift").withStyle(ChatFormatting.GRAY));
        }

        super.appendHoverText(stack, context, tooltipDisplay, tooltips, flags);
    }
}
