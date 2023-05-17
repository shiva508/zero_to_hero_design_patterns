package com.pool.client;

import com.pool.adapter.SignalRateAdapter;
import com.pool.transitter.CdmaSignalTransmitter;
import com.pool.transitter.FdmaSignalTransmitter;
import com.pool.transitter.TdmaSignalTransmitter;

public class SiganalRateConverterClient {
    public static void main(String[] args) {
        SignalRateAdapter signalRateAdapterCdma=new SignalRateAdapter(new CdmaSignalTransmitter());
        System.out.println(signalRateAdapterCdma.signalRateTranslater(2));

        SignalRateAdapter signalRateAdapterTdma=new SignalRateAdapter(new TdmaSignalTransmitter());
        System.out.println(signalRateAdapterTdma.signalRateTranslater(4));

        SignalRateAdapter signalRateAdapterFdma=new SignalRateAdapter(new FdmaSignalTransmitter());
        System.out.println(signalRateAdapterFdma.signalRateTranslater(8));

    }
}
