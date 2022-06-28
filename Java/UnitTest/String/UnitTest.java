package UnitTest.String;

import org.junit.Test;
import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testString() {

        StringTest s = new StringTest();
        String result = s.text("Hello ", "World");
        assertEquals("Hello World", result);
    }
}
