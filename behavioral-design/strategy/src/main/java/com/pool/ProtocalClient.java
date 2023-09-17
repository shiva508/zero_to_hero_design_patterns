package com.pool;

public class ProtocalClient {
    public static void main(String[] args) {
        ProtocalTunnel ftpProtocalTunnel=new ProtocalTunnel(new FtpProtocalService());
        var ftpMsg = ftpProtocalTunnel.sendSecuredMessage("Let us not mess up end of the timeline");
        System.out.println(ftpMsg);
        ProtocalTunnel tcpProtocalTunnel=new ProtocalTunnel(new TcpProtocalService());
        var tcpMsg = tcpProtocalTunnel.sendSecuredMessage("You have to keep the phase");
        System.out.println(tcpMsg);
        ProtocalTunnel httpProtocalTunnel=new ProtocalTunnel(new HttpProtocallService());
        var httpMsg = httpProtocalTunnel.sendSecuredMessage("We have 120 years left timeline to end, you got fight till end, don't miss 1% of chance to save");
        System.out.println(httpMsg);

    }
}
