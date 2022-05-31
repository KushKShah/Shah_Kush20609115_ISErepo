import java.util.*;

class Category1dBB
{
    public static void main(String[] args)
    {
        testRemoveNum();
        testUpper();
        testLower();
    }
    public static void testRemoveNum()
    {
        assert "Kush".equals(Category1dTestCase.RemoveNum("Ku9115sh"));
        assert "Kush".equals(Category1dTestCase.RemoveNum("Kush"));
    }
    public static void testUpper()
    {
        assert "KUSH".equals(Category1dTestCase.Upper("Kush"));
    }
    public static void testLower()
    {
        assert "kush".equals(Category1dTestCase.Lower("Kush"));
    }
}
