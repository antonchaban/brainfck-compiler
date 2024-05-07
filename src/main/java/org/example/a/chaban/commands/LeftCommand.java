package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class LeftCommand implements Command{
    @Override
    public void execute(Data data) {
        data.setPointer(data.getPointer() - 1);
    }
}
