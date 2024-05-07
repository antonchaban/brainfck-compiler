package org.example.a.chaban.v2.commands;

import org.example.a.chaban.v2.Data;

public class LeftCommand implements Command{
    @Override
    public void execute(Data data) {
        data.setPointer(data.getPointer() - 1);
    }
}
