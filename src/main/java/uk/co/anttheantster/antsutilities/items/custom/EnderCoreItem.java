package uk.co.anttheantster.antsutilities.items.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import uk.co.anttheantster.antsutilities.AntsUtilities;

public class EnderCoreItem extends Item {
    public EnderCoreItem() {
        super(new Item.Properties()
                .fireResistant()
                .rarity(Rarity.EPIC)
                .setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MOD_ID, "ender_core"))));
    }

}
