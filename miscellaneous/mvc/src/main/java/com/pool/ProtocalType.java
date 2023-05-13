package com.pool;

public enum ProtocalType {
    FTP("File Transfer Protocol"),
    TCP("Transmission Control Protocol"),
    HTTP("Hyper Text Transfer Protocol");

    private final String protocol;
    ProtocalType(String protocol){
        this.protocol=protocol;
    }
    public String getProtocol() {
        return this.protocol;
    }
}
