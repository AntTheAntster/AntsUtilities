package uk.co.anttheantster.items.ingredients.sawblades;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import uk.co.anttheantster.AntsUtilities;

public class IronSawBlade extends AbstractSawBlade {

    public IronSawBlade() {
        super(properties
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, "iron_saw_blade"))));

    }

}
