package org.example.a.chaban.commands;

import lombok.Getter;
import org.example.a.chaban.Data;

@Getter
public abstract class Command {
    private final char commands;

    public Command(char commands) {
        this.commands = commands;
    }

    public abstract int execute(Data data, int position, String input);
}
