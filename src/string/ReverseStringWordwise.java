package string;

public class ReverseStringWordwise {

    public static String reverseString(String s)
    {
        if (s.isEmpty())
            return s;
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String str="i am going to college";

       String reverse= reverseString(str);
        System.out.println(reverse);
    }

}
