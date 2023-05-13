package com.pool;

public class ProtocolView {

    private ProtocalModel protocolModel;

    public ProtocolView(ProtocalModel protocolModel) {
        this.protocolModel = protocolModel;
    }

    public String displayEncryptedMessage(){
        return "<protocol>" +
                "<message>"+protocolModel.getMessage()+"</message>" +
                "<encryptionKey>"+protocolModel.getEncryptionKey()+"</encryptionKey>" +
                "<protocolType>"+protocolModel.getProtocalType().getProtocol()+"</protocolType>" +
                "</protocol>";
    }
}
