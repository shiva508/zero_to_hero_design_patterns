package com.pool.transitter;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CdmaSignalTransmitter implements SignalTransmitter {
    @Override
    public List<Integer> transmitSignal() {
        return IntStream.range(1,8).boxed().collect(Collectors.toList());
    }
}
