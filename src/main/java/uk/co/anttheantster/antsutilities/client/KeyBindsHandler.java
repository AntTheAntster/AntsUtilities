package uk.co.anttheantster.antsutilities.client;

import net.minecraft.client.Minecraft;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import uk.co.anttheantster.antsutilities.logic.OpenEnderChestGUI;
import uk.co.anttheantster.antsutilities.utils.ModSettings;

import static uk.co.anttheantster.antsutilities.client.KeyBinds.toggleRingKey;

public class KeyBindsHandler {

    @SubscribeEvent
    public void clientTick(PlayerTickEvent.Post event){
        Level level = event.getEntity().level();
        Player player = event.getEntity();


        if (toggleRingKey.consumeClick()) {
            ModSettings.isAngelRingToggled = !ModSettings.isAngelRingToggled;

            String status = ModSettings.isAngelRingToggled ? "§aEnabled" : "§cDisabled";
            player.displayClientMessage(Component.literal("§eRing " + status), true);
        }

        if (KeyBinds.openEchest.consumeClick()){
            OpenEnderChestGUI.openEChest(level, player);
        }
    }

}
