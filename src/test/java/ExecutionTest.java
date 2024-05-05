import org.example.a.chaban.executors.CommandExecutor;
import org.example.a.chaban.Data;
import org.example.a.chaban.executors.Executor;
import org.example.a.chaban.commands.Command;
import org.example.a.chaban.commands.IncCommand;
import org.example.a.chaban.commands.OutputCommand;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutionTest {
    @Test
    void testHelloWorld() {
        Executor executor = new Executor();
        assertEquals("Hello World!",
                executor.execute("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++"));

    }

    @Test
    void testEmpty() {
        Executor executor = new Executor();
        assertEquals("",
                executor.execute(""));
    }

    @Test
    void testIllegalChar() {
        Executor executor = new Executor();
        assertEquals("Hello World!",
                executor.execute("++++++++[>++++[>++>+++>+++>asda+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++asdasdasd"));
    }

    @Test
    void testNull() {
        Executor executor = new Executor();
        assertEquals("",
                executor.execute(null));
    }

    @Test
    void testOnlyChars() {
        Executor executor = new Executor();
        assertEquals("",
                executor.execute("asdasdasd"));
    }

    @Test
    void testCommands() {
        var commandExecutor = new CommandExecutor();
        assertEquals("H",
                commandExecutor.executeCommands(generateCommands()));
    }

    private List<Command> generateCommands() {
        var commands = new ArrayList<Command>();
        for (int i = 0; i < 72; i++) {
            commands.add(new IncCommand('+', new Data()));
        }
        commands.add(new OutputCommand('.', new Data()));
        return commands;
    }

    @Test
    void testCommandsHelloWorld() {
        var commandExecutor = new CommandExecutor();
        assertEquals("Hello World!",
                commandExecutor.executeCommands(generateCommandsHelloWorld()));
    }

    private List<Command> generateCommandsHelloWorld() {
        var executor = new Executor();
        executor.execute("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++");
        return executor.getCommandHistory().getHistory();
    }

}
