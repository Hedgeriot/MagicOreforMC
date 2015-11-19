//package aegisalt;
//
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;
//import net.minecraft.client.renderer.texture.IIconRegister;
//import net.minecraft.creativetab.CreativeTabs;
//import net.minecraft.entity.Entity;
//import net.minecraft.entity.EntityLivingBase;
//import net.minecraft.entity.player.EntityPlayerMP;
//import net.minecraft.entity.projectile.EntityThrowable;
//import net.minecraft.util.DamageSource;
//import net.minecraft.util.MovingObjectPosition;
//import net.minecraft.world.World;
//import net.minecraftforge.common.MinecraftForge;
//import net.minecraftforge.event.entity.living.EnderTeleportEvent;
//import net.minecraft.item.ItemEnderPearl;
//import aegisalt.MagicDust;
//
//public class AegisaltWand extends MagicDust {
//	
//	public AegisaltWand(World p_i1782_1_) {
//		super(p_i1782_1_);
//		// TODO Auto-generated constructor stub
//		
//		//Added from AegisaltDust
//		this.setMaxStackSize(1);
//        this.setUnlocalizedName("aegisaltdust");
//        setCreativeTab(CreativeTabs.tabMisc);
//        this.setTextureName(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5));
//   
//	}
//	
//	
//	@SideOnly(Side.CLIENT)
//	
//	public void registerItemIcon(IIconRegister iconRegister) {
//		this.itemIcon = iconRegister.registerIcon(Aegisalt.modid + ":" + this.getUnlocalizedName().substring(5));
//		
//	}
//	}
//	
//}

