package uk.co.anttheantster.antsutilities.logic;

import net.minecraft.network.chat.Component;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.Level;

public class OpenEnderChestGUI {

    public static void openEChest(Level level, Player player){

        if (!level.isClientSide()) {
            player.openMenu(new SimpleMenuProvider(
                    (id, inventory, playerEntity) -> ChestMenu.threeRows(id, inventory, player.getEnderChestInventory()),
                    Component.translatable("container.enderchest")
            ));
        }

    }

}
