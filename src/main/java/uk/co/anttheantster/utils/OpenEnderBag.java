package uk.co.anttheantster.utils;

import net.minecraft.network.chat.Component;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.level.Level;

public class OpenEnderBag {

    public static void openEnderBag(Level level, Player player){

        if (!level.isClientSide){
            player.openMenu(new SimpleMenuProvider((id, inventory, playerEntity) ->
                    ChestMenu.threeRows(id, inventory, player.getEnderChestInventory()), Component.translatable("container.enderchest")));
        }

    }

}
