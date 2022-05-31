import java.io.*;
public class Category1bTestCase
{
    public static String CheckForNum(String inputString)
    {
        char[] arrayChar = inputString.toCharArray();
        int ASCIIvalue = 0;
        String finalString = "";
        for (int i = 0; i < arrayChar.length; i++)
        {
            ASCIIvalue = (int)arrayChar[i];
            if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
            {
                finalString = "Includes a Number";
                i = arrayChar.length - 1;
            }
            else if ((ASCIIvalue >= 58) && (ASCIIvalue <= 127))
            {
                if (i == arrayChar.length - 1)
                {
                    finalString = "Does NOT Have a Number";
                }
            }
        }
        return finalString;
    }
}
