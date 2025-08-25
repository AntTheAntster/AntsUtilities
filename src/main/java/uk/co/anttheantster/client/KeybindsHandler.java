package uk.co.anttheantster.client;

import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import uk.co.anttheantster.utils.OpenEnderBag;
import uk.co.anttheantster.utils.ModSettings;

public class KeybindsHandler {

    @SubscribeEvent
    public void clientTick(PlayerTickEvent.Post event){
        Player player = event.getEntity();
        Level level = player.level();

        if (Keybinds.toggleAngelRing.consumeClick()){
            ModSettings.isAngelRingToggled = !ModSettings.isAngelRingToggled;

            String status = ModSettings.isAngelRingToggled ? "§aEnabled" : "§cDisabled";
            player.displayClientMessage(Component.literal("§eRing " + status), true);
        }

        if (Keybinds.openEnderBag.consumeClick()){
            OpenEnderBag.openEnderBag(level, player);
        }

        if (Keybinds.testKey.consumeClick()){
            player.getFoodData().setFoodLevel(10);
            player.getFoodData().setSaturation(0);
        }
    }

}
