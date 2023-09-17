package com.pool;

public enum EncryptionType {
    FDMA("Frequency Division Multiple Access(FDMA)"),
    CDMA("Code Division Multiple Access(CDMA)"),
    TDMA("Time Division Multiple Access(TDMA)");
    private final String encryptionKey;
    EncryptionType(String encryptionKey){
        this.encryptionKey=encryptionKey;
    }
    public String getEncryptionKey() {
        return encryptionKey;
    }
}
