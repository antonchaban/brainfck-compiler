package org.example.a.chaban;

import org.example.a.chaban.commands.*;

import java.util.*;

public class BrainfuckCompiler {
    private final Map<Character, BrainfuckInstructionProcessor> processors = new HashMap<>();

    public BrainfuckCompiler() {
        processors.put('>', (compilationStack) -> compilationStack.peek().add(new RightCommand()));
        processors.put('<', (compilationStack) -> compilationStack.peek().add(new LeftCommand()));
        processors.put('+', (compilationStack) -> compilationStack.peek().add(new IncCommand()));
        processors.put('-', (compilationStack) -> compilationStack.peek().add(new DecCommand()));
        processors.put('.', (compilationStack) -> compilationStack.peek().add(new OutputCommand()));
        processors.put('[', (compilationStack) -> compilationStack.push(new ArrayList<>()));
        processors.put(']', (compilationStack) -> {
            List<Command> innerLoopCommands = compilationStack.pop();
            LoopCommand loopCommand = new LoopCommand(innerLoopCommands);
            compilationStack.peek().add(loopCommand);
        });

    }

    public List<Command> compile(String brainfuckProgram) {
        Deque<List<Command>> compilationStack = new ArrayDeque<>();
        compilationStack.push(new ArrayList<>());

        for (char currentInstruction : brainfuckProgram.toCharArray()) {
            processors.get(currentInstruction)
                    .process(compilationStack);

        }
        assert compilationStack.size() == 1;
        return compilationStack.pop();
    }
}
