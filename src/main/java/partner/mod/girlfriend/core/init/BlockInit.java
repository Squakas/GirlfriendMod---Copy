package partner.mod.girlfriend.core.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import partner.mod.girlfriend.Girlfriend;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
			Girlfriend.MODID);

	public static final RegistryObject<Block> Flower = BLOCKS.register("Flower",
			() -> new Block(AbstractBlock.Properties.of(Material.PLANT).instabreak().sound(SoundType.CROP)));
}
