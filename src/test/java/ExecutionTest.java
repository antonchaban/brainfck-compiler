import org.example.a.chaban.BrainfuckExecutor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExecutionTest {
    @Test
    void testHelloWorld() {
        String input = "++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++";
        BrainfuckExecutor executor = new BrainfuckExecutor();
        assertEquals("Hello World!",
                executor.execute(input));

    }

    @Test
    void testEmpty() {
        BrainfuckExecutor executor = new BrainfuckExecutor();
        assertEquals("",
                executor.execute(""));
    }

}
