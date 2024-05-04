package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class OutputCommand extends Command{
    public OutputCommand(char command) {
        super(command);
    }

    @Override
    public int execute(Data data, int position, String input) {
        char c = data.getData()[data.getPointer()];
        data.addOutputData(c);
        return position + 1;
    }
}
