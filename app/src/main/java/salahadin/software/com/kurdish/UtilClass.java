package salahadin.software.com.kurdish;

public class UtilClass
{
    public static String convertToArabicNumber(int number)
    {
        switch (number)
        {
            case 1:
                return "١";
            case 2:
                return "٢";
            case 3:
                return "٣";
            default:
                return number + "";
        }
    }
}
