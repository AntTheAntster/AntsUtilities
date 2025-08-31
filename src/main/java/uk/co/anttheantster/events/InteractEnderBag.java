package uk.co.anttheantster.events;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import uk.co.anttheantster.items.ModItems;
import uk.co.anttheantster.items.equipment.bags.AbstractBag;
import uk.co.anttheantster.menus.bags.BagMenu;
import uk.co.anttheantster.utils.ModTags;
import uk.co.anttheantster.utils.OpenEnderBag;

public class InteractEnderBag {

    @SubscribeEvent
    public void useItem(PlayerInteractEvent.RightClickItem event){

        Player player = event.getEntity();
        Level level = player.level();

        if (event.getItemStack().getItem().equals(ModItems.ENDER_BAG.get())) {

            OpenEnderBag.openEnderBag(level, player);

        }

        if (event.getItemStack().getItem() instanceof AbstractBag){
            ItemStack stack = event.getItemStack();

            if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
                serverPlayer.openMenu(new SimpleMenuProvider(
                        (id, inv, p) -> new BagMenu(id, inv, stack),
                        Component.translatable("menu.bag_title")
                ), registryFriendlyByteBuf -> registryFriendlyByteBuf.writeEnum(event.getHand()));
            }
        }

    }

}
