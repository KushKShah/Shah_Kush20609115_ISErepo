import java.util.*;

class Category1cWB
{
    public static void main(String[] args)
    {
        testCheckForValidNumber();
    }
    public static void testCheckForValidNumber()
    {
        assert "Not a Valid Number".equals(Category1cTestCase.CheckForValidNumber("91K15"));
        assert "A Valid Number".equals(Category1cTestCase.CheckForValidNumber("9115"));
        assert "".equals(Category1cTestCase.CheckForValidNumber(""));
    }
}