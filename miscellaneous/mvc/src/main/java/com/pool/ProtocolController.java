package com.pool;

public class ProtocolController {
    private ProtocalModel protocalModel;
    private ProtocolView protocolView;
    public ProtocolController(ProtocalModel protocalModel) {
        this.protocalModel = protocalModel;
    }
    public String viewProtocol(){
        return new ProtocolView(protocalModel).displayEncryptedMessage();
    }
    public void updateModel(String text){
        protocalModel.setMessage(text);
    }
}
