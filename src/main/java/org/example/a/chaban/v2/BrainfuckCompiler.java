package org.example.a.chaban.v2;

import org.example.a.chaban.v2.commands.*;

import java.util.ArrayList;
import java.util.List;

public class BrainfuckCompiler {
    public List<Command> compile(String input){
        List<Command> commands = new ArrayList<>();
        int currentPosition = 0;
        while (currentPosition < input.length()) {
            char currentChar = input.charAt(currentPosition);
            Command command = createCommand(currentChar, input, currentPosition);
            if (command != null) {
                commands.add(command);
            }
            currentPosition++;
        }
        return commands; 
    }

    private Command createCommand(char c, String input, int position) {
        switch (c) {
            case '>':
                return new RightCommand();
            case '<':
                return new LeftCommand();
            case '+':
                return new IncCommand();
            case '-':
                return new DecCommand();
            case '.':
                return new OutputCommand();
            case '[':
                int closingBracketPosition = findClosingBracket(input, position);
                String innerCommands = input.substring(position + 1, closingBracketPosition);
                List<Command> innerLoopCommands = compile(innerCommands);
                return new LoopCommand(innerLoopCommands);
            default:
                return null;
        }
    }

    private int findClosingBracket(String input, int position) {
        int nestingLevel = -1;
        for (int i = position; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '[') {
                nestingLevel++;
            } else if (currentChar == ']') {
                if (nestingLevel == 0) {
                    return i;
                }
                nestingLevel--;
            }
        }
        return -1;
    }


}
