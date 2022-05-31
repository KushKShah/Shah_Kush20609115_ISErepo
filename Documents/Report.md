# ISAD1000 Final Assignment
### Name: Kush Kalpeshkumar Shah
### Student ID: 20609115
### Practical Class: Wednesdays, From 4pm to 6pm, In 314 218

## Introduction
    In this assignment We are expected to show our knowledge that we have received through this unit by applying software testing, modularity, version control and ethics. We are meant to use Version Control to maintain the all the code and other files. We are meant to create a simple software using modularity principles and test the software using black box and white box testing.

    In this Assignment we need to create softwares which can perform different forms of conversions such as string conversions and conversions of measurements such as time. We are required to cover all of category 1 which includes changing a string to upper case or lower case, identifing whether there is a number is a given string, also identify whether a give string is a valid number and we need to create a software to remove numbers from a string and change the string to upper or lower case. For Category 2 we are suppose to choose one Program that we would like to create. Therefore I have choosen to Convert a number which represents a time given in hours to minutes and vice versa, and time given in minutes to seconds and vice versa. For all these different Programs I have choosen to ask the User if they would like to readin a file or type in a string. All data is printed and is also written into a file.
## Module Descriptions
### Category 1:
#### (a): Converting a given string to Upper Case or Lower Case
    Submodule: Main
    Imports: Nothing
    Description: This Module Prints out what the code is meant to do and then Runs Module ReadInFileMenu.
    Export: Nothing

    Submodule: ReadInFileMenu
    Imports: outputFileName(String) is passed through the Main module
    Description: This Module is used to ask the User if they want to Read in a file or they want to input a string. If yes the system asks the user to input the file name. Then CaseMenu is ran through.
    Export: Nothing

    Submodule: CaseMenu
    Imports: inputStatus(String), inputFileName(String), outputFileName(String) is passed through the ReadInFileMenu module
    Description: This Module is used to ask the user if they want to change the string to upper case or lower case. Once the user inputs a valid input the Module runs according to the inputStatus(reading file is yes or no). If reading file is yes then it runs the ReadFile Module, but if it is no the Module asks the user to input the string they want to change the case of. Once this is done the Final String is sent to the Upper or Lower Modules depending on User request. Then the UorLcase is sent to the WriteToFile Module.
    Export: Nothing

    Submodule: ReadFile
    Imports: inputFileName(String), outputFileName(String) are passed in through CaseMenu Module
    Description: This Module is used to read in the file that the user tells the system to read in ReadInFileMenu Module. The Module saves line by line to the String fileInput then once the reading of the file is complete the Module returns the String fileInput.
    Exports: fileInput(String)

    Submodule: WriteToFile
    Imports: outputFileName(String), finalString(String) is passed in from Modules Upper or Lower
    Description: This Module is used to Write out the results to the results file.
    Exports: Nothing

    Submodule: Upper
    Imports: outputFileName(String), inputString(String) is passed in through the CaseMenu Module
    Description: This Module is used to turn the String to Upper case.
    Exports: finalString(String)

    Submodule: Lower
    Imports: outputFileName(String), inputString(String) is passed in through the CaseMenu Module
    Description: This Module is used to turn the String to Lower case.
    Exports: finalString(String)

#### (b): Identify whether numeric values are in a give string
    Submodule: Main
    Imports: Nothing
    Description: This Module Prints out what the code is meant to do and then Runs Module ReadInFileMenu.
    Export: Nothing

    Submodule: ReadInFileMenu
    Imports: outputFileName(String) is passed through the Main module
    Description: This Module is used to ask the User if they want to Read in a file or they want to input a string. If yes the system asks the user to input the file name. Then ReadFile Module is ran through.
    Export: Nothing

    Submodule: NoMenu
    Imports: outputFileName(String) is passed in through the ReadInFileMenu Module
    Description: This Module is used to Ask the User to input a string to identify if it has a number in it or not. Used only if User says no in the ReadInFileMenu Module. Once the User inputs a String the CheckForNum Module is ran. The finalString is sent to be written to the output file through WriteToFile Module.
    Exports: Nothing

    Submodule: ReadFile
    Imports: inputFileName(String), outputFileName(String) are passed in through ReadInFileMenu Module
    Description: This Module is used to read in the file that the user tells the system to read in ReadInFileMenu Module. The Module runs CheckForNum Module For each line and stores the result as finalString. At the End the of the Module the finalString is sent to be written in to the output file through WriteToFile Module.
    Exports: Nothing

    Submodule: WriteToFile
    Imports: outputFileName(String), finalString(String) is passed in from Module ReadFile or NoMenu Module
    Description: This Module is used to Write out the results to the results file.
    Exports: Nothing

    Submodule: CheckForNum
    Imports: inputString(String) is passed in from Modules ReadFile or NoMenu
     Description: This Module is used to Check if the given String has a Number in the String and Prints out if it does or does not. This module also saves the outcome to the finalString variable which is exported.
    Exports: finalString(String)

#### (c): Identify whether a given string is a valid number or not
    Submodule: Main
    Imports: Nothing
    Description: This Module Prints out what the code is meant to do and then Runs Module ReadInFileMenu.
    Export: Nothing

    Submodule: ReadInFileMenu
    Imports: outputFileName(String) is passed through the Main module
    Description: This Module is used to ask the User if they want to Read in a file or they want to input a value. If yes the system asks the user to input the file name. Then ReadFile Module is ran through and then WriteToFile is ran through to write the file out.
    Export: Nothing

    Submodule: NoMenu
    Imports: outputFileName(String) is passed in through the ReadInFileMenu Module
    Description: This Module is used to Ask the User to input a value to identify if it is a valid Number. Used only if User says no in the ReadInFileMenu Module. Once the User inputs a value the CheckForValidNumber Module is ran. The finalValue is sent to be written to the output file through WriteToFile Module.
    Exports: Nothing

    Submodule: ReadFile
    Imports: inputFileName(String), outputFileName(String) are passed in through ReadInFileMenu Module
    Description: This Module is used to read in the file that the user tells the system to read in ReadInFileMenu Module. The Module runs CheckForValidNumber Module For each line and stores the result as finalValue. At the End of the Module the finalValue is exported.
    Exports: finalValue(String)

    Submodule: WriteToFile
    Imports: outputFileName(String), finalValue(String) is passed in from Module ReadFile or NoMenu Module
    Description: This Module is used to Write out the results to the results file.
    Exports: Nothing

    Submodule: CheckForValidNumber
    Imports: inputString(String) is passed in from Modules ReadFile or NoMenu
    Description: This Module is used to Check if the given Value is a Valid Number and Prints out if it is or is not. This module also saves the outcome to the finalValue variable which is exported.
    Exports: finalValue(String)

#### (d): Remove any numeric values in a give string and then convert the string to Upper Case or Lower Case

    Submodule: Main
    Imports: Nothing
    Description: This Module Prints out what the code is meant to do and then Runs Module ReadInFileMenu.
    Export: Nothing

    Submodule: ReadInFileMenu
    Imports: outputFileName(String) is passed through the Main module
    Description: This Module is used to ask the User if they want to Read in a file or they want to input a string. If yes the system asks the User to input the file name. Then ReadFile Module is ran through. If No the system asks the User to input the string they want to remove numbers from and then RemoveNum Module is ran. Afterwards the RemovedNumString is sent to the CaseMenu Module.
    Export: Nothing

    Submodule: CaseMenu
    Imports: outputFileName(String), RemovedNumString(String) is passed through the ReadInFileMenu module
    Description: This Module is used to ask the user if they want to change the string to upper case or lower case. The RemovedNumString is sent to the Upper or Lower Modules depending on User request. Then the UorLcase String is sent to the WriteToFile Module.
    Export: Nothing

    Submodule: ReadFile
    Imports: inputFileName(String) is passed in through ReadInFileMenu Module
    Description: This Module is used to read in the file that the user tells the system to read in ReadInFileMenu Module. The Module runs RemoveNum Module For each line and stores the result as RemovedNumString. At the End the of the Module the RemovedNumString is Exported.
    Exports: RemovedNumString(String)

    Submodule: RemoveNum
    Imports: inputString(String) is passed in through the ReadInFileMenu Module
    Description: This Module is used to remove the numbers from the String and save it as result.
    Exports: result(String)

    Submodule: WriteToFile
    Imports: outputFileName(String), finalString(String) is passed in from Upper or Lower Module
    Description: This Module is used to Write out the results to the results file.
    Exports: Nothing

    Submodule: Upper
    Imports: outputFileName(String), inputString(String) is passed in through the CaseMenu Module
    Description: This Module is used to turn the String to Upper case.
    Exports: finalString(String)

    Submodule: Lower
    Imports: outputFileName(String), inputString(String) is passed in through the CaseMenu Module
    Description: This Module is used to turn the String to Lower case.
    Exports: finalString(String)

### Category 2:
#### (c): Converting a number which represents a time given in hours to minutes and vice versa, and time given in minutes to seconds and vice versa.

    Submodule: Main
    Imports: Nothing
    Description: This Module Prints out what the code is meant to do and then Runs Module ReadInFileMenu.
    Export: Nothing

    Submodule: ReadInFileMenu
    Imports: outputFileName(String) is passed through the Main module
    Description: This Module is used to ask the User if they want to Read in a file or they want to input a value. If yes the system asks the user to input the file name. Then CaseMenu is ran through.
    Export: Nothing

    Submodule: CaseMenu
    Imports: inputStatus(String), inputFileName(String), outputFileName(String) is passed in through ReadInFileMenu Module
    Description: This Module is used to ask the User if they want to change Hours to Minutes, Minutes to Hours, Minutes to Seconds or Seconds to Minutes. Depending on inputStatus(yes or no) from ReadInFileMenu Cases are ran accordingly. If inputStatus is yes ReadFile Module is ran (doesn't matter what is being converted). If inputStatus is no the system asks the user to input a number which is sent to the Module depending on what the user wants to convert from and to. Then finalString is sent to be written to results file through WriteToFile Module.
    Exports: Nothing

    Submodule: ReadFile
    Imports: inputFileName(String), choice(String) is passed in through CaseMenu Module
    Description: This Module is used to read in the file that the user tells the system to read in CaseMenu Module. The Module runs Convert Modules depending on choice, this is done for each line and stores the result as finalString. At the End the of the Module the finalString is Exported.
    Exports: finalString(String)

    Submodule: WriteToFile
    Imports: outputFileName(String), finalString(String) is passed in from Upper or Lower Module
    Description: This Module is used to Write out the results to the results file.
    Exports: Nothing

    Submodule: ConvertHoursToMinutes
    Imports: value(String) is passed in through ReadFile or CaseMenu Modules
    Description: This Module is used to convert Time in Hours to Minutes. The Module changes the String value to Double finalValue by running StringToDouble Module. The finalValue is Multiplied by 60 and then the finalValue is set to two decimal places using TwoDecimalPlaces Module. If the value is invalid hence has a letter in it or has a space in the value the value is returned as 0 with an Invalid Value String. Then the finalString is exported out.
    Exports: finalString(String)

    Submodule: ConvertMinutesToHours
    Imports: value(String) is passed in through ReadFile or CaseMenu Modules
    Description: This Module is used to convert Time in Minutes to Hours. The Module changes the String value to Double finalValue by running StringToDouble Module. The finalValue is Divided by 60 and then the finalValue is set to two decimal places using TwoDecimalPlaces Module. If the value is invalid hence has a letter in it or has a space in the value the value is returned as 0 with an Invalid Value String. Then the finalString is exported out.
    Exports: finalString(String)

    Submodule: ConvertMinutesToSeconds
    Imports: value(String) is passed in through ReadFile or CaseMenu Modules
    Description: This Module is used to convert Time in Minutes to Seconds. The Module changes the String value to Double finalValue by running StringToDouble Module. The finalValue is Multiplied by 60 and then the finalValue is set to two decimal places using TwoDecimalPlaces Module. If the value is invalid hence has a letter in it or has a space in the value the value is returned as 0 with an Invalid Value String. Then the finalString is exported out.
    Exports: finalString(String)

    Submodule: ConvertSecondsToMinutes
    Imports: value(String) is passed in through ReadFile or CaseMenu Modules
    Description: This Module is used to convert Time in Seconds to Minutes. The Module changes the String value to Double finalValue by running StringToDouble Module. The finalValue is Divided by 60 and then the finalValue is set to two decimal places using TwoDecimalPlaces Module. If the value is invalid hence has a letter in it or has a space in the value the value is returned as 0 with an Invalid Value String. Then the finalString is exported out.
    Exports: finalString(String)

    Submodule: StringToDouble
    Imports: value(String) is passed in through Convert Modules
    Description: This Module is used to convert a String to a Double. Then the conversion is exported out.
    Exports: conversion(Double)

    Submodule: TwoDecimalPlaces
    Imports: finalValue(Double) is passed in through Convert Modules.
    Description: This Module is used to convert a multiple decimal places value to two decimal places. Which is given as a stringValue and is exported out.
    Exports: stringValue(String)

## Modularity
### How To Run The Code
    (1): Start of by selecting the file you want to run.
    (2): Then Run the File
    (3): The Program will as you if you want to read in a file or input a string
    (4): If you want to read in a file input 'yes' else input 'no'
    (5): If its a Yes It will ask you to input a file name then it will run the ReadFile Method If its an Invalid File the Program will ask you to input the File Name again.
    (5): If its a No the Program will ask you to input a string
    (6): Once that is done If you are running a program where you need to choose if you want to change the string to upper or lower or if you need to choose what you want to convert the time to the program will ask you to choose what you want to convert it to. 
    (7): The Program will work through the data inputs and Print out results and also write out the Results to a File.
    (8): The Program will Quit once this is completed.
### Discussion on how different modularity concepts are applied in your code
    I applied Modularity by breaking down my software into small methods. I made sure keeping my code as simple as possible which allowed me to re-use the same code again for the other softwares I needed to make. I made sure keeping Low coupling by not having too many interdependencies between methods. I made sure keeping Cohesion high by having each module doing only a single well-defined task. There are no Global Variables there for coupling is low. I have also made sure to have minimal data redundancy.
### Review Checklist
|Question|Answer To questions|
|:-------:|:-------------------:|
|Are The Methods Broken Down?|YES: I have made sure not to use just one big method instead I have broken it up into smaller methods|
|Do the Methods only have a single responsibility?|YES: I have made sure not to run more than one thing in each method|
|Are All Methods Called Correctly?|YES: All the Programs run accordingly|
|Does the Program Run Without Errors?|YES: The program compiles and runs without any errors|
|Are all Methods Important?|YES: I have made sure that I have not used methods i don't need|
|Is the Program getting too complex?|NO: I have kept my code as simple as possible allowing me to reuse the code if needed|
|Are the variable Names Suitable?|YES: I have tried to keep best possible names that are suitable|
|Are there any unwanted variables?|NO: I have made sure not to use too many unwanted variables keeping it simple as possible|
|Are there any Global Variables?|NO: I have Made sure that I have not used any global variables|
|Is there any data redundancy occuring?|YES: Very Minimal that can't be avoided|
### Addressed any Issues
I had a few variables that did not need to be passed in therefore I removed those variables to make my code easier to understand and also makes it easier to flow.
## Black-Box Test Cases
    //There are No Boundaries in the inputs that the User may send therefore Boundary Value Analysis. cannot be done in my Coding
    //So all below Black-Box Tests are Equivalence Partitioning.
### Category 1(a):
#### ReadFile
Modified the code so that it can be test if the readfile is outputing correctly or not
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Correct File Name|Input1a.txt|FinalString = "1"|
|Wrong File Name|Kush|FinalString = "n/a"|
#### Upper
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Input a String|Shah|"SHAH"|
#### Lower
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Input a String|Kush Kalpeshkumar Shah|"kush kalpeshkumar shah"|
### Category 1(b):
#### CheckForNum
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Includes a Number|"Sh9115ah"|"Includes a Number"|
|Does not include a Number|"Shah"|"Does NOT Have a Number"|
### Category 1(c):
#### ReadFile
    Same as Category 1a.
#### CheckForValidNumber
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Not A Valid Number|"2060kush9115"|"Not a Valid Number"|
|Not A Valid Number|"2060 9115"|"Not a Valid Number"|
|A Valid Number|"20609115"|"A Valid Number"|
### Category 1(d):
#### ReadFile
    Same as Category 1a.
#### RemoveNum
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Has a Number in it|Ku9115sh|result = "Kush"|
|Does Not Have a Number|Kush| result = "Kush"|
#### Upper
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Input a String|Kush|"KUSH"|
#### Lower
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Input a String|Kush|"kush"|
### Category 2(c):
#### ReadFile
    Same as Category 1a.
#### ConvertHoursToMinutes
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Not a valid Input|9115Kush|"Invalid Value 9115Kush Hours is 0.00 Minutes"|
|Valid Input|9115|"9115 Hours is 546900.00 Minutes"|
#### ConvertMinutesToHours
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Not a valid Input|9115Kush|"Invalid Value 9115Kush Minutes is 0.00 Hours"|
|Valid Input|9115|"9115 Minutes is 151.92 Hours"|
#### ConvertMinutesToSeconds
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Not a valid Input|9115Kush|"Invalid Value 9115Kush Minutes is 0.00 Seconds"|
|Valid Input|9115|"9115 Minutes is 546900.00 Seconds"|
#### ConvertSecondsToMinutes
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Not a valid Input|9115Kush|"Invalid Value 9115Kush Seconds is 0.00 Minutes"|
|Valid Input|9115|"9115 Seconds is 151.92 Minutes"|
#### StringToDouble
|Category|Input|Output|
|:-------:|:----:|:-----:|
|Valid Number|"9115"|conversion = 9115.00|
|Not a Valid Number|"91kush15"|conversion = 0.00|
#### TwoDecimalPlaces
|Category|Input|Output|
|:-------:|:----:|:-----:|
|has decimal places|2060.9115|stringValue = "2060.91"|
|no decimal places|9115|stringValue = "9115.00"|
## White-Box Testing
### Category 1(a):
#### Upper: Since there are no conditional statements, there is only one path, and hence one test case.
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
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|Path 1|inputString = "KushKShah"|finalString = "KUSHKSHAH"|

![Category1(a) Upper](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(a)Upper.png)
#### Lower: Since there are no conditional statements, there is only one path, and hence one test case.
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
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|Path 1|inputString = "KushKShah"|finalString = "kushkshah"|

![Category1(a) Lower](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(a)Lower.png)
### Category 1(b):
#### CheckForNum: Since there are conditional statements, there will be three paths, and hence three test cases.
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
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|Path 1|inputString = "Ku9sh"|finalString = "Includes a Number"|
|Path 2|inputString = "Kush"|finalString = "Does NOT Have a Number"|
|Path 3|inputString = ""|finalString = ""|

![Category1(b) CheckForNumPath 1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(b)CheckForNumPath1.png)
![Category1(b) CheckForNumPath 2](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(b)CheckForNumPath2.png)
![Category1(b) CheckForNumPath 3](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(b)CheckForNumPath3.png)
### Category 1(c):
#### CheckForValidNumber: Since there are conditional statements, there will be three paths, and hence three test cases.
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
                    i = arrayChar.length - 1;
                }
                else if ((ASCIIvalue >= 48) && (ASCIIvalue <= 57))
                {
                    if (i == arrayChar.length - 1)
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
                }
            }
            return finalValue;
        }
    }
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|Path 1|inputValue = "91K15"|finalValue = "Not a Valid Number"|
|Path 2|inputValue = "9115"|finalValue = "A Valid Number"|
|Path 3|inputValue = ""|finalValue = ""|

![Category1(c) CheckForValidNumber Path 1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(c)CheckForValidNumberPath1.png)
![Category1(c) CheckForValidNumber Path 2](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(c)CheckForValidNumberPath2.png)
![Category1(c) CheckForValidNumber Path 3](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(c)CheckForValidNumberPath3.png)
### Category 1(d):
#### RemoveNum: Since there are conditional statements, there will be three paths, and hence three test cases.
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
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|path 1|inputString = "Sh91ah"|result = Shah|
|path 2|inputString = "Kush"|result = Kush|
|path 3|inputString = ""|result = ""|

![Category1(d) RemoveNum Path 1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(d)RemovNumPath1.png)
![Category1(d) RemoveNum Path 2](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(d)RemovNumPath2.png)
![Category1(d) RemoveNum Path 3](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category1(d)RemovNumPath3.png)

### Category 2(c):
#### RemoveConvertHoursToMinutes: Since there are conditional statements, there will be three paths, and hence three test cases.
    public static String ConvertHoursToMinutes(String value)
    {
        double finalValue = StringToDouble(value);
        finalValue = finalValue*60;
        String stringValue = TwoDecimalPlaces(finalValue);
        String finalString = "";
        if (finalValue == 0)
        {
            if (value.equals("0") == false)
            {
                System.out.println("|-------------|");
                System.out.println("|Invalid Value|");
                System.out.println("|-------------|");
                finalString += "|-------------|";
                finalString += "\n";
                finalString += "|Invalid Value|";
                finalString += "\n";
                finalString += "|-------------|";
                finalString += "\n";
            }
        }
        System.out.println(value + " Hours in Minutes is " + stringValue + " Minutes");
        System.out.println();
        finalString += value + " Hours in Minutes is " + stringValue + " Minutes";
        return finalString;
    }
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|path 1|value = "91 15"|"Invalid Value 9115Kush Hours is 0.00 Minutes"|
|path 2|value = "0"|"0 Hours in Minutes is 0.00 Minutes"|
|path 3|value = "9115"|"9115 Hours is 546900.00 Minutes"|

![Category2(c) ConvertHoursToMinutes Path1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)ConvertHoursToMinutesPath1.png)
![Category2(c) ConvertHoursToMinutes Path2](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)ConvertHoursToMinutesPath2.png)
![Category2(c) ConvertHoursToMinutes Path3](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)ConvertHoursToMinutesPath3.png)
#### StringToDouble: Since there is try-catch statement, there will be two paths, and hence two test cases.
    public static Double StringToDouble(String value)
    {
        double conversion = 0;
        try
        {
            conversion = Double.parseDouble(value);
        }
        catch (NumberFormatException e)
        {
            conversion = 0;
        }
        return conversion;
    }
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|path 1|value = "9115"|conversion = 9115|
|path 2|value = "91 15"|conversion = 0|

![Category2(c) CStringToDoublePath 1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)StringToDoublePath1.png)
![Category2(c) StringToDoublePath 2](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)StringToDoublePath2.png)

#### TwoDecimalPlaces: Since there are no conditional statements, there will be only one path, and hence one test case.
    public static String TwoDecimalPlaces(Double finalValue)
    {
        DecimalFormat dF = new DecimalFormat("0.00");
        String stringValue = dF.format(finalValue);
        return stringValue;
    }
|TestCase|Input|Output|
|:-------:|:----:|:-----:|
|path 1|finalValue = 20609.115|stringValue = "20609.12"|

![Category2(c) TwoDecimalPlaces Path 1](https://raw.githubusercontent.com/KushKShah/Shah_Kush20609115_ISErepo/main/Documents/Category2(c)TwoDecimalPlacesPath1.png)
## Test implementation and execution
### How to Run the Test Code
    1. Move directory to Test Cases
    2. Compile the File you want to test(if you want to test Category1a BB type Category1aBB.java with the Code file Category1aTestCase.java (same naming type just change number and letter after number to which ever Category))
    3. Run the File
    4. If there is no output it means that the test was valid.
### Run Test Case
    I went through all test cases but did not encounter any problems and there was no output therefore the test was valid for all Testing.
### Improvement of Code
    I did change the code to print out just 1 string rather than multiple strings. This made it easier to test my code and all the if statements. I did not get any new results as I implemented the changes before starting the code for the tests. Test codes can be found in the Folder Test Cases.

|Module Name|BB test Design(EP)|BB test design (BVA)|WB test design|EP test code (implemented/run)|BVA test code (implemented/run)|White-Box testing (implemented/run)|
|:---------:|:----------------:|:------------------:|:------------:|:----------------------------:|:-----------------------------:|:----------------------------------:|
|ReadFile|Done|Not Done|Not Done|Done|Not Done|Not Done|
|Upper|Done|Not Done|Done|Done|Not Done|Done|
|Lower|Done|Not Done|Done|Done|Not Done|Done|
|CheckForNum|Done|Not Done|Done|Done|Not Done|Done|
|CheckForValidNumber|Done|Not Done|Done|Done|Not Done|Done|
|RemoveNum|Done|Not Done|Done|Done|Not Done|Done|
|ConvertHoursToMinutes|Done|Not Done|Done|Done|Not Done|Done|
|ConvertMinutesToHours|Done|Not Done|Done|Done|Not Done|Done|
|ConvertMinutesToSeconds|Done|Not Done|Done|Done|Not Done|Done|
|ConvertSecondsToMinutes|Done|Not Done|Done|Done|Not Done|Done|
|StringToDouble|Done|Not Done|Done|Done|Not Done|Done|
|TwoDecimalPlaces|Done|Not Done|Done|Done|Not Done|Done|
## Ethics
