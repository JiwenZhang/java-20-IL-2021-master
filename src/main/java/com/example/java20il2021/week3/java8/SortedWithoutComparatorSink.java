package com.example.java20il2021.week3.java8;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedWithoutComparatorSink<T> extends SortedSink<T>{

    public SortedWithoutComparatorSink(ISink<T> downstream) {
        super(downstream, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }

}
