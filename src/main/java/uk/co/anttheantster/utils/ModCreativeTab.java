package uk.co.anttheantster.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.anttheantster.AntsUtilities;
import uk.co.anttheantster.items.ModItems;

import java.util.function.Supplier;

public class ModCreativeTab {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AntsUtilities.MODID);
    public static void registerCreativeTab(IEventBus bus) {
        CREATIVE_MODE_TAB.register(bus);
    }

    public static final Supplier<CreativeModeTab> CREATIVE_TAB = CREATIVE_MODE_TAB.register("creative_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("creativetab.antsutilities.tabname"))
                    .icon(() -> new ItemStack(ModItems.ANGEL_RING.get()))
                    .displayItems(((itemDisplayParameters, output) -> {

                        output.accept(ModItems.ANGEL_RING.get());
                        output.accept(ModItems.AXEOFLIFE.get());

                        output.accept(ModItems.ENDER_BAG.get());
                        output.accept(ModItems.LEATHER_BAG.get());
                        output.accept(ModItems.IRON_BAG.get());
                        output.accept(ModItems.GOLD_BAG.get());
                        output.accept(ModItems.DIAMOND_BAG.get());
                        output.accept(ModItems.NETHERRITE_BAG.get());

                        output.accept(ModItems.IRON_SAW.get());
                        output.accept(ModItems.DIAMOND_SAW.get());

                        output.accept(ModItems.ENDER_CORE.get());
                        output.accept(ModItems.OBSIDIAN_ROD.get());
                        output.accept(ModItems.DIAMOND_SAW_BLADE.get());
                        output.accept(ModItems.IRON_SAW_BLADE.get());
                        output.accept(ModItems.NETHER_STAR_INGOT.get());
                        output.accept(ModItems.ENDER_INGOT.get());
                        output.accept(ModItems.ANCIENT_INGOT.get());

                    })).build()
    );

}
