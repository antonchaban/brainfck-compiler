package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class LeftCommand extends Command{
    public LeftCommand(char command) {
        super(command);
//        super.getCommands().add(command);
    }

    @Override
    public int execute(Data data, int position, String input) {
        data.setPointer(data.getPointer() - 1);
        return position + 1;
    }
}
