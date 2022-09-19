package string;
import java.util.*;

public class CheckPermutation {
    static boolean arePermutation(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 != n2)
            return false;
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;

        return true;
    }

    public static void main(String[] args)
    {
        String str1 = "test";
        String str2 = "ttes";
        if (arePermutation(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}