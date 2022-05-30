public class Category1b {
    public static void main(String[] args)
    {
        String outputFileName = "1bResults.txt";
        System.out.println();
        System.out.println("Welcome to the program where you can see if a String has Integers");
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
}
