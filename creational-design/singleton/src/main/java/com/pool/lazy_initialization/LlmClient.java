package com.pool.lazy_initialization;

public class LlmClient {

    private LlmConfiguration llmConfiguration = null;

    private LlmClient(){
        llmConfiguration = new LlmConfiguration("gpt-4", 1000, 0.7, "https://api.openai.com/v1/chat/completions");
    }

    private static class LlmClientHelper{
        static final LlmClient llmClient=new LlmClient();
    }

    public static LlmClient getLlmClient(){
        return LlmClientHelper.llmClient;
    }
    public LlmConfiguration getLlmConfiguration() {
        return llmConfiguration;
    }
}
