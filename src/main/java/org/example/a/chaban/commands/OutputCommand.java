package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class OutputCommand extends Command {
    public OutputCommand(char command, Data data) {
        super(command, data);
    }

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
