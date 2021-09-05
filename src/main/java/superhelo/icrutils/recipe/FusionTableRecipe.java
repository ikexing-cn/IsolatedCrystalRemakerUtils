package superhelo.icrutils.recipe;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.registry.EntityEntry;

public class FusionTableRecipe {

    private final int time;
    private final EntityEntry entry;
    private final Ingredient CCTileInput1;
    private final Ingredient CCTileInput2;
    private final Ingredient CCTileInput3;
    private final Ingredient CCTileInput4;

    public FusionTableRecipe(EntityEntry entry, Ingredient input1, Ingredient input2, Ingredient input3, Ingredient input4, int time) {
        this.time = time;
        this.entry = entry;
        this.CCTileInput1 = input1;
        this.CCTileInput2 = input2;
        this.CCTileInput3 = input3;
        this.CCTileInput4 = input4;
    }

    public boolean matches(ItemStack input1, ItemStack input2, ItemStack input3, ItemStack input4) {
        List<Ingredient> stacks = new ArrayList<>();
        ItemStack[] inputs = new ItemStack[]{input1, input2, input3, input4};
        boolean[] unused = {true, true, true, true};

        for (int i = 0; i < inputs.length; i++) {
            ItemStack input = inputs[i];
            if (unused[0] && this.CCTileInput1.apply(input)) {
                stacks.add(CCTileInput1);
                unused[0] = false;
            } else if (unused[1] && this.CCTileInput2.apply(input)) {
                stacks.add(CCTileInput2);
                unused[1] = false;
            } else if (unused[2] && this.CCTileInput3.apply(input)) {
                stacks.add(CCTileInput3);
                unused[2] = false;
            } else if (unused[3] && this.CCTileInput4.apply(input)) {
                stacks.add(CCTileInput4);
                unused[3] = false;
            }
        }

        return stacks.size() == 4;
    }

    public EntityEntry getEntry() {
        return entry;
    }

    public int getTime() {
        return time;
    }

    public Ingredient getCCTileInputOne() {
        return CCTileInput1;
    }

    public Ingredient getCCTileInputTwo() {
        return CCTileInput2;
    }

    public Ingredient getCCTileInputThree() {
        return CCTileInput3;
    }

    public Ingredient getCCTileInputFour() {
        return CCTileInput4;
    }
}
