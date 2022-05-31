import java.util.*;

class Category1bBB
{
    public static void main(String[] args)
    {
        testCheckForNum();
    }
    public static void testCheckForNum()
    {
        assert "Includes a Number".equals(Category1bTestCase.CheckForNum("Sh9115ah"));
        assert "Does NOT Have a Number".equals(Category1bTestCase.CheckForNum("Shah"));
    }
}
