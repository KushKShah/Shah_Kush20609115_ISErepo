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
                line = bufRdr.readLine();
            }
            fileStream.close();
            fileInput = "1";
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
        return finalString;
    }
    public static String Lower(String inputString)
    {
        String finalString = inputString.toLowerCase();
        return finalString;
    }
}
