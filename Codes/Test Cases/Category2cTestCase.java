import java.util.*;
import java.io.*;
import java.text.*;
public class Category2cTestCase
{
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
                finalString = "Invalid Value ";
            }
        }
        finalString += value + " Hours in Minutes is " + stringValue + " Minutes";
        return finalString;
    }
    public static String ConvertMinutesToHours(String value)
    {
        double finalValue = StringToDouble(value);
        finalValue = finalValue/60;
        String stringValue = TwoDecimalPlaces(finalValue);
        String finalString = "";
        if (finalValue == 0)
        {
            if (value.equals("0") == false)
            {
                finalString = "Invalid Value ";
            }
        }
        finalString += value + " Minutes in Hours is " + stringValue + " Hours";
        return finalString;
    }
    public static String ConvertMinutesToSeconds(String value)
    {
        double finalValue = StringToDouble(value);
        finalValue = finalValue*60;
        String stringValue = TwoDecimalPlaces(finalValue);
        String finalString = "";
        if (finalValue == 0)
        {
            if (value.equals("0") == false)
            {
                finalString = "Invalid Value ";
            }
        }
        finalString += value + " Minutes in Seconds is " + stringValue + " Seconds";
        return finalString;
    }
    public static String ConvertSecondsToMinutes(String value)
    {
        double finalValue = StringToDouble(value);
        finalValue = finalValue/60;
        String stringValue = TwoDecimalPlaces(finalValue);
        String finalString = "";
        if (finalValue == 0)
        {
            if (value.equals("0") == false)
            {
                finalString = "Invalid Value ";
            }
        }
        finalString += value + " Seconds in Minutes is " + stringValue + " Minutes";
        return finalString;
    }
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
    public static String TwoDecimalPlaces(Double finalValue)
    {
        DecimalFormat dF = new DecimalFormat("0.00");
        String stringValue = dF.format(finalValue);
        return stringValue;
    } 
}
