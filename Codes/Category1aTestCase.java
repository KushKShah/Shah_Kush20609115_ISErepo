import java.io.*;
public class Category1aTestCase
{
    public static String ReadFile(String inputFileName)
    {
        FileInputStream fileStream = null;
        InputStreamReader isr;
        BufferedReader bufRdr;
        String line;
        String fileInput = "";
        try
        {
            fileStream = new FileInputStream(inputFileName);
            isr = new InputStreamReader(fileStream);
            bufRdr = new BufferedReader(isr);
            line = bufRdr.readLine();
            while(line != null)
            {
                fileInput += line;
                fileInput += "\n";
                line = bufRdr.readLine();
            }
            fileStream.close();
        }
        catch(IOException errorDetails)
        {
           if(fileStream != null)
           {
               try
               {
                fileStream.close();
               }
               catch(IOException ex2)
               { }
           }
           System.out.println("Error in fileProcessing: " + errorDetails.getMessage());
           fileInput = "n/a";
        }
        return fileInput;
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
