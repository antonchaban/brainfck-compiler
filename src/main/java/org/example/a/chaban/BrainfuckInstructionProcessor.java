package org.example.a.chaban;

import org.example.a.chaban.commands.Command;

import java.util.Deque;
import java.util.List;

@FunctionalInterface
public interface BrainfuckInstructionProcessor {
    void process(Deque<List<Command>> compilationStack);
}
