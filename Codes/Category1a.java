//
// 20609115
// Kush Shah
//

import java.util.*;
import java.io.*;

public class Category1a
{
    public static void main(String[] args)
    {
        String outputFileName = "1aResults.txt";
        System.out.println();
        System.out.println("Welcome to the Program to turn Strings to Upper Case or Lower Case");
        System.out.println();
        ReadInFileMenu(outputFileName);
    }
    public static void ReadInFileMenu(String outputFileName)
    {
        boolean running = true;
        String inputFileName = "";
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
                    CaseMenu("no", inputFileName, outputFileName);
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
                CaseMenu("yes", inputFileName, outputFileName);
                running = false;
            }
        }
    }
    public static void CaseMenu(String inputStatus, String inputFileName, String outputFileName)
    {
        boolean menu = true;
        String choice = "x";
        Scanner scone = new Scanner(System.in);
        String finalString = "";
        String UorLCase = "";
        if (inputStatus.equals("yes") == true)
        {
            finalString = ReadFile(inputFileName, outputFileName);
            if (finalString.equals("n/a") == true)
            {
                System.out.println();
                System.out.println("|----------------|");
                System.out.println("|Please Try Again|");
                System.out.println("|----------------|");
                ReadInFileMenu(outputFileName);
                menu = false;
            }
            else
            {
                menu = true;
            }
        }
        do
        {
            System.out.println();
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
                    if (inputStatus.equals("yes") == true)
                    {
                        //make value to upper case
                        UorLCase = Upper(finalString);
                        WriteToFile(outputFileName, UorLCase);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the String you would like to change to Upper Case: ");
                        finalString = scone.next();
                        finalString += scone.nextLine();
                        System.out.println();
                        UorLCase = Upper(finalString);
                        WriteToFile(outputFileName, UorLCase);
                    }
                    menu = false;
                    break;
                case "2":
                    if (inputStatus.equals("yes") == true)
                    {
                        //make value to lower case
                        UorLCase = Lower(finalString);
                        WriteToFile(outputFileName, UorLCase);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the String you would like to change to Lower Case: ");
                        finalString = scone.next();
                        finalString += scone.nextLine();
                        System.out.println();
                        UorLCase = Lower(finalString);
                        WriteToFile(outputFileName, UorLCase);
                    }
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
    public static String ReadFile(String inputFileName, String outputFileName)
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
