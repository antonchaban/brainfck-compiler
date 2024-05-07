package org.example.a.chaban.v2.commands;

import org.example.a.chaban.v2.Data;

public class OutputCommand implements Command   {
    @Override
    public void execute(Data data) {
        char c = data.getData()[data.getPointer()];
        data.addToOutput(c);
    }
}
