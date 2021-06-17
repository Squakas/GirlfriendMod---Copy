package partner.mod.girlfriend.core.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import partner.mod.girlfriend.Girlfriend;

public class ItemInit {
		public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Girlfriend.MODID);
	
		public static final RegistryObject<Item> KISS = ITEMS.register("kiss",
				() -> new Item(new Item.Properties().tab(ItemGroup.TAB_DECORATIONS)));
				
		
}
