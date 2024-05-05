package org.example.a.chaban;

import lombok.Getter;
import org.example.a.chaban.commands.CommandHistory;
import org.example.a.chaban.exceptions.IllegalCharException;

public class Executor {
    @Getter
    private CommandHistory history = new CommandHistory();

    public String execute(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        var data = new Data();

        for (int ptr = 0; ptr < input.length(); ) {
            var command = input.charAt(ptr);
            try {
                var commandObject = CommandFactory.getCommand(command);
                history.push(commandObject);
                ptr = commandObject.execute(data, ptr, input);
            } catch (IllegalCharException e) {
                System.out.println(e.getMessage());
                ptr++;
            }

        }


        return data.getOutputData();
    }
}
