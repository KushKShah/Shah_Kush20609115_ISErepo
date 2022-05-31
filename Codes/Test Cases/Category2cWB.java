import java.util.*;

class Category2cWB
{
    public static void main(String[] args)
    {
        testConvertHoursToMinutes();
        testStringToDouble();
        testTwoDecimalPlaces();
    }
    public static void testConvertHoursToMinutes()
    {
        assert "Invalid Value 91 15 Hours is 0.00 Minutes".equals(Category2cTestCase.ConvertHoursToMinutes("91 15"));
        assert "0 Hours in Minutes is 0.00 Minutes".equals(Category2cTestCase.ConvertHoursToMinutes("0"));
        assert "9115 Hours is 546900.00 Minutes".equals(Category2cTestCase.ConvertHoursToMinutes("9115"));
    }
    public static void testStringToDouble()
    {
        assert "9115.00".equals(Category2cTestCase.StringToDouble("9115.00"));
        assert "0.00".equals(Category2cTestCase.StringToDouble("91kush15"));
    }
    public static void testTwoDecimalPlaces()
    {
        assert "20609.12".equals(Category2cTestCase.TwoDecimalPlaces(20609.115));
    }
}
