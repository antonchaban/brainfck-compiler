package org.example.a.chaban.executors;

import org.example.a.chaban.Data;
import org.example.a.chaban.commands.Command;

import java.util.List;

public class CommandExecutor {
    public String executeCommands(List<Command> commands) {
        if (commands == null || commands.isEmpty()) {
            return "";
        }
        var data = new Data();
        for (Command commandObject : commands) {
            commandObject.setData(data);
            commandObject.execute();
        }
        return data.getOutputData();
    }
}
