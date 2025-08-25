package uk.co.anttheantster.items.ingredients;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import uk.co.anttheantster.AntsUtilities;

public class ObsidianRod extends Item {
    public ObsidianRod(){
        super (new Item.Properties()
                .fireResistant()
                .setId(ResourceKey.create(Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "obsidian_rod"))));
    }



}
