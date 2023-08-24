public class Main
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome("racecar"));
    }

    private static boolean isPalindrome(String str)
    {
        return str.contentEquals(new StringBuilder(str).reverse());
    }
}