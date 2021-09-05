package superhelo.icrutils.tileentity;

import javax.annotation.Nonnull;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.math.BlockPos;
import superhelo.icrutils.recipe.FusionTableRecipe;

public class TileFusionTable extends TileEntityBase implements ITickable {

    private int processTime;

    public TileFusionTable() {
        super("fusion_able");
    }

    private static FusionTableRecipe matchRecipe(ItemStack inputOne, ItemStack inputTwo, ItemStack inputThree, ItemStack inputFour) {
        return null;
    }

    @Override
    public void update() {

    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        this.processTime = compound.getInteger("ProcessTime");
        super.readFromNBT(compound);
    }

    @Nonnull
    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("ProcessTime", processTime);
        return super.writeToNBT(compound);
    }

    private TileEntityCeremonialColumn[] getCCTileEntity() {
        TileEntityCeremonialColumn[] tiles = new TileEntityCeremonialColumn[4];

        for (int i = 0; i < EnumFacing.HORIZONTALS.length; i++) {
            EnumFacing facing = EnumFacing.HORIZONTALS[i];
            BlockPos pos = this.getPos().offset(facing, 3);
            TileEntity tile = this.world.getTileEntity(pos);

            if (!(tile instanceof TileEntityCeremonialColumn)) {
                return null;
            }

            tiles[i] = (TileEntityCeremonialColumn) tile;
        }

        return tiles;
    }
}
