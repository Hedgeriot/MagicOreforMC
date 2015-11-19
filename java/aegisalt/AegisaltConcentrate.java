package tutorial;



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



@Mod(modid = Tutorial.modid, name = "basic tutorial", version = "1.0")

public class Tutorial

{

       public static final String modid = "tutorial"; 
       public static Block tutorialBlock;
       public static Item tutorialItem;

       @EventHandler

       public void load(FMLInitializationEvent event)

       {

    	   // Instantiate your custom block - this mean make an instance of the class

       	AegisaltOreBlock = new AegisaltOre();
       	AegisaltDust = new AegisaltDust();

    	   

       	// Register your custom block with Minecraft

             GameRegistry.registerBlock(tutorialBlock, modid + tutorialBlock.getUnlocalizedName().substring(5));
             GameRegistry.registerItem(tutorialItem, modid + tutorialItem.getUnlocalizedName().substring(5));
             GameRegistry.addShapedRecipe(new ItemStack(tutorialItem),

            "III",
            "ISI",
            "ISI",

            'I', new ItemStack(Items.iron_ingot),
            'S', new ItemStack(Items.stick));

            }
		}