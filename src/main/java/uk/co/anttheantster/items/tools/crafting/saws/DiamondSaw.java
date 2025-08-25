package uk.co.anttheantster.items.tools.crafting.saws;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import uk.co.anttheantster.AntsUtilities;

public class DiamondSaw extends AbstractSaw {

    private static final Properties dsProperties = properties;

    public DiamondSaw() {
        super (dsProperties
                .durability(100)
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "diamond_saw"))));
    }
}
