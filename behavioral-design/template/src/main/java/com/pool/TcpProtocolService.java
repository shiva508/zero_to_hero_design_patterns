package com.pool;

public class TcpProtocolService extends ProtocolService{
    @Override
    public void encryptMessage(StringBuilder encryptedMsg, EncryptionType encryptionType) {
        EncryptionUtil.encryptText(encryptedMsg,encryptionType);
    }
}
