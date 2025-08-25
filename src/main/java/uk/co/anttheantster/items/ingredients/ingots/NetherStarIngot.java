package uk.co.anttheantster.items.ingredients.ingots;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import uk.co.anttheantster.AntsUtilities;

public class NetherStarIngot extends Item {

    private static final Properties properties = new Item.Properties();

    public NetherStarIngot() {
        super (properties
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "nether_star_ingot"))));
    }

}
