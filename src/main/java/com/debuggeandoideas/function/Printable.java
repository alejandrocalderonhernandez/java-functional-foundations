package com.debuggeandoideas.function;

@FunctionalInterface
public interface Printable<T> {
    void print(T value);
}