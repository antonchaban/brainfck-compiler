package org.example.a.chaban;

import org.example.a.chaban.commands.*;

public class CommandFactory {
    public static Command getCommand(char command) {
        return switch (command) {
            case '>' -> new RightCommand(command);
            case '<' -> new LeftCommand(command);
            case '+' -> new IncCommand(command);
            case '-' -> new DecCommand(command);
            case '.' -> new OutputCommand(command);
            case '[', ']' -> new LoopCommand(command);
            default -> throw new IllegalStateException("Unexpected value: " + command);
        };
    }
}
