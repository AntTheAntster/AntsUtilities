package uk.co.anttheantster.items.equipment.bags;

import net.minecraft.network.chat.Component;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import org.jetbrains.annotations.Nullable;

public class AbstractBag extends Item implements MenuProvider {

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

    @Override
    public Component getDisplayName() {
        return Component.literal("Bag");
    }

    @Override
    public @Nullable AbstractContainerMenu createMenu(int i, Inventory inventory, Player player) {
        return ;
    }
}
