package com.pool.lazy_initialization;

public class LlmConfiguration {
    private String modelName;
    private int maxTokens;
    private double temperature;
    private String baseUrl;

    public LlmConfiguration(String modelName, int maxTokens, double temperature, String baseUrl) {
        this.modelName = modelName;
        this.maxTokens = maxTokens;
        this.temperature = temperature;
        this.baseUrl = baseUrl;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMaxTokens() {
        return maxTokens;
    }

    public void setMaxTokens(int maxTokens) {
        this.maxTokens = maxTokens;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }
}
