package com.pool;

public class ProtocolTunnel {
    public static void main(String[] args) {
        ProtocolService ftpMsg=new FtpProtocolService();
        var whatHappendToMe = ftpMsg.sendMessage("What happened to me", EncryptionType.FDMA);
        System.out.println(whatHappendToMe);
        ProtocolService cdmaMsg=new TcpProtocolService();

        var convyMatterClearly = cdmaMsg.sendMessage("Convey matter clearly ",EncryptionType.CDMA);
        System.out.println(convyMatterClearly);
    }
}
