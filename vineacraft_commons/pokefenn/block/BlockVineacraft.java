package pokefenn.block;

import pokefenn.tileentity.TileVineacraft;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeDirection;

public abstract class BlockVineacraft extends BlockContainer {

    
    public BlockVineacraft(int id, Material material) {
        
        super(id, material);
    }
    
    /*
    
    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entityLiving, ItemStack itemStack) {

        int direction = 0;
        int facing = MathHelper.floor_double(entityLiving.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;

        if (facing == 0) {
            direction = ForgeDirection.NORTH.ordinal();
        }
        else if (facing == 1) {
            direction = ForgeDirection.EAST.ordinal();
        }
        else if (facing == 2) {
            direction = ForgeDirection.SOUTH.ordinal();
        }
        else if (facing == 3) {
            direction = ForgeDirection.WEST.ordinal();
        }

        world.setBlockMetadataWithNotify(x, y, z, direction, 3);

        if (itemStack.hasDisplayName()) {
            ((TileVineacraft) world.getBlockTileEntity(x, y, z)).setCustomName(itemStack.getDisplayName());
        }

        ((TileVineacraft) world.getBlockTileEntity(x, y, z)).setOrientation(direction);
    }
*/

}
 
 
 