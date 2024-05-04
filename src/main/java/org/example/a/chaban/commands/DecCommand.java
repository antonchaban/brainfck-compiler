package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class DecCommand extends Command{
    public DecCommand(char command) {
        super(command);
    }

    @Override
    public int execute(Data data, int position, String input) {
        var ptr = data.getPointer();
        data.getData()[ptr]--;
        return position + 1;
    }
}
