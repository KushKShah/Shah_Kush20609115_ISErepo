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
