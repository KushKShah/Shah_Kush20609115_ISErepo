import java.util.*;

class Category1aWB
{
    public static void main(String[] args)
    {
        testUpper();
        testLower();
    }
    public static void testUpper()
    {
        assert "KUSHKSHAH".equals(Category1aTestCase.Upper("KushKShah"));
    }
    public static void testLower()
    {
        assert "kushkshah".equals(Category1aTestCase.Lower("KushKShah"));
    }
}