package com.pool;

public class ProtocalModel {
    private String message;
    private ProtocalType protocalType;
    private String encryptionKey;

    public ProtocalModel(String message, ProtocalType protocalType, String encryptionKey) {
        this.message = message;
        this.protocalType = protocalType;
        this.encryptionKey = encryptionKey;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProtocalType getProtocalType() {
        return protocalType;
    }

    public void setProtocalType(ProtocalType protocalType) {
        this.protocalType = protocalType;
    }

    public String getEncryptionKey() {
        return encryptionKey;
    }

    public void setEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
    }
}
