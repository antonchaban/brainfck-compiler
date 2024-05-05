package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

/**
 * Command to shift data pointer to the right
 */
public class RightCommand extends Command {
    public RightCommand(char command, Data data) {
        super(command, data);
    }


    /**
     * Executes command that shifts data pointer to the right with
     * the given position and input string
     *
     * @param position current position in the input string
     * @param input    input string
     * @return new position in the input string
     */
    @Override
    public int execute(int position, String input) {
        data.setPointer(data.getPointer() + 1);
        return position + 1;
    }


    /**
     * Executes command that shifts data pointer to the right
     */
    @Override
    public void execute() {
        data.setPointer(data.getPointer() + 1);
    }
}
