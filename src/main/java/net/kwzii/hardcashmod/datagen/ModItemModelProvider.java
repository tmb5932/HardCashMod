package net.kwzii.hardcashmod.datagen;

import net.kwzii.hardcashmod.HardCashMod;
import net.kwzii.hardcashmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

/**
 * Mod Item datagen class
 * @author Travis Brown
 */
public class ModItemModelProvider extends ItemModelProvider {
    /**
     * Constructor for mod item data gen
     * @param output PackOutput
     * @param existingFileHelper the existing file helper
     */
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, HardCashMod.MOD_ID, existingFileHelper);
    }

    /**
     * Method to register the custom mod item models
     */
    @Override
    protected void registerModels() {
        simpleItem(ModItems.DICE);
        simpleItem(ModItems.DOUBLE_DICE);

        simpleItem(ModItems.EMPTY_JAR);
        simpleItem(ModItems.MAGNETIC_INK);
        simpleItem(ModItems.BLACK_INK);
        simpleItem(ModItems.RED_INK);
        simpleItem(ModItems.BLUE_INK);
        simpleItem(ModItems.GREEN_INK);
        simpleItem(ModItems.PINK_INK);

        simpleItem(ModItems.BLACK_PAPER);
        simpleItem(ModItems.RED_PAPER);
        simpleItem(ModItems.BLUE_PAPER);
        simpleItem(ModItems.GREEN_PAPER);
        simpleItem(ModItems.PINK_PAPER);
        simpleItem(ModItems.DARK_RED_PAPER);

        simpleItem(ModItems.MAXWELL);

        simpleItem(ModItems.RAW_SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE);

        simpleItem(ModItems.METAL_DETECTOR);

        simpleItem(ModItems.DOLLAR_BILL);

    }

    /**
     * Method to create a simple item
     * @param item the custom mod item to be created
     * @return the ItemModelBuilder
     */
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(HardCashMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
