package uk.co.anttheantster.items.tools.crafting.saws;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public abstract class AbstractSaw extends Item {

    public static Properties properties = new Item.Properties();

    public AbstractSaw(Item.Properties properties) {
        super(properties);
    }

    //Take 1 durability off the tool in the crafting grid
    @Override
    public ItemStack getCraftingRemainder(ItemStack itemStack) {
        //Copy the item
        ItemStack newStack = itemStack.copy();
        //Make sure there is only 1 Item of itself
        newStack.setCount(1);
        //Get current damage and add 'x' to the damage (Remove 'x' durability)
        int newDamage = newStack.getDamageValue() + 1;
        //Check if durability is lower than 0 and if it is, delete the item.
        if (newDamage > newStack.getMaxDamage()) {
            return ItemStack.EMPTY;
        }
        //Set damage value to the item copy
        newStack.setDamageValue(newDamage);
        //Return the item copy
        return newStack;
    }
}
