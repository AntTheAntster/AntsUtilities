package uk.co.anttheantster.items.ingredients;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import uk.co.anttheantster.AntsUtilities;

public class EnderCore extends Item {
    public EnderCore() {
        super (new Item.Properties()
                .stacksTo(16)
                .setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID,"ender_core"))));
    }

}
