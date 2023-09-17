package com.pool;

import java.util.Map;

public class TcpProtocalService implements ProtocalService {
    @Override
    public Map<String,String> sendMessage(String message) {
        return Map.of("TCP",message);
    }
}
