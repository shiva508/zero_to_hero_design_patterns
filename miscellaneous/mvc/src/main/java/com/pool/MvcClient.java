package com.pool;

public class MvcClient {
    public static void main(String[] args) {
        ProtocalModel protocalModel=new ProtocalModel("Save the world property",ProtocalType.FTP,"batman");
        ProtocolController protocolController=new ProtocolController(protocalModel);
        System.out.println(protocolController.viewProtocol());
        protocolController.updateModel("You are the only hope");
        System.out.println(protocolController.viewProtocol());
    }
}
