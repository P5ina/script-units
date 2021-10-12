package com.p5ina.script_units;

import com.p5ina.script_units.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class ScriptUnits implements ModInitializer {

    public static final String MOD_ID = "scru";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
