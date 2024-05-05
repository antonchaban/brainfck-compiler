package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class LeftCommand extends Command {
    public LeftCommand(char command, Data data) {
        super(command, data);
    }

    @Override
    public int execute(int position, String input) {
        data.setPointer(data.getPointer() - 1);
        return position + 1;
    }

    @Override
    public void execute() {
        data.setPointer(data.getPointer() - 1);
    }
}
