package org.example.a.chaban.commands;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class for storing the history of commands
 */

@Getter
public class CommandHistory {
    private List<Command> history = new ArrayList<>();


    /**
     * Adds a command to the history
     *
     * @param command command to add
     */
    public void push(Command command) {
        history.add(command);
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
