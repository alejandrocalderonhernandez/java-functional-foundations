package com.debuggeandoideas;

import com.debuggeandoideas.function.Printable;

public class Main {
    public static void main(String[] args) {

        Printable<String> printable =
                value -> IO.println(value);

        printable.print("Hello World");
    }
}