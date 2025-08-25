package uk.co.anttheantster.items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.anttheantster.AntsUtilities;
import uk.co.anttheantster.items.equipment.bags.*;
import uk.co.anttheantster.items.ingredients.EnderCore;
import uk.co.anttheantster.items.ingredients.ObsidianRod;
import uk.co.anttheantster.items.ingredients.ingots.AncientIngot;
import uk.co.anttheantster.items.ingredients.ingots.EnderIngot;
import uk.co.anttheantster.items.ingredients.ingots.NetherStarIngot;
import uk.co.anttheantster.items.ingredients.sawblades.DiamondSawBlade;
import uk.co.anttheantster.items.ingredients.sawblades.IronSawBlade;
import uk.co.anttheantster.items.tools.AngelRingItem;
import uk.co.anttheantster.items.tools.EnderBagItem;
import uk.co.anttheantster.items.tools.crafting.saws.DiamondSaw;
import uk.co.anttheantster.items.tools.crafting.saws.IronSaw;
import uk.co.anttheantster.items.tools.functional.AxeOfLife;

import java.util.function.Supplier;

public class ModItems {

    public static DeferredRegister<Item> ITEMS = DeferredRegister.createItems(AntsUtilities.MODID);
    public static void registerItems(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    //Tools/Equipment
    public static final Supplier<Item> ANGEL_RING = ITEMS.register("angel_ring", AngelRingItem::new);
    public static final Supplier<Item> AXEOFLIFE = ITEMS.register("axe_of_life", AxeOfLife::new);

    //Bags
    public static final Supplier<Item> ENDER_BAG = ITEMS.register("ender_bag", EnderBagItem::new);
    public static final Supplier<Item> LEATHER_BAG = ITEMS.register("leather_bag", LeatherBag::new);
    public static final Supplier<Item> IRON_BAG = ITEMS.register("iron_bag", IronBag::new);
    public static final Supplier<Item> GOLD_BAG = ITEMS.register("gold_bag", GoldBag::new);
    public static final Supplier<Item> DIAMOND_BAG = ITEMS.register("diamond_bag", DiamondBag::new);
    public static final Supplier<Item> NETHERRITE_BAG = ITEMS.register("netherrite_bag", NetherriteBag::new);

    //Crafting Tools
    public static final Supplier<Item> IRON_SAW = ITEMS.register("iron_saw", IronSaw::new);
    public static final Supplier<Item> DIAMOND_SAW = ITEMS.register("diamond_saw", DiamondSaw::new);

    //Misc Materials
    public static final Supplier<Item> IRON_SAW_BLADE = ITEMS.register("iron_saw_blade", IronSawBlade::new);
    public static final Supplier<Item> DIAMOND_SAW_BLADE = ITEMS.register("diamond_saw_blade", DiamondSawBlade::new);
    public static final Supplier<Item> ENDER_CORE = ITEMS.register("ender_core", EnderCore::new);
    public static final Supplier<Item> OBSIDIAN_ROD = ITEMS.register("obsidian_rod", ObsidianRod::new);
    public static final Supplier<Item> NETHER_STAR_INGOT = ITEMS.register("nether_star_ingot", NetherStarIngot::new);
    public static final Supplier<Item> ENDER_INGOT = ITEMS.register("ender_ingot", EnderIngot::new);
    public static final Supplier<Item> ANCIENT_INGOT = ITEMS.register("ancient_ingot", AncientIngot::new);

}
