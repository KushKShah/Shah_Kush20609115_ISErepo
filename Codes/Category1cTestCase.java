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
                finalValue = "The Value: '" + inputValue + "'";
                finalValue += "\n";
                finalValue += "|------------------|";
                finalValue += "\n";
                finalValue += "|Not a Valid Number|";
                finalValue += "\n";
                finalValue += "|------------------|";
                finalValue += "\n";
                finalValue += "\n";
                System.out.println("The Value: '" + inputValue + "'");
                System.out.println("|------------------|");
                System.out.println("|Not a Valid Number|");
                System.out.println("|------------------|");
                System.out.println();
                i = arrayChar.length - 1;
            }
            else if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
            {
                if (i == arrayChar.length - 1)
                {
                    finalValue = "The Value: '" + inputValue + "'";
                    finalValue += "\n";
                    finalValue += "|------------|";
                    finalValue += "\n";
                    finalValue += "|Valid Number|";
                    finalValue += "\n";
                    finalValue += "|------------|";
                    finalValue += "\n";
                    finalValue += "\n";
                    System.out.println("The Value: '" + inputValue + "'");
                    System.out.println("|------------|");
                    System.out.println("|Valid Number|");
                    System.out.println("|------------|");
                    System.out.println();
                }
            }
        }
        return finalValue;
    } 
}
