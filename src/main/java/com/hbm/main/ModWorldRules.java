package com.hbm.main;

import dev.golem.core.world.WorldRules;
import dev.golem.core.world.WorldRules.BoolRule;

public final class ModWorldRules {

    private ModWorldRules() {}

    public static final BoolRule ZIRNOX_DISABLE_MELTDOWNS = WorldRules.bool("zirnoxDisableMeltdowns", false);
    public static final BoolRule PWR_DISABLE_MELTDOWNS = WorldRules.bool("pwrDisableMeltdowns", false);

    // public static final BoolRule ... = WorldRules.bool("...", false);

    public static void init() {}
}
