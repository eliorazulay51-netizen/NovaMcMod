package com.NovaMC.GeminiAiMod;

import net.minecraftentity.passive.EntityVillager;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class VillagerTalkHandler {

    @SubscribeEvent
    public void onVillagerInteract(PlayerInteractEvent.EntityInteract event) {
        if (event.getTarget() instanceof EntityVillager) {
            // This is where we call your MaizenAI code to make JJ speak!
            MaizenAI.handleTalkingVillager();

            // Cancel the normal trading menu so JJ can talk instead
            event.setCanceled(true);
        }
    }
}