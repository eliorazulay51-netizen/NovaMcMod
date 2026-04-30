package com.NovaMC.GeminiAiMod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(modid = "geminiaimod", name = "GeminiAiMod", version = "1.0")
public class GeminiAiMod {

    @Mod.EventHandler
    public void init(Object o) {
        init(null);
    @Mod.EventHandler
    public void init(MaizenAI Object event;
        event) {
        // This tells Minecraft to listen for our custom JJ "brain" events
        MinecraftForge.EVENT_BUS.register(new VillagerTalkHandler());
    }
}