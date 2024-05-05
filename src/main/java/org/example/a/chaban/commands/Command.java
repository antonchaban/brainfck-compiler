package org.example.a.chaban.commands;

import lombok.Getter;
import lombok.Setter;
import org.example.a.chaban.Data;

@Getter
public abstract class Command {
    private final char command;
    @Setter
    public Data data;

    public Command(char command, Data data) {
        this.command = command;
        this.data = data;
    }

    public abstract int execute(int position, String input);

    public void execute() {
    }
}
