package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

/**
 * Command to execute loop commands
 */
public class LoopCommand extends Command {

    private final char OPEN_BRACKET = '[';
    private final char CLOSE_BRACKET = ']';

    public LoopCommand(char command, Data data) {
        super(command, data);
    }

    /**
     * Executes command that executes loop commands with
     * the given position and input string
     *
     * @param position current position in the input string
     * @param input    input string
     * @return new position in the input string
     */
    @Override
    public int execute(int position, String input) {
        int ptr = data.getPointer();
        char[] memory = data.getData();

        if (input.charAt(position) == OPEN_BRACKET && memory[ptr] == 0) {
            position = findClosingBracket(position, input);
        } else if (input.charAt(position) == CLOSE_BRACKET && memory[ptr] != 0) {
            position = findOpeningBracket(position, input);
        }

        return position + 1;
    }

    private int findClosingBracket(int position, String input) {
        int c = 0;

        for (position++; c > 0 || input.charAt(position) != CLOSE_BRACKET; position++) {
            if (input.charAt(position) == OPEN_BRACKET) {
                c++;
            } else if (input.charAt(position) == CLOSE_BRACKET) {
                c--;
            }
        }
        return position;
    }

    private int findOpeningBracket(int position, String input) {
        int c = 0;

        for (position--; c > 0 || input.charAt(position) != OPEN_BRACKET; position--) {
            if (input.charAt(position) == CLOSE_BRACKET) {
                c++;
            } else if (input.charAt(position) == OPEN_BRACKET) {
                c--;
            }
        }
        return position;
    }
}
