import java.io.*;
public class Category1cTestCase
{
    public static String CheckForValidNumber(String inputValue)
    {
        char[] arrayChar = inputValue.toCharArray();
        int ASCIIvalue = 0;
        String finalValue = "";
        for (int i = 0; i < arrayChar.length; i++)
        {
           ASCIIvalue = (int)arrayChar[i];
           if ((ASCIIvalue >= 58) && (ASCIIvalue <= 127))
           {
                finalValue = "Not a Valid Number";
                i = arrayChar.length - 1;
            }
            else if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
            {
                if (i == arrayChar.length - 1)
                {
                    finalValue = "A Valid Number";
                }
            }
        }
        return finalValue;
    } 
}
