package com.pool.transitter;

import com.pool.transitter.SignalTransmitter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TdmaSignalTransmitter implements SignalTransmitter {
    @Override
    public List<Integer> transmitSignal() {
        return IntStream.range(1,16).boxed().collect(Collectors.toList());
    }
}
