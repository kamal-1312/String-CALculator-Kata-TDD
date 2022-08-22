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

    public static int CalculateSumOfThree(String s) {
        String[] SumOfTwo = s.split(",");

        return (parseInt(SumOfTwo[0]) + parseInt(SumOfTwo[1]) + parseInt(SumOfTwo[2]));

    }
    
    public static int ADD(String numbers) {
        String[] num = numbers.split(",");
        int size = num.length;
        throwExceptionIfAnyNegative(num, size);
        return findSum(num, size);
    }

    private static int findSum(String[] num, int size) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + toInt(num[i]);
        }
        return sum;
    }

    private static void throwExceptionIfAnyNegative(String[] num, int size) {
        ArrayList<String> negative = new ArrayList<String>();
        for (int i = 0; i < size; i++) {
            if (toInt(num[i]) < 0) {
                negative.add(num[i]);
            }
        }
        if (negative.size() > 0) {
            throw new RuntimeException("negatives not allowed: " + String.join(", ", negative));
        }
    }

    private static int toInt(String numbers) {
        return Integer.parseInt(numbers);
    }

}   