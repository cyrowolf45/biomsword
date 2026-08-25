package noxfer.biomsword.net.item;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import noxfer.biomsword.net.BIomSword;

public class ModItems {

    public static final Item RUBY = registerItem(
            "ruby",
            new Item(new Item.Properties())
    );

    private static Item registerItem(String name, Item item) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(
                BIomSword.MOD_ID,
                name
        );

        return Registry.register(
                BuiltInRegistries.ITEM,
                id,
                item
        );
    }

    public static void registerModItems() {
        BIomSword.LOGGER.info(
                "Registering mod items for " + BIomSword.MOD_ID
        );
    }
}