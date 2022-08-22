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

    

//For two String it will return Sum
@Test
public void StringshouldReturnSumOfTwo()
{
    assertEquals(1+2, StringCalci.CalculateSumOfTwo("1,2"));
}

@Test
public void StringshouldReturnSumOfThree()
{
    assertEquals(1+2+3, StringCalci.CalculateSumOfThree("1,2,3"));
}

}