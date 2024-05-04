package org.example.a.chaban;

import org.example.a.chaban.commands.*;
import org.example.a.chaban.exceptions.IllegalCharException;

public class CommandFactory {
    public static Command getCommand(char command) throws IllegalCharException {
        return switch (command) {
            case '>' -> new RightCommand(command);
            case '<' -> new LeftCommand(command);
            case '+' -> new IncCommand(command);
            case '-' -> new DecCommand(command);
            case '.' -> new OutputCommand(command);
            case '[', ']' -> new LoopCommand(command);
            default -> throw new IllegalCharException("Illegal character: " + command);
        };
    }
}
