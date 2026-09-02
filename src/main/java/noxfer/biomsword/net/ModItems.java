package noxfer.biomsword.net;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class ModItems {
    private static Object BuiltInRegistries;

    public static Item register(Item item, String id) {
        // Create the identifier for the item.
        Object ExampleMod = null;
        ResourceLocation itemID = ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, id);

        // Register the item.
        Item registeredItem = Registry.register(BuiltInRegistries.ITEM, itemID, item);

        // Return the registered item!
        return registeredItem;
    }