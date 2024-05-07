package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

public class IncCommand implements Command{
    @Override
    public void execute(Data data) {
        data.getData()[data.getPointer()]++;
    }
}
