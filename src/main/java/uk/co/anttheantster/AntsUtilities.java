package uk.co.anttheantster;

import net.minecraft.client.Minecraft;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;
import uk.co.anttheantster.client.KeybindsHandler;
import uk.co.anttheantster.events.AngelRingEvent;
import uk.co.anttheantster.events.HoldAxeOfLife;
import uk.co.anttheantster.events.InteractEnderBag;
import uk.co.anttheantster.items.ModItems;
import uk.co.anttheantster.utils.ModCreativeTab;

@Mod(AntsUtilities.MODID)
public class AntsUtilities {
    public static final String MODID = "antsutilities";
    public static final Logger LOGGER = LogUtils.getLogger();

    public AntsUtilities(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);

        NeoForge.EVENT_BUS.register(this);

        setup(modEventBus);

    }

    private void commonSetup(FMLCommonSetupEvent event) {
        LOGGER.info("Hello {}!", Minecraft.getInstance().getUser().getName());
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
        LOGGER.info("Hello server!");
    }

    @EventBusSubscriber(modid = AntsUtilities.MODID, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            NeoForge.EVENT_BUS.register(new KeybindsHandler());
            //NeoForge.EVENT_BUS.register(VersionChecker.class);
        }
    }

    private void setup(IEventBus modEventBus) {
        ModItems.registerItems(modEventBus);
        ModCreativeTab.registerCreativeTab(modEventBus);

        registerEvents();
    }

    private void registerEvents(){
        NeoForge.EVENT_BUS.register(new AngelRingEvent());
        NeoForge.EVENT_BUS.register(new InteractEnderBag());
        NeoForge.EVENT_BUS.register(new HoldAxeOfLife());
    }
}
