package aegisalt;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class AegisaltOre extends Block {

    public AegisaltOre()
    {
 	   super(Material.iron);
        this.setBlockName("aegisalt");
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setHardness(3F);
        this.setHarvestLevel("pickaxe", 2);
        this.setStepSound(soundTypeStone);
    
    }
        
    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random p_149745_1_)
    {
        return 4;
    }

    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Aegisalt.AegisaltDust;
    }
    
    
    // Overloaded constructor that gives the option to set a material
//    public AegisaltOre(Material Aegisalt) {
// 	   super(Aegisalt);
// 	   setBlockName("Aegisalt Block");
//        setCreativeTab(CreativeTabs.tabBlock);
//    
//    }
    
    // Declare a variable for the texture for each side of the new block
	   @SideOnly(Side.CLIENT)
	   private IIcon topTexture;
	   private IIcon southTexture;
	   private IIcon northTexture;
	   private IIcon eastTexture;
	   private IIcon westTexture;
	   private IIcon bottomTexture;
	   // Set the values for each of the texture variables
    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister iconRegister) {
 	   this.blockIcon = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5));
 	   this.topTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_top");
 	   this.southTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_south");
 	   this.northTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_north");
 	   this.eastTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_east");
 	   this.westTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_west");
 	   this.bottomTexture = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5) + "_bottom");
    }
    
    // Block faces: 0 is bottom - 1 is top - 2 is north - 3 is south - 4 is west - 5 is east
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta) {
 	   if (side == 1) {
 		   return this.topTexture;
 	   } else if (side==2) {
 		   return this.northTexture;
 	   } else if (side==3) {
 		   return this.southTexture;
 	   } else if (side==4) {
 		   return this.westTexture;
 	   } else if (side==5) {
 		   return this.eastTexture;
 	   } else if (side==0) {
 		   return this.bottomTexture;
 	   }
 	   return blockIcon;
    }
    
}
	

