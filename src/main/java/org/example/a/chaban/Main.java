package org.example.a.chaban;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Executor executor = new Executor();
        System.out.println("##################");
        System.out.println(executor.
                execute("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++."));
    }
}