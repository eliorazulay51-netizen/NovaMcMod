package com.NovaMC.GeminiAiMod;

import java.util.Arrays;

public class MaizenAI {
    // This is where your API Key and JJ's personality will go
    private static final String SYSTEM_PROMPT = "You are JJ from Maizen. You are energetic, friendly, and love Minecraft adventures!";

    public static void handleTalkingVillager() {
        String apiKey = "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"; // Put your real key here
        OpenAiService service = new OpenAiService(apiKey);

        ChatCompletionRequest request = ChatCompletionRequest.builder()
                .model("gpt-3.5-turbo")
                .messages(Arrays.asList(
                        new ChatMessage("system", SYSTEM_PROMPT),
                        new ChatMessage("user", "Someone just clicked on you! Say something energetic!")
                ))
                .build();

        String response = service.createChatCompletion(request).getChoices().get(0).getMessage().getContent();

        // This sends the AI's words to the Minecraft chat
        Object Minecraft = null;
        Minecraft.getMinecraft().player.sendMessage(new TextComponentString("§e[JJ]: §f" + response));
    }