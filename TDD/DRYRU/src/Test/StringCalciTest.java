package Test;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalciTest {

    // If Empty String It will return Zero
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, StringCalci.add(""));
    }
}