//
// 20609115
// Kush Shah
//

import java.util.*;
import java.io.*;

public class Category1d {
    public static void main(String[] args)
    {
        String outputFileName = "1dResults.txt";
        System.out.println();
        System.out.println("Welcome to the program where Numbers are Removed and you can choose whether you want to convert the String to Upper Case or Lower Case");
        System.out.println();
        ReadInFileMenu(outputFileName);
    }
    public static void ReadInFileMenu(String outputFileName)
    {
        boolean running = true;
        String inputFileName = "n/a";
        String RemovedNumString = "";
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
                    System.out.println("Please Input the String You would like to remove the Numbers from");
                    System.out.println("Enter the String: ");
                    String finalString = sc.next();
                    finalString += sc.nextLine();
                    RemovedNumString = RemoveNum(finalString);
                    System.out.println();
                    System.out.println("All Numbers have been taken out of the String");
                    System.out.println();
                    CaseMenu(outputFileName, RemovedNumString);
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
                RemovedNumString = ReadFile(inputFileName);
                if (RemovedNumString.equals("n/a") == true)
                {
                    System.out.println("|----------------|");
                    System.out.println("|Please Try Again|");
                    System.out.println("|----------------|");
                    System.out.println();
                    running = true;
                }
                else
                {
                    System.out.println("|----------------------------------------------|");
                    System.out.println("|All Numbers have been taken out of the Strings|");
                    System.out.println("|----------------------------------------------|");
                    System.out.println();
                    CaseMenu(outputFileName, RemovedNumString);
                    running = false;
                }
            }
        }
        sc.close();
    }
    public static void CaseMenu(String outputFileName, String RemovedNumString)
    {
        boolean menu = true;
        String choice = "x";
        Scanner scone = new Scanner(System.in);
        do
        {
            System.out.println("Select what you want to convert to");
            System.out.println("Choices you have: ");
            System.out.println("> (1) Change String to Upper Case");
            System.out.println("> (2) Change String to Lower Case");
            System.out.println("> (0) Exit the Program");
            System.out.print("Enter your Choice: ");
            choice = scone.next();
            System.out.println();
            
            switch(choice)
            {
                case "1":
                    Upper(outputFileName, RemovedNumString);
                    menu = false;
                    break;
                case "2":
                    Lower(outputFileName, RemovedNumString);
                    menu = false;
                    break;
                case "0":
                    System.out.println("Thank You for using the program");
                    System.out.println();
                    menu = false;
                    break;
                default:
                    System.out.println("|------------------------------|");
                    System.out.println("|Invalid Value Please Try Again|");
                    System.out.println("|------------------------------|");
                    System.out.println();
                    menu = true;
                    break;
            }
        } while (menu == true);
        scone.close();
    }
    public static String ReadFile(String inputFileName)
    {
        FileInputStream fileStream = null;
        InputStreamReader isr;
        BufferedReader bufRdr;
        String line;
        String RemovedNumString = "";
        try
        {
            fileStream = new FileInputStream(inputFileName);
            isr = new InputStreamReader(fileStream);
            bufRdr = new BufferedReader(isr);
            line = bufRdr.readLine();
            while(line != null)
            {
                RemovedNumString += RemoveNum(line);
                RemovedNumString += "\n";
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
            RemovedNumString = "n/a";
            System.out.println();
        }
        return RemovedNumString;
    }
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
    public static void WriteToFile(String outputFileName, String finalString)
    {
        FileOutputStream fileStrm = null;
        try
        {
            fileStrm = new FileOutputStream(outputFileName);
            PrintWriter pw = new PrintWriter(fileStrm);
            pw.println(finalString);
            pw.close();
        }
        catch(IOException ioE)
        {
            System.out.println("Error in writing to file: " + ioE.getMessage());
        }
    }
    public static void Upper(String outputFileName, String inputString)
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
        WriteToFile(outputFileName, finalString);
    }
    public static void Lower(String outputFileName, String inputString)
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
        WriteToFile(outputFileName, finalString);
    }
}
