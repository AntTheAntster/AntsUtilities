package uk.co.anttheantster.items.equipment.bags;

import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.component.ItemContainerContents;
import net.minecraft.world.level.Level;
import uk.co.anttheantster.menus.bags.BagMenu;
import uk.co.anttheantster.utils.ModTags;

public class AbstractBag extends Item {

    public static Properties properties = new Item.Properties();
    private final int slots;

    public AbstractBag(Item.Properties properties, int slots) {
        super(properties
                .stacksTo(1)
                .fireResistant()
                .rarity(Rarity.EPIC));
        this.slots = slots;
    }

    public SimpleContainer createLiveContainer(ItemStack stack) {
        var cont = new SimpleContainer(slots) {
            @Override public void setChanged() {
                super.setChanged();
                stack.set(DataComponents.CONTAINER, ItemContainerContents.fromItems(this.getItems()));
            }
        };
        stack.getOrDefault(DataComponents.CONTAINER, ItemContainerContents.EMPTY).copyInto(cont.getItems());
        return cont;
    }

    public int getSlots() { return slots; }

    // Boolean to easily block bag-ception. (Bags in bags)
    public static boolean isBag(ItemStack itemStack) {
        return itemStack.is(ModTags.Items.BAGS);
    }

    @Override
    public InteractionResult use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getUseItem();

        if (!level.isClientSide && player instanceof ServerPlayer serverPlayer) {
            serverPlayer.openMenu(new SimpleMenuProvider(
                    (id, inv, p) -> new BagMenu(id, inv, stack),
                    Component.translatable("menu.bag_title")
            ), registryFriendlyByteBuf -> registryFriendlyByteBuf.writeEnum(hand));
        }


        return super.use(level, player, hand);
    }
}
