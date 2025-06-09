package uk.co.anttheantster.antsutilities.blocks.custom;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import uk.co.anttheantster.antsutilities.AntsUtilities;

public class WorktableBlock extends Block {

    public WorktableBlock() {
        super (BlockBehaviour.Properties.of()
                .strength(2.5f)
                .requiresCorrectToolForDrops()
                .setId(ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(AntsUtilities.MOD_ID, "worktable"))));
    }




}
