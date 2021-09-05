package superhelo.icrutils.api;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import superhelo.icrutils.recipe.FusionTableRecipe;

public class ICRUtilsAPI {

    public static final List<FusionTableRecipe> FUSION_TABLE_RECIPES = new ArrayList<>();

    public void addFusionTableRecipe(ResourceLocation name, Ingredient inputOne, Ingredient inputTwo, Ingredient inputThree, Ingredient inputFour, int time) {
        FUSION_TABLE_RECIPES.add(new FusionTableRecipe(ForgeRegistries.ENTITIES.getValue(name), inputOne, inputTwo, inputThree, inputFour, time));
    }
}
