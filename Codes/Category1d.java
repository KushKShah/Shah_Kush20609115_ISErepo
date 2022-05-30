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
}
