package com.enderdevelopment.spellbookmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SpellbookMod implements ModInitializer {
    public static final String MOD_ID = "spellbook_mod";
    public static final Item SPELLBOOK = new SpellbookItem(new Item.Settings().maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registries.ITEM, new Identifier(MOD_ID, "spellbook"), SPELLBOOK);
    }
}