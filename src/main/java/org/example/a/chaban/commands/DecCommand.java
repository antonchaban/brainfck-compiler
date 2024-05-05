package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

/**
 * Command to decrement the value at the current cell
 */
public class DecCommand extends Command {
    public DecCommand(char command, Data data) {
        super(command, data);
    }

    /**
     * Executes command that decrements the value at the current data pointer with
     * the given position and input string
     *
     * @param position current position in the input string
     * @param input    input string
     * @return new position in the input string
     */
    @Override
    public int execute(int position, String input) {
        var ptr = data.getPointer();
        data.getData()[ptr]--;
        return position + 1;
    }

    /**
     * Executes command that decrements the value at the current data pointer
     */
    @Override
    public void execute() {
        data.getData()[data.getPointer()]--;
    }

}
