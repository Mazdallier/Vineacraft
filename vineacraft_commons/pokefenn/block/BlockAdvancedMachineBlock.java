package pokefenn.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import pokefenn.Vineacraft;
import pokefenn.lib.Strings;
import pokefenn.lib.Textures;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockAdvancedMachineBlock extends Block {

	public BlockAdvancedMachineBlock(int id) {
		
		super(id, Material.rock);
		this.setUnlocalizedName(Strings.ADVANCED_MACHINE_BLOCK_NAME);
		this.setCreativeTab(Vineacraft.tabsVineac);
		this.setHardness(5F);
		
		
	}

	
	@SideOnly(Side.CLIENT)
	private Icon topIcon;
	@SideOnly(Side.CLIENT)
	private Icon sideIcon;
	@SideOnly(Side.CLIENT)
	private Icon bottomIcon;
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister register){
		topIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.ADVANCED_MACHINE_BLOCK_TOP);
		sideIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.ADVANCED_MACHINE_BLOCK_SIDE);
		bottomIcon = register.registerIcon(Textures.TEXTURE_LOCATION + ":" + Textures.ADVANCED_MACHINE_BLOCK_BOTTOM);
	
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public Icon getIcon(int side, int meta) {
		if(side == 0 ){
			return bottomIcon;
		}else if(side == 1) {
			return topIcon;
		}else{
			return sideIcon;
		}
		
		
		
		
		
	}
	
	
	
}
	 

