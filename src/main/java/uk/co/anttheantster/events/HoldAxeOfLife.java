package uk.co.anttheantster.events;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodData;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import uk.co.anttheantster.items.ModItems;

public class HoldAxeOfLife {

    @SubscribeEvent
    public void holdingAxe(PlayerTickEvent.Post event) {
        Player player = event.getEntity();

        if (player.level().isClientSide) return;
        if (!player.getMainHandItem().is(ModItems.AXEOFLIFE.get())) return;

        var tag = player.getPersistentData();

        int c = tag.getInt("axe_of_life_timer").orElse(0) + 1;

        if (c >= 100) {
            c = 0;

            FoodData foodData = player.getFoodData();

            int newFood = foodData.getFoodLevel() + 2;
            foodData.setFoodLevel(newFood);

            float newSat = foodData.getSaturationLevel() + 2.0f;
            foodData.setSaturation(newSat);

            tag.putInt("axe_of_life_timer", 0);
            return;
        }

        tag.putInt("axe_of_life_timer", c);
    }

}
