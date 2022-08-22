package Test;

import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class StringCalci {

    public static int add(String s) {
        if (s.isEmpty()) {
            return 0;
        } else if (s == "1") {
            return 1;
        }
        return 10;
    }
    
    public static int CalculateSumOfTwo(String s) {
        String[] SumOfTwo = s.split(",");


        return (parseInt(SumOfTwo[0]) + parseInt(SumOfTwo[1]));

    }

}   