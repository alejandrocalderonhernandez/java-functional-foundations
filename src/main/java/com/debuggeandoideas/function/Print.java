package com.debuggeandoideas.function;

public class Print implements Printable<String> {

    @Override
    public void print(String value) {
        IO.print(value);
    }
}
