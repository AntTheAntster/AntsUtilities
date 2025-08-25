package uk.co.anttheantster.events;

import net.minecraft.world.entity.player.Player;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import uk.co.anttheantster.items.ModItems;
import uk.co.anttheantster.utils.ModSettings;

public class AngelRingEvent {
    @SubscribeEvent
    public void useAngelRing(PlayerTickEvent.Post event){
        Player player = event.getEntity();
        if (player.isCreative() || player.isSpectator()) return;

        boolean hasAngelRing = player.getInventory().contains(ModItems.ANGEL_RING.get().getDefaultInstance());

        if  (hasAngelRing && ModSettings.isAngelRingToggled) {
            startFlight(player);
        } else {
            stopFlight(player);
        }
    }


    private static void startFlight(Player player){
        player.getAbilities().mayfly = true;
        player.onUpdateAbilities();
    }
    private static void stopFlight(Player player){
        player.getAbilities().mayfly = false;
        player.onUpdateAbilities();
    }

}
