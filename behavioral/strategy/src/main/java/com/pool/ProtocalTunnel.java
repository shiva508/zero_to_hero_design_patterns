package com.pool;

import java.util.Map;

public class ProtocalTunnel {
    private final ProtocalService protocalService;

    public ProtocalTunnel(ProtocalService protocalService) {
        this.protocalService = protocalService;
    }
    public Map<String,String> sendSecuredMessage(String encryptedMessage){
        return this.protocalService.sendMessage(encryptedMessage);
    }
}
