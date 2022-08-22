package Test;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringCalciTest {

    // If Empty String It will return Zero
    @Test
    public void shouldReturnZeroOnEmptyString() {
        assertEquals(0, StringCalci.add(""));
    }

    //For Single String It will return  1
    @Test
    public void shouldReturnOne()
    {
        assertEquals(1, StringCalci.add("1"));
    }

    
}