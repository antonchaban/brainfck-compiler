package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class IncCommand extends Command {

    public IncCommand(char command, Data data) {
        super(command, data);
    }

    @Override
    public int execute(int position, String input) {
        var ptr = data.getPointer();
        data.getData()[ptr]++;
        return position + 1;
    }

    @Override
    public void execute() {
        data.getData()[data.getPointer()]++;
    }
}
