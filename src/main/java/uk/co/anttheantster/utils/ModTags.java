package uk.co.anttheantster.utils;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import uk.co.anttheantster.AntsUtilities;

public class ModTags {

    public static class Items {
        public static final TagKey<Item> SAWS = createTag("saws");
        public static final TagKey<Item> BAGS = createTag("bags");

        private static TagKey<Item> createTag(String name) {
            return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MODID, name));
        }
    }

}
