//
// 20609115
// Kush Shah
//

import java.util.*;
import java.io.*;
import java.text.*;

public class Category2c
{
    public static void main(String[] args)
    {
        String outputFileName = "2cResults.txt";
        System.out.println();
        System.out.println(" Welcome to a program where a number which represents a time given in hours to minutes and vice versa, and time given in minutes to seconds and vice versa");
        System.out.println();
        readInFileMenu(outputFileName);
    }
    public static void readInFileMenu(String outputFileName)
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
                    CaseMenu("no", inputFileName, outputFileName);
                    running = false;
                }
                else if (readInFile.equals("no") == false)
                {
                    System.out.println("|---------------------------------|");
                    System.out.println("|Invalid String Input             |");
                    System.out.println("|Please Input Either 'Yes' or 'No'|");
                    System.out.println("|---------------------------------|");
                    System.out.println();
                    running = true;
                }
            }
            else if (readInFile.equals("yes") == true)
            {
                System.out.println();
                System.out.println("You selected to input a File Name");
                System.out.println("Please input the name of the file with the file type (e.g. File.txt)");
                System.out.print("Enter the File Name: ");
                inputFileName = sc.next();
                System.out.println();
                CaseMenu("yes", inputFileName, outputFileName);
                running = false;
            }
        }
        sc.close();
    }
    public static void CaseMenu(String inputStatus, String inputFileName, String outputFileName)
    {
        boolean menu = true;
        String choice = "";
        String value = "";
        String finalString = "";
        Scanner scone = new Scanner(System.in);
        if (inputStatus.equals("yes") == true)
        {
            finalString = ReadFile(inputFileName, choice);
            if (finalString.equals("n/a") == true)
            {
                System.out.println();
                System.out.println("|----------------|");
                System.out.println("|Please Try Again|");
                System.out.println("|----------------|");
                System.out.println();
                readInFileMenu(outputFileName);
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
            System.out.println("> (1) Change Hours to Minutes");
            System.out.println("> (2) Change Minutes to Hours");
            System.out.println("> (3) Change Minutes to Seconds");
            System.out.println("> (4) Change Seconds to Minutes");
            System.out.println("> (0) Exit the Program");
            System.out.print("Enter your Choice: ");
            choice = scone.next();
            System.out.println();
            
            switch(choice)
            {
                case "1":
                    if (inputStatus.equals("yes") == true)
                    {
                        finalString = ReadFile(inputFileName, choice);
                        WriteToFile(outputFileName, finalString);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the Number in Hours that you would like to change to Minutes");
                        value = scone.next();
                        value += scone.nextLine();
                        System.out.println();
                        finalString = ConvertHoursToMinutes(value);
                        WriteToFile(outputFileName, finalString);
                    }
                    menu = false;
                    break;
                case "2":
                    if (inputStatus.equals("yes") == true)
                    {
                        finalString = ReadFile(inputFileName, choice);
                        WriteToFile(outputFileName, finalString);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the Number in Minutes that you would like to change to Hours");
                        value = scone.next();
                        value += scone.nextLine();
                        System.out.println();
                        finalString += ConvertMinutesToHours(value);
                        WriteToFile(outputFileName, finalString);
                    }
                    menu = false;
                    break;
                case "3":
                    if (inputStatus.equals("yes") == true)
                    {
                        finalString = ReadFile(inputFileName, choice);
                        WriteToFile(outputFileName, finalString);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the Number in Minutes that you would like to change to Seconds");
                        value = scone.next();
                        value += scone.nextLine();
                        System.out.println();
                        finalString += ConvertMinutesToSeconds(value);
                        WriteToFile(outputFileName, finalString);
                    }
                    menu = false;
                    break;
                case "4":
                    if (inputStatus.equals("yes") == true)
                    {
                        finalString = ReadFile(inputFileName, choice);
                        WriteToFile(outputFileName, finalString);
                    }
                    else if (inputStatus.equals("no") == true)
                    {
                        System.out.println("Enter the Number in Seconds that you would like to change to Minutes");
                        value = scone.next();
                        value += scone.nextLine();
                        System.out.println();
                        finalString += ConvertSecondsToMinutes(value);
                        WriteToFile(outputFileName, finalString);
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
}
