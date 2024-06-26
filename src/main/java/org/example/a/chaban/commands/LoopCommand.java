package org.example.a.chaban.commands;

import lombok.Getter;
import org.example.a.chaban.Data;

import java.util.ArrayList;
import java.util.List;

@Getter
public class LoopCommand implements Command {
    private final List<Command> innerLoopCommands = new ArrayList<>();

    public LoopCommand(List<Command> innerLoopCommands) {
        this.innerLoopCommands.addAll(innerLoopCommands);
    }

    @Override
    public void execute(Data data) {
        while (data.getCurrentCellValue() != 0) {
            for (Command command : innerLoopCommands) {
                command.execute(data);
            }
        }
    }
}
