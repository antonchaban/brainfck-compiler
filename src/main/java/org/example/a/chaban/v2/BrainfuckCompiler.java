package org.example.a.chaban.v2;

import org.example.a.chaban.v2.commands.*;

import java.util.ArrayList;
import java.util.List;

public class BrainfuckCompiler {
    public List<Command> compile(String input) {
        List<Command> commands = new ArrayList<>();
        List<LoopCommand> loops = new ArrayList<>();

        int currentPosition = 0;
        while (currentPosition < input.length()) {
            char currentChar = input.charAt(currentPosition);

            switch (currentChar) {
                case '>' -> appendCommandOrInnerLoop(loops, commands, new RightCommand());
                case '<' -> appendCommandOrInnerLoop(loops, commands, new LeftCommand());
                case '+' -> appendCommandOrInnerLoop(loops, commands, new IncCommand());
                case '-' -> appendCommandOrInnerLoop(loops, commands, new DecCommand());
                case '.' -> appendCommandOrInnerLoop(loops, commands, new OutputCommand());
                case '[' -> openLoop(loops, commands);
                case ']' -> closeLoop(loops);
            }
            currentPosition++;
        }
        return commands;
    }

    private void appendCommandOrInnerLoop(List<LoopCommand> loops, List<Command> commands, Command command) {
        if (loops.isEmpty()) {
            commands.add(command);
        } else {
            loops.getLast().getInnerLoopCommands().add(command);
        }
    }

    private void openLoop(List<LoopCommand> loops, List<Command> commands) {
        LoopCommand newLoop = new LoopCommand(new ArrayList<>());
        if (loops.isEmpty()) {
            commands.add(newLoop);
        } else {
            loops.getLast().getInnerLoopCommands().add(newLoop);
        }
        loops.add(newLoop);
    }

    private void closeLoop(List<LoopCommand> loops) {
        loops.removeLast();
    }
}
