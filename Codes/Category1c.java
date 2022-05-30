//
// 20609115
// Kush Shah
//

import java.util.*;
import java.io.*;

public class Category1c {
    public static void main(String[] args)
    {
        String outputFileName = "1cResults.txt";
        System.out.println();
        System.out.println("Welcome to the program where you can see if the value give is a valid value or not");
        System.out.println();
        ReadInFileMenu(outputFileName);
    }
    public static void ReadInFileMenu(String outputFileName)
    {
        boolean running = true;
        String inputFileName = "n/a";
        Scanner sc = new Scanner(System.in);
        while(running == true)
        {
            System.out.println("Would you like to Read in a file or enter a string?");
            System.out.println("If you would like to Read in a file type 'Yes' if not then type 'No'");
            System.out.print("Enter you Choice: ");
            String readInFile = sc.next();
            readInFile += sc.nextLine();
            readInFile = readInFile.toLowerCase();
            System.out.println();
            if (readInFile.equals("yes") == false)
            {
                if (readInFile.equals("no") == true)
                {
                    NoMenu(outputFileName);
                    running = false;
                }
                else if (readInFile.equals("no") == false)
                {
                    System.out.println();
                    System.out.println("Invalid String Input");
                    System.out.println("Please Input Either 'Yes' or 'No'");
                    System.out.println();
                    running = true;
                }
            }
            else if (readInFile.equals("yes") == true)
            {
                System.out.println();
                System.out.println("You selected to input a File Name");
                System.out.println("Please input the name of the file with the file type (e.g. File.txt)");
                System.out.print("Enter the Name of The File: ");
                inputFileName = sc.next();
                System.out.println();
                ReadFile(inputFileName, outputFileName);
                running = false;
            }
        }
        sc.close();
    }
    public static void NoMenu(String outputFileName)
    {
        Scanner scone = new Scanner(System.in);
        String inputValue = "";
        System.out.println("Enter the Value you would like to use to check if it is a Valid Value: ");
        inputValue = scone.next();
        inputValue += scone.nextLine();
        System.out.println();
        String finalValue = CheckForValidNumber(inputValue);
        WriteToFile(outputFileName, finalValue);
        scone.close();
    }
    public static String ReadFile(String inputFileName, String outputFileName)
    {
        FileInputStream fileStream = null;
        InputStreamReader isr;
        BufferedReader bufRdr;
        String line;
        String finalValue = "";
        try
        {
            fileStream = new FileInputStream(inputFileName);
            isr = new InputStreamReader(fileStream);
            bufRdr = new BufferedReader(isr);
            line = bufRdr.readLine();
            while(line != null)
            {
                finalValue += CheckForValidNumber(line);
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
            finalValue = "n/a";
            System.out.println();
        }
        WriteToFile(outputFileName, finalValue);
        return finalValue;
    }
    public static void WriteToFile(String outputFileName, String finalValue)
    {
        FileOutputStream fileStrm = null;
        try
        {
            fileStrm = new FileOutputStream(outputFileName);
            PrintWriter pw = new PrintWriter(fileStrm);
            pw.println(finalValue);
            pw.close();
        }
        catch(IOException ioE)
        {
            System.out.println("Error in writing to file: " + ioE.getMessage());
        }
    }
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
                i = arrayChar.length - 1;
            }
        }
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
        }
        else if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
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
        return finalValue;
    }
}
