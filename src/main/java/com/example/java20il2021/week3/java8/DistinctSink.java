package com.example.java20il2021.week3.java8;

import java.util.HashSet;
import java.util.Set;

public class DistinctSink<T> implements ISink<T> {
    private Set<T> seen;
    private final ISink<T> downstream;

    public DistinctSink(ISink<T> downstream) {
        this.downstream = downstream;
    }

    @Override
    public void begin(long size) {
        seen = new HashSet<>();
        downstream.begin(-1);
    }

    @Override
    public void end() {
        seen = null;
        downstream.end();
    }

    @Override
    public void accept(T t) {
        if (seen.add(t)) {
            downstream.accept(t);
        }
    }
}
