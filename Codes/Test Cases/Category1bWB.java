import java.util.*;

class Category1bWB
{
    public static void main(String[] args)
    {
        testCheckForNum();
    }
    public static void testCheckForNum()
    {
        assert "Includes a Number".equals(Category1bTestCase.CheckForNum("Ku9sh"));
        assert "Does NOT Have a Number".equals(Category1bTestCase.CheckForNum("Kush"));
        assert "".equals(Category1bTestCase.CheckForNum(""));
    }
}