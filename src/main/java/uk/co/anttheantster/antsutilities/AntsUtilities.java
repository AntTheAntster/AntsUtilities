package uk.co.anttheantster.antsutilities;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import uk.co.anttheantster.antsutilities.blocks.ModBlocks;
import uk.co.anttheantster.antsutilities.client.KeyBindsHandler;
import uk.co.anttheantster.antsutilities.events.AngelRingEvent;
import uk.co.anttheantster.antsutilities.items.ModItems;
import uk.co.anttheantster.antsutilities.utils.ModCreativeTab;
import uk.co.anttheantster.antsutilities.utils.VersionChecker;

@Mod(AntsUtilities.MOD_ID)
public class AntsUtilities {
    public static final String MOD_ID = "antsutilities";
    public static final String version = "1.0.0";

    public AntsUtilities(IEventBus modEventBus, ModContainer modContainer)
    {
        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        setup(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @EventBusSubscriber(modid = MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            NeoForge.EVENT_BUS.register(new KeyBindsHandler());

            NeoForge.EVENT_BUS.register(VersionChecker.class);
        }
    }

    private void setup(IEventBus modEventBus){
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModCreativeTab.register(modEventBus);

        setupEvents();
    }

    private void setupEvents(){
        NeoForge.EVENT_BUS.register(new AngelRingEvent());
    }
}