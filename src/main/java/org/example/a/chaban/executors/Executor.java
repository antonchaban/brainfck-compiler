package org.example.a.chaban.executors;

import lombok.Getter;
import org.example.a.chaban.CommandFactory;
import org.example.a.chaban.Data;
import org.example.a.chaban.commands.CommandHistory;
import org.example.a.chaban.exceptions.IllegalCharException;

@Getter
public class Executor {
    private CommandHistory commandHistory = new CommandHistory();

    public String execute(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        var data = new Data();

        for (int ptr = 0; ptr < input.length(); ) {
            var command = input.charAt(ptr);
            try {
                var commandObject = CommandFactory.getCommand(command, data);
                commandHistory.push(commandObject);
                ptr = commandObject.execute(ptr, input);
            } catch (IllegalCharException e) {
                System.out.println(e.getMessage());
                ptr++;
            }
        }
        return data.getOutputData();
    }
}
