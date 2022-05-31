import java.util.*;

class Category1aBB
{
    public static void main(String[] args)
    {
        testReadFile();
        testUpper();
        testLower();
    }
    public static void testReadFile()
    {
        assert "1".equals(Category1aTestCase.ReadFile("Input1a.txt"));
        assert "n/a".equals(Category1aTestCase.ReadFile("Kush"));
    }
    public static void testUpper()
    {
        assert "KUSH KALPESHKUMAR SHAH".equals(Category1aTestCase.Upper("Kush Kalpeshkumar Shah"));
    }
    public static void testLower()
    {
        assert "kush kalpeshkumar shah".equals(Category1aTestCase.Lower("Kush Kalpeshkumar Shah"));
    }
}