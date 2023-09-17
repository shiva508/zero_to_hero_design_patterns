package com.pool;

public abstract class ProtocolService {
    public ProtocolService() {
    }
    public String sendMessage(String message,EncryptionType encryptionType){
        StringBuilder encryptedMsg=new StringBuilder(message);
        encryptMessage(encryptedMsg,encryptionType);
        return encryptedMsg.toString();
    }
    public abstract void encryptMessage(StringBuilder encryptedMsg,EncryptionType encryptionType);
}
