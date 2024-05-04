package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class LoopCommand extends Command {

    public LoopCommand(char command) {
        super(command);
    }

    @Override
    public int execute(Data data, int position, String input) {
        int ptr = data.getPointer();
        char[] memory = data.getData();
        int c = 0;

        if (input.charAt(position) == '[' && memory[ptr] == 0) {
            position++;
            while (c > 0 || input.charAt(position) != ']') {
                if (input.charAt(position) == '[') {
                    c++;
                } else if (input.charAt(position) == ']') {
                    c--;
                }
                position++;
            }
        }

        if (input.charAt(position) == ']' && memory[ptr] != 0) {
            if (memory[ptr] != 0) {
                position--;
                while (c > 0 || input.charAt(position) != '[') {
                    if (input.charAt(position) == ']') {
                        c++;
                    } else if (input.charAt(position) == '[') {
                        c--;
                    }
                    position--;
                }
            }
        }

        return position + 1;
    }
}
