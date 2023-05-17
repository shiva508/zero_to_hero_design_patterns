package com.pool.adapter;

import com.pool.transitter.SignalTransmitter;

import java.util.List;

public abstract class SignalAdapter {
    public SignalTransmitter signalTransmitter;

    public SignalAdapter(SignalTransmitter signalTransmitter) {
        this.signalTransmitter = signalTransmitter;
    }
    public abstract List<Integer> signalRateTranslater(int rate);
}
