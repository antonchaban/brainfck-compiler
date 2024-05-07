package org.example.a.chaban;

import org.example.a.chaban.commands.Command;

import java.util.List;

public class BrainfuckExecutor {
    private final List<Command> commands;

    public BrainfuckExecutor(String input) {
        BrainfuckCompiler compiler = new BrainfuckCompiler();
        commands = compiler.compile(input);
    }

    public String execute() {
        Data data = new Data();
        for (Command command : commands) {
            command.execute(data);
        }
        return data.getOutputData();
    }
}
