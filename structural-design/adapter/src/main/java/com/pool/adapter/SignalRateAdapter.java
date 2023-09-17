package com.pool.adapter;

import com.pool.transitter.SignalTransmitter;

import java.util.List;
import java.util.stream.Collectors;

public class SignalRateAdapter extends SignalAdapter{
    SignalTransmitter signalTransmitter;
    public SignalRateAdapter(SignalTransmitter signalTransmitter) {
        super(signalTransmitter);
        this.signalTransmitter=signalTransmitter;
    }

    @Override
    public List<Integer> signalRateTranslater(int rate) {
        return signalTransmitter.transmitSignal().stream().map(signal->signal*rate).collect(Collectors.toList());
    }
}
