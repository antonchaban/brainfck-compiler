package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

/**
 * Command to output data
 */
public class OutputCommand extends Command {
    public OutputCommand(char command, Data data) {
        super(command, data);
    }

    /**
     * Executes command that outputs data with
     * the given position and input string
     *
     * @param position current position in the input string
     * @param input    input string
     * @return new position in the input string
     */
    @Override
    public int execute(int position, String input) {
        char c = data.getData()[data.getPointer()];
        data.addOutputData(c);
        return position + 1;
    }

    @Override
    public void execute() {
        char c = data.getData()[data.getPointer()];
        data.addOutputData(c);
    }
}
