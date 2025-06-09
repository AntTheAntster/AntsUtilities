package uk.co.anttheantster.antsutilities.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.anttheantster.antsutilities.AntsUtilities;
import uk.co.anttheantster.antsutilities.blocks.ModBlocks;
import uk.co.anttheantster.antsutilities.items.ModItems;

import java.util.function.Supplier;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AntsUtilities.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }

    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TAB.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.antsutilities.tabname"))
                    .icon(() -> new ItemStack(ModItems.ENDER_CORE.get()))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ENDER_BAG.get().getDefaultInstance());
                        output.accept(ModItems.ENDER_CORE.get().getDefaultInstance());
                        output.accept(ModItems.ANGEL_RING.get().getDefaultInstance());

                        output.accept(ModBlocks.WORKTABLE.get());

                    }).build());
}
