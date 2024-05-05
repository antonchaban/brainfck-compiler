package org.example.a.chaban.commands;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CommandHistory {
    private List<Command> history = new ArrayList<>();

    public void push(Command command) {
        history.add(command);
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
