import java.io.*;
public class Category1dTestCase
{
    public static String RemoveNum(String inputString)
    {
        char[] arrayChar = inputString.toCharArray();
        String result = "";
        int ASCIIvalue = 0;
        for (int i = 0; i < arrayChar.length; i++)
        {
            ASCIIvalue = (int)arrayChar[i];
            if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
            {
                ASCIIvalue = 127;
            }
            result += (char)ASCIIvalue;
        }
        return result;
    }
    public static String Upper(String inputString)
    {
        String finalString = inputString.toUpperCase();
        System.out.println(inputString);
        System.out.println();
        System.out.println("|-------------|");
        System.out.println("|As Upper Case|");
        System.out.println("|-------------|");
        System.out.println();
        System.out.println(finalString);
        System.out.println();
        return finalString;
    }
    public static String Lower(String inputString)
    {
        String finalString = inputString.toLowerCase();
        System.out.println(inputString);
        System.out.println();
        System.out.println("|-------------|");
        System.out.println("|As Lower Case|");
        System.out.println("|-------------|");
        System.out.println();
        System.out.println(finalString);
        System.out.println();
        return finalString;
    }
}
