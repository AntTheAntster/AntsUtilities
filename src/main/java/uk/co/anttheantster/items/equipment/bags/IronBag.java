package uk.co.anttheantster.items.equipment.bags;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;
import uk.co.anttheantster.AntsUtilities;

import java.util.function.Consumer;

public class IronBag extends AbstractBag {
    private static final Properties ibProperties = properties;

    public IronBag() {
        super(ibProperties
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "iron_bag"))));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltips, TooltipFlag flags) {

        tooltips.accept(Component.translatable("tooltip.antsutilities.iron_bag").withStyle(ChatFormatting.GRAY));

        super.appendHoverText(stack, context, tooltipDisplay, tooltips, flags);
    }
}
