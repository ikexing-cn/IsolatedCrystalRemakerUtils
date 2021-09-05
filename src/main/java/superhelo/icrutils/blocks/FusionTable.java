package superhelo.icrutils.blocks;

import javax.annotation.Nullable;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import superhelo.icrutils.tileentity.TileFusionTable;

public class FusionTable extends BlockBase implements ITileEntityProvider {

    public FusionTable(String registryName) {
        super(Material.ROCK, registryName);
        this.setHardness(5.0f);
    }

    @Nullable
    @Override
    public TileEntity createNewTileEntity(World worldIn, int meta) {
        return new TileFusionTable();
    }
}
