package org.example.a.chaban;

import org.example.a.chaban.commands.Command;

import java.util.List;

public class BrainfuckExecutor {

    public String execute(String input) {
        BrainfuckCompiler compiler = new BrainfuckCompiler();
        List<Command> commands = compiler.compile(input);
        Data data = new Data();
        for (Command command : commands) {
            command.execute(data);
        }
        return data.getOutputData();
    }

    public static void main(String[] args) {
        String input = "++++++++[>++++[>++>+++>+++>+<<<<-]" +
                ">+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++";
        BrainfuckExecutor executor = new BrainfuckExecutor();
        String output = executor.execute(input);
        System.out.println(output);
    }
}
