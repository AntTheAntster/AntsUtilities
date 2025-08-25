package uk.co.anttheantster.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import uk.co.anttheantster.AntsUtilities;

@EventBusSubscriber (modid = AntsUtilities.MODID, value = Dist.CLIENT)
public class Keybinds {

    public static final Keybinds INSTANCE = new Keybinds();
    private Keybinds() {}
    private static final String CATEGORY = "Ant's Utilities";

    @SubscribeEvent
    public static void registerKeyss(RegisterKeyMappingsEvent event){
        event.register(openEnderBag);
        event.register(toggleAngelRing);
        event.register(testKey);
    }

    public static final KeyMapping openEnderBag = new KeyMapping("key.antsutilities.open_ender_bag",
            KeyConflictContext.IN_GAME, InputConstants.getKey(InputConstants.KEY_L, -1), CATEGORY);

    public static final KeyMapping toggleAngelRing = new KeyMapping("key.antsutilities.toggle_angel_ring",
            KeyConflictContext.IN_GAME, InputConstants.getKey(InputConstants.KEY_V, -1), CATEGORY);

    public static final KeyMapping testKey = new KeyMapping("key.antsutilities.test",
            KeyConflictContext.IN_GAME, InputConstants.getKey(InputConstants.KEY_H, -1), CATEGORY);
}
