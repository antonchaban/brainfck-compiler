package org.example.a.chaban.v2.commands;

import org.example.a.chaban.v2.Data;

public class IncCommand implements Command{
    @Override
    public void execute(Data data) {
        data.getData()[data.getPointer()]++;
    }
}
