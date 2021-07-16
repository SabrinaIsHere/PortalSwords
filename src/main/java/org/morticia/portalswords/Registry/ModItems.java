package org.morticia.portalswords.Registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import org.morticia.portalswords.Morticia.portalswords;
import org.morticia.portalswords.items.Firestalker;
import org.morticia.portalswords.items.PortalSwordToolMaterial;
import org.morticia.portalswords.items.Riftstalker;

public class ModItems {
    // Swords
    public static Firestalker FIRESTALKER = new Firestalker(new PortalSwordToolMaterial(), 5, -2.0F, new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof().rarity(Rarity.EPIC));
    public static Riftstalker RIFTSTALKER = new Riftstalker(new PortalSwordToolMaterial(), 3, -2.0F, new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof().rarity(Rarity.EPIC));

    // Crafting Materials
    public static Item REINFORCEDHANDLE = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());
    public static Item REINFORCEDHANDGUARD = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());
    public static Item RIFTBLADE = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());

    public static Item FIERYHANDLE = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());
    public static Item FIERYHANDGUARD = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());
    public static Item HELLBLADE = new Item(new Item.Settings().group(ModGroups.PORTAL_SWORDS_ITEM_GROUP).fireproof());

    public static void initItems() {
        // Swords
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "firestalker"), FIRESTALKER);
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "riftstalker"), RIFTSTALKER);

        // Crafting Materials
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "reinforced_handle"), REINFORCEDHANDLE);
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "reinforced_hand_guard"), REINFORCEDHANDGUARD);
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "rift_blade"), RIFTBLADE);

        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "fiery_handle"), FIERYHANDLE);
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "fiery_handguard"), FIERYHANDGUARD);
        Registry.register(Registry.ITEM, new Identifier(portalswords.MOD_ID, "hell_blade"), HELLBLADE);
    }
}
