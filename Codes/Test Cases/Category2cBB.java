import java.util.*;

class Category2cBB
{
    public static void main(String[] args)
    {
        testConvertHoursToMinutes();
        testConvertMinutesToHours();
        testConvertMinutesToSeconds();
        testConvertSecondsToMinutes();
        testStringToDouble();
        testTwoDecimalPlaces();
    }
    public static void testConvertHoursToMinutes()
    {
        assert "Invalid Value 9115 Hours is 0.00 Minutes".equals(Category2cTestCase.ConvertHoursToMinutes("9115Kush"));
        assert "9115 Hours is 546900.00 Minutes".equals(Category2cTestCase.ConvertHoursToMinutes("9115"));
    }
    public static void testConvertMinutesToHours()
    {
        assert "Invalid Value 9115Kush Minutes is 0.00 Hours".equals(Category2cTestCase.ConvertMinutesToHours("9115Kush"));
        assert "9115 Minutes is 151.92 Minutes".equals(Category2cTestCase.ConvertMinutesToHours("9115"));
    }
    public static void testConvertMinutesToSeconds()
    {
        assert "Invalid Value 9115Kush Minutes is 0.00 Seconds".equals(Category2cTestCase.ConvertMinutesToSeconds("9115Kush"));
        assert "9115 Minutes is 546900.00 Seconds".equals(Category2cTestCase.ConvertMinutesToSeconds("9115"));
    }
    public static void testConvertSecondsToMinutes()
    {
        assert "Invalid Value 9115Kush Seconds is 0.00 Minutes".equals(Category2cTestCase.ConvertSecondsToMinutes("9115Kush"));
        assert "9115 Seconds is 151.92 Minutes".equals(Category2cTestCase.ConvertSecondsToMinutes("9115"));
    }
    public static void testStringToDouble()
    {
        assert "9115.00".equals(Category2cTestCase.StringToDouble("9115"));
        assert "0.00".equals(Category2cTestCase.StringToDouble("91kush15"));
    }
    public static void testTwoDecimalPlaces()
    {
        assert "2060.9115".equals(Category2cTestCase.TwoDecimalPlaces(2060.9115));
        assert "9115".equals(Category2cTestCase.TwoDecimalPlaces(9115.00));
    }
}
