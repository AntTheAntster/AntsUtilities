package uk.co.anttheantster.menus;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredRegister;
import uk.co.anttheantster.AntsUtilities;
import uk.co.anttheantster.menus.bags.BagMenu;

import java.util.function.Supplier;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, AntsUtilities.MODID);

    public static final Supplier<MenuType<BagMenu>> BAG_MENU =
            MENUS.register("bag", () ->
                    new MenuType<>(
                            (int windowId, Inventory inv, FriendlyByteBuf buf) -> {
                                // Read whatever you wrote when opening (example: which hand)
                                InteractionHand hand = buf.readEnum(InteractionHand.class);
                                ItemStack bag = inv.player.getItemInHand(hand);
                                return new BagMenu(windowId, inv, bag);
                            },
                            FeatureFlags.VANILLA_SET
                    )
            );

}
