package aegisalt;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemEnderPearl;

//This is an item that is basically an ender pearl

public class AegisaltDust extends ItemEnderPearl {

	public AegisaltDust () {  
    	super();
        this.setMaxStackSize(16);
        this.setUnlocalizedName("aegisaltdust");
        setCreativeTab(CreativeTabs.tabMisc);
        this.setTextureName(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5));
   
	}
	
	
	@SideOnly(Side.CLIENT)
	
	public void registerItemIcon(IIconRegister iconRegister) {
		this.itemIcon = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5));
		
	}
	
}
