package org.example.a.chaban;

import org.example.a.chaban.commands.*;
import org.example.a.chaban.exceptions.IllegalCharException;

public class CommandFactory {
    public static Command getCommand(char command, Data data) throws IllegalCharException {
        return switch (command) {
            case '>' -> new RightCommand(command, data);
            case '<' -> new LeftCommand(command, data);
            case '+' -> new IncCommand(command, data);
            case '-' -> new DecCommand(command, data);
            case '.' -> new OutputCommand(command, data);
            case '[', ']' -> new LoopCommand(command, data);
            default -> throw new IllegalCharException("Illegal character: " + command);
        };
    }
}
