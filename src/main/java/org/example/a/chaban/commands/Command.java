package org.example.a.chaban.commands;

import lombok.Getter;
import lombok.Setter;
import org.example.a.chaban.Data;

/**
 * Abstract class for all commands
 */

@Getter
public abstract class Command {
    private final char command;
    @Setter
    public Data data;

    public Command(char command, Data data) {
        this.command = command;
        this.data = data;
    }


    /**
     * Executes the command with the given position and input string
     *
     * @param position current position in the input string
     * @param input    input string
     * @return new position in the input string
     */
    public abstract int execute(int position, String input);

    /**
     * Executes the command
     */
    public void execute() {
    }
}
