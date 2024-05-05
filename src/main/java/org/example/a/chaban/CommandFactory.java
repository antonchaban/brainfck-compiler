package org.example.a.chaban;

import org.example.a.chaban.commands.*;
import org.example.a.chaban.exceptions.IllegalCharException;

/**
 * Factory class to create commands
 */
public class CommandFactory {
    /**
     * Creates a command object based on the given character
     *
     * @param command command character
     * @param data    data object
     * @return command object
     * @throws IllegalCharException if the character is illegal
     */
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
