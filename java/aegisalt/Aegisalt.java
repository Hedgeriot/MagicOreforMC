package aegisalt;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
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
            
            GameRegistry.addShapedRecipe(new ItemStack(AegisaltDust), //This meantion of AegisaltDust is what the recipe will need
            
            "AAA",
            "AAA",
            "AAA",
            
            'A', new ItemStack(Aegisalt.AegisaltDust)); //This is the required input for the recipe
  
      }
	
}
