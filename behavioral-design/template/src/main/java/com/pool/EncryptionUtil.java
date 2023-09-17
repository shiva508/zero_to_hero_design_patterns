package com.pool;

public class EncryptionUtil {
    public static void encryptText(StringBuilder encryptedMsg, EncryptionType encryptionType){
        if(encryptionType.getEncryptionKey().contains(Constants.TDMA)){
            encryptedMsg.append(":").append(encryptionType.getEncryptionKey());
        } else if (encryptionType.getEncryptionKey().contains(Constants.FDMA)) {
            encryptedMsg.append(":").append(encryptionType.getEncryptionKey());
        } else if (encryptionType.getEncryptionKey().contains(Constants.CDMA)) {
            encryptedMsg.append(":").append(encryptionType.getEncryptionKey());
        }
    }
}
