package uk.co.anttheantster.antsutilities.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.anttheantster.antsutilities.AntsUtilities;
import uk.co.anttheantster.antsutilities.items.custom.AngelRingItem;
import uk.co.anttheantster.antsutilities.items.custom.EnderBagItem;
import uk.co.anttheantster.antsutilities.items.custom.EnderCoreItem;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.createItems(AntsUtilities.MOD_ID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static final Supplier<Item> ENDER_BAG = ITEMS.register("ender_bag", EnderBagItem::new);
    public static final Supplier<Item> ENDER_CORE = ITEMS.register("ender_core", EnderCoreItem::new);

    public static final Supplier<Item> ANGEL_RING = ITEMS.register("angel_ring", AngelRingItem::new);


}
