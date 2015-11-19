package aegisalt;

//import tutorial.BlockTutorialBlock;
//import tutorial.ItemTutorialItem;
//import tutorial.Tutorial;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

@Mod(modid = Aegisalt.modid, name = "Aegisalt Mod", version = "1.0")
public class Aegisalt {

	  public static final String modid = "Aegisalt"; 
      public static Block AegisaltOreBlock;
      public static Item AegisaltDust;
      
      
      @EventHandler
      public void load(FMLInitializationEvent event)
      {
   	
            // Instantiate your custom block - this mean make an instance of the class
   	   	 AegisaltOreBlock = new AegisaltOre();
   	   	 AegisaltDust = new AegisaltDust();
   	   	 
   	   	 
   	   	 // Register your custom block or item with Minecraft
            GameRegistry.registerBlock(AegisaltOreBlock, modid + AegisaltOreBlock.getUnlocalizedName().substring(5));
            GameRegistry.registerItem(AegisaltDust, modid + AegisaltDust.getUnlocalizedName().substring(5));
  
      }
	
}
