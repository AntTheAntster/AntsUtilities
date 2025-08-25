package uk.co.anttheantster.events;

import net.minecraft.network.chat.Component;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import uk.co.anttheantster.items.ModItems;
import uk.co.anttheantster.utils.OpenEnderBag;

public class InteractEnderBag {

    @SubscribeEvent
    public void useEnderBag(PlayerInteractEvent.RightClickItem event){

        Player player = event.getEntity();
        Level level = player.level();

        if (event.getItemStack().getItem().equals(ModItems.ENDER_BAG.get())) {

            OpenEnderBag.openEnderBag(level, player);

        }

    }

}
