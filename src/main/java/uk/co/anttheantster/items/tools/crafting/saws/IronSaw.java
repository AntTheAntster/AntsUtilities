package uk.co.anttheantster.items.tools.crafting.saws;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import uk.co.anttheantster.AntsUtilities;

public class IronSaw extends AbstractSaw {

    private static final Properties isProperties = properties;

    public IronSaw() {
        super(isProperties
                .durability(50)
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "iron_saw"))));
    }

}