package superhelo.icrutils.handlers;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.block.Block;
import superhelo.icrutils.blocks.CeremonialColumn;
import superhelo.icrutils.blocks.FusionTable;

public class BlockHandler {

    public static final List<Block> BLOCK_REGISTER = new ArrayList<>();

    public static final Block CEREMONIAL_COLUMN = new CeremonialColumn("ceremonial_column");

    public static final Block FUSION_TABLE = new FusionTable("fusion_table");

}
