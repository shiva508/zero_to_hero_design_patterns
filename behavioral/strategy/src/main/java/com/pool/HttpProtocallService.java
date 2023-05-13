package com.pool;

import java.util.Map;

public class HttpProtocallService implements ProtocalService {
    @Override
    public Map<String,String> sendMessage(String message) {
        return Map.of("HTTP",message);
    }
}
