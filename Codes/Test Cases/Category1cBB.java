import java.util.*;

class Category1cBB
{
    public static void main(String[] args)
    {
        testCheckForValidNumber();
    }
    public static void testCheckForValidNumber()
    {
        assert "Not a Valid Number".equals(Category1cTestCase.CheckForValidNumber("2060kush9115"));
        assert "Not a Valid Number".equals(Category1cTestCase.CheckForValidNumber("2060 9115"));
        assert "A Valid Number".equals(Category1cTestCase.CheckForValidNumber("20609115"));
    }
}
