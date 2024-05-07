package org.example.a.chaban.v2.commands;

import org.example.a.chaban.v2.Data;

import java.util.ArrayList;
import java.util.List;

public class LoopCommand implements Command{
    private final List<Command> innerLoopCommands = new ArrayList<>();

    public LoopCommand(List<Command> innerLoopCommands) {
        this.innerLoopCommands.addAll(innerLoopCommands);
    }
    @Override
    public void execute(Data data) {
        while (data.getCurrentCellValue() != 0) {
            for(Command command : innerLoopCommands) {
                command.execute(data);
            }
        }
    }
}
