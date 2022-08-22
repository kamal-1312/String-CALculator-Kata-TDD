package Test;


public class Main {
    public static void main(String[] args)
    {
        System.out.println( StringCalci.add("") );
        System.out.println( StringCalci.add("1") );
        System.out.println(StringCalci.CalculateSumOfTwo("8,8"));
        System.out.println(StringCalci.CalculateSumOfThree("255,360,6"));
        System.out.println(StringCalci.ADD("255,-5,360,6"));

        System.out.println(StringCalci.ADD("255,-5,360-45,-65,6"));


    }
}