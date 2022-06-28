package UnitTest.Number;

import org.junit.Test;

import static org.junit.Assert.*;

public class UnitTest {

    @Test
    public void testNumber() {

        NumTest n = new NumTest();
        int resultNum = n.number(1, 2);
        assertEquals(3, resultNum);
    }
}
