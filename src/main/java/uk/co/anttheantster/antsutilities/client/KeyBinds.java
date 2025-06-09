package uk.co.anttheantster.antsutilities.client;

import com.mojang.blaze3d.platform.InputConstants;
import net.minecraft.client.KeyMapping;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterKeyMappingsEvent;
import net.neoforged.neoforge.client.settings.KeyConflictContext;
import uk.co.anttheantster.antsutilities.AntsUtilities;

@EventBusSubscriber(modid = AntsUtilities.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class KeyBinds {
    public static final KeyBinds INSTANCE = new KeyBinds();
    private KeyBinds() {}
    private static final String CATEGORY = "Ant's Utilities";

    @SubscribeEvent
    public static void registerKeys(RegisterKeyMappingsEvent event) {
        event.register(openEchest);
        event.register(toggleRingKey);
    }


    public static final KeyMapping openEchest = new KeyMapping(
            "key.antsutilities.open_ender_bag", KeyConflictContext.IN_GAME, InputConstants.getKey(InputConstants.KEY_L, -1),
            CATEGORY
    );

    public static final KeyMapping toggleRingKey = new KeyMapping(
            "key.antsutilities.toggle_angel_ring", KeyConflictContext.IN_GAME,
            InputConstants.getKey(InputConstants.KEY_V, -1), CATEGORY
    );
}
