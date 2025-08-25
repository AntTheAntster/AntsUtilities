package uk.co.anttheantster.items.tools;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import uk.co.anttheantster.AntsUtilities;

import java.util.function.Consumer;

public class EnderBagItem extends Item {

    public EnderBagItem() {
        super (new Item.Properties()
                .stacksTo(1)
                .rarity(Rarity.EPIC)
                .fireResistant()
                .setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "ender_bag"))));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltips, TooltipFlag flags) {

        if (flags.hasShiftDown()){
            tooltips.accept(Component.translatable("tooltip.antsutilities.ender_bag.shift"));
            tooltips.accept(Component.translatable("tooltip.antsutilities.ender_bag.shift_1"));
        } else {
            tooltips.accept(Component.translatable("tooltip.antsutilities.ender_bag.no_shift"));
        }

        super.appendHoverText(stack, context, tooltipDisplay, tooltips, flags);
    }
}
