package tdwp_ftw.biomesop.armor;

<<<<<<< HEAD
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
=======
>>>>>>> d1f496bd1b462de386858ec4c43c18d8914e6250
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.IArmorTextureProvider;
import tdwp_ftw.biomesop.mod_BiomesOPlenty;
import tdwp_ftw.biomesop.CommonProxy;

public class ArmorMuddy extends ItemArmor implements IArmorTextureProvider
{
	public int textureID = 0;
	
	public ArmorMuddy(int par1, EnumArmorMaterial par2EnumArmorMaterial, int par3, int par4) {
		super(par1, par2EnumArmorMaterial, par3, par4);
		textureID = par4;
	}
	
	public String getArmorTextureFile(ItemStack par1) {
		if(par1.itemID == mod_BiomesOPlenty.helmetMud.itemID||par1.itemID == mod_BiomesOPlenty.chestplateMud.itemID||par1.itemID == mod_BiomesOPlenty.bootsMud.itemID){
			return CommonProxy.ARMOR_MUD1_PNG;
		}
		if(par1.itemID == mod_BiomesOPlenty.leggingsMud.itemID){
			return CommonProxy.ARMOR_MUD2_PNG;
		}
		return null;
	}
<<<<<<< HEAD
	
    @Override
    @SideOnly(Side.CLIENT)
    public void updateIcons(IconRegister iconRegister) {

        iconIndex = iconRegister.registerIcon("biomesop" + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }
=======

	public void updateIcons(IconRegister iconRegister)
	{
    	if(textureID==0){ iconIndex = iconRegister.registerIcon("BiomesOPlenty:mudhelmet"); }
    	else if(textureID==1){ iconIndex = iconRegister.registerIcon("BiomesOPlenty:mudchestplate"); }
    	else if(textureID==2){ iconIndex = iconRegister.registerIcon("BiomesOPlenty:mudleggings"); }
    	else if(textureID==3){ iconIndex = iconRegister.registerIcon("BiomesOPlenty:mudboots"); }
    	else { iconIndex = iconRegister.registerIcon("BiomesOPlenty:mudball"); }
	}
>>>>>>> d1f496bd1b462de386858ec4c43c18d8914e6250
}
