package org.example.a.chaban;

import org.example.a.chaban.exceptions.IllegalCharException;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IllegalCharException {
        Executor executor = new Executor();
        System.out.println("##################");
        System.out.println(executor.
                execute("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++asdasdasd"));
        System.out.println("##################");
        var history = executor.getHistory();
        System.out.println("History:");
        history.getHistory().forEach(command -> System.out.print(command.getCommands()));
    }
}