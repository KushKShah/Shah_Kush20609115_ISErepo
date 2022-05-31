import java.util.*;

class Category1dWB
{
    public static void main(String[] args)
    {
        testRemoveNum();
    }
    public static void testRemoveNum()
    {
        assert "Shah".equals(Category1dTestCase.RemoveNum("Sh91ah"));
        assert "Kush".equals(Category1dTestCase.RemoveNum("Kush"));
        assert "".equals(Category1dTestCase.RemoveNum(""));
    }
}
