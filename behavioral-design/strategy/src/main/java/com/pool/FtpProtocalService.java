package com.pool;

import java.util.Map;

public class FtpProtocalService implements ProtocalService {
    @Override
    public Map<String,String> sendMessage(String message) {
        return Map.of("FTP",message);
    }
}
