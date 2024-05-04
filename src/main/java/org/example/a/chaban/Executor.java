package org.example.a.chaban;

public class Executor {

    public String execute(String input) {
        Data data = new Data();
        var ptr = 0;

        while (ptr < input.length()) {
            var command = input.charAt(ptr);
            var commandObject = CommandFactory.getCommand(command);
            ptr = commandObject.execute(data, ptr, input);
        }


        return data.getOutputData();
    }
}
