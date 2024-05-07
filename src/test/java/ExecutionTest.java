import org.example.a.chaban.BrainfuckExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutionTest {
    @Test
    void testHelloWorld() {
        String input = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++";
        BrainfuckExecutor executor = new BrainfuckExecutor(input);
        assertEquals("Hello World!",
                executor.execute());

    }

    @Test
    void testEmpty() {
        BrainfuckExecutor executor = new BrainfuckExecutor("");
        assertEquals("",
                executor.execute());
    }

    @Test
    void testIllegalChar() {
        BrainfuckExecutor executor =
                new BrainfuckExecutor("++++++++[>++++[>++>+++>+++>asda+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++asdasdasd");
        assertEquals("Hello World!",
                executor.execute());
    }

    @Test
    void testNull() {
        BrainfuckExecutor executor = new BrainfuckExecutor(null);
        assertEquals("",
                executor.execute());
    }

    @Test
    void testOnlyChars() {
        BrainfuckExecutor executor = new BrainfuckExecutor("asdasdasd");
        assertEquals("",
                executor.execute());
    }

}
