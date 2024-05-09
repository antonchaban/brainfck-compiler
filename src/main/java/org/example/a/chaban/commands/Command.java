package org.example.a.chaban.commands;

import org.example.a.chaban.Data;

@FunctionalInterface
public interface Command {
    void execute(Data data);
}
