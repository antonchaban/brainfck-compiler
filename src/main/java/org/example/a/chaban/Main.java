package org.example.a.chaban;

import org.example.a.chaban.exceptions.IllegalCharException;
import org.example.a.chaban.executors.CommandExecutor;
import org.example.a.chaban.executors.Executor;

public class Main {
    public static void main(String[] args) throws IllegalCharException {
        Executor executor = new Executor();
        System.out.println("##################");
        System.out.println(executor.
                execute("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++asdasdasd"));
        System.out.println("##################");
        var history = executor.getCommandHistory();
        System.out.println("History:");
        history.getHistory().forEach(command -> System.out.print(command.getCommand()));
        System.out.println();
        var commandExecutor = new CommandExecutor();
        System.out.println("##################");
        System.out.println(commandExecutor.executeCommands(history.getHistory()));
    }
}