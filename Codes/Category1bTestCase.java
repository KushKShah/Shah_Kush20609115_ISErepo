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
                finalString = "The String: '" + inputString + "'";
                finalString += "\n";
                finalString += "|------------------------|";
                finalString += "\n";
                finalString += "|Does have a Number in it|";
                finalString += "\n";
                finalString += "|------------------------|";
                finalString += "\n";
                finalString += "\n";
                System.out.println("The String: '" + inputString + "'");
                System.out.println("|------------------------|");
                System.out.println("|Does have a Number in it|");
                System.out.println("|------------------------|");
                System.out.println();
                i = arrayChar.length - 1;
            }
            else if ((ASCIIvalue >= 58) && (ASCIIvalue <= 127))
            {
                if (i == arrayChar.length - 1)
                {
                    finalString = "The String: '" + inputString + "'";
                    finalString += "\n";
                    finalString += "|----------------------------|";
                    finalString += "\n";
                    finalString += "|Does NOT have a Number in it|";
                    finalString += "\n";
                    finalString += "|----------------------------|";
                    finalString += "\n";
                    finalString += "\n";
                    System.out.println("The String: '" + inputString + "'");
                    System.out.println("|----------------------------|");
                    System.out.println("|Does NOT have a Number in it|");
                    System.out.println("|----------------------------|");
                    System.out.println();
                }
            }
        }
        return finalString;
    }
}
