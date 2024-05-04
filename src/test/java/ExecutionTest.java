import org.example.a.chaban.Executor;
import org.junit.jupiter.api.Test;

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
}
