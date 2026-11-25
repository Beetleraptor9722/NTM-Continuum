package com.hbm.blocks;

import com.hbm.Constants;
import com.hbm.registration.Reg;
import com.hbm.items.machine.ItemPWRFuel.EnumPWRFuel;
import dev.golem.core.registry.DeferredRegister;
import dev.golem.core.registry.RegistryObject;
import dev.golem.core.world.WorldRules;
import dev.golem.core.world.WorldRules.BoolRule;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvent;
import com.hbm.inventory.ModPwrMenus;
import com.hbm.items.ModPwrItems;
import com.hbm.tileentity.ModPwrBlockEntities;

/** One common bootstrap hook for the pressurized water reactor's feature-local registries. */
public final class ModPwrContent {
    public static final BoolRule DISABLE_MELTDOWNS = WorldRules.bool("pwrDisableMeltdowns", false);
    private ModPwrContent() {}

    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, Constants.MOD_ID);
    private static final Reg REG = Reg.of(SOUNDS);

    /** 1.7 {@code NTMSounds.REACTOR_GEIGER_LOOP} ({@code hbm:block.reactorLoop}), the loaded-core loop. */
    public static final RegistryObject<SoundEvent> REACTOR_LOOP = REG.sound("block.reactor_loop");

    public static void init() {
        ModPwrBlocks.init();
        ModPwrItems.init();
        ModPwrBlockEntities.init();
        ModPwrMenus.init();
    }

    // 1.7 HazardRegistry.registerPWRFuel (fresh rod = twice its billet, hot and depleted ten times that, hot also HOT 5)
    // is the hbm:hazards item data map.
}
