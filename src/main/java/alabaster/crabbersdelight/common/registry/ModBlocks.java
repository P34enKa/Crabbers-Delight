package alabaster.crabbersdelight.common.registry;

import alabaster.crabbersdelight.CrabbersDelight;
import alabaster.crabbersdelight.common.block.CrabTrapBlock;
import alabaster.crabbersdelight.common.block.NautilusShellBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CrabbersDelight.MODID);

    // CrabEntity Trap
    public static final RegistryObject<Block> CRAB_TRAP = BLOCKS.register("crab_trap",
            () -> new CrabTrapBlock(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    // Storage
    public static final RegistryObject<Block> CRAB_BARREL = BLOCKS.register("crab_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CLAM_BARREL = BLOCKS.register("clam_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> CLAWSTER_BARREL = BLOCKS.register("clawster_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SHRIMP_BARREL = BLOCKS.register("shrimp_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> COD_BARREL = BLOCKS.register("cod_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> SALMON_BARREL = BLOCKS.register("salmon_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> PUFFERFISH_BARREL = BLOCKS.register("pufferfish_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> TROPICAL_FISH_BARREL = BLOCKS.register("tropical_fish_barrel",
            () -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    //public static final RegistryObject<Block> LANTERNFISH_BARREL = BLOCKS.register("lanternfish_barrel",
            //() -> new Block(Block.Properties.copy(Blocks.OAK_PLANKS).strength(2.0F, 3.0F).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> NAUTILUS_SHELL_BLOCK = BLOCKS.register("nautilus_shell_block",
            () -> new NautilusShellBlock(Block.Properties.copy(Blocks.PRISMARINE).strength(2.0F, 3.0F).sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> PEARL_BLOCK = BLOCKS.register("pearl_block",
            () -> new Block(Block.Properties.copy(Blocks.PRISMARINE).strength(2.0F, 3.0F).sound(SoundType.CORAL_BLOCK)));

    // Feast
}