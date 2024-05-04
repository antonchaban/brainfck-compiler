package org.example.a.chaban;

import org.example.a.chaban.exceptions.IllegalCharException;

public class Executor {

    public String execute(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }
        var data = new Data();

        for (int ptr = 0; ptr < input.length(); ) {
            var command = input.charAt(ptr);
            try {
                var commandObject = CommandFactory.getCommand(command);
                ptr = commandObject.execute(data, ptr, input);
            } catch (IllegalCharException e) {
                System.out.println(e.getMessage());
                ptr++;
            }

        }


        return data.getOutputData();
    }
}
