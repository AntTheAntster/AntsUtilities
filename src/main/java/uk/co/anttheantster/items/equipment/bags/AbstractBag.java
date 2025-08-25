package uk.co.anttheantster.items.equipment.bags;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class AbstractBag extends Item {

    public static Properties properties = new Item.Properties();

    public AbstractBag(Item.Properties properties) {
        super(properties
                .stacksTo(1)
                .fireResistant()
                .rarity(Rarity.EPIC));
    }

    @Override
    public boolean canFitInsideContainerItems() {
        return false;
    }
}
