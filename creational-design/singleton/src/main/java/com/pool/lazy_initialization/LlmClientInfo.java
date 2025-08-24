package com.pool.lazy_initialization;

public class LlmClientInfo {
    public static void main(String[] args) {
        LlmClient llmClientOne = LlmClient.getLlmClient();
        LlmClient llmClientTwo = LlmClient.getLlmClient();
        System.out.println("LlmClient One HashCode: " + llmClientOne.hashCode());
        System.out.println("LlmClient Two HashCode: " + llmClientTwo.hashCode());
        if (llmClientOne == llmClientTwo) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("References point to different instances.");
        }

        LlmConfiguration llmConfigurationOne = llmClientOne.getLlmConfiguration();
        LlmConfiguration llmConfigurationTwo = llmClientTwo.getLlmConfiguration();
        System.out.println("LlmConfiguration One HashCode: " + llmConfigurationOne.hashCode());
        System.out.println("LlmConfiguration Two HashCode: " + llmConfigurationTwo.hashCode());
        if (llmConfigurationOne == llmConfigurationTwo) {
            System.out.println("Both references point to the same instance.");
        } else {
            System.out.println("References point to different instances.");
        }
    }
}
