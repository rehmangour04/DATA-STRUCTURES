package string;

public class RemoveCharacter {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        int n = str.length();
        String ans= "";
        for(int i = 0;i<n;i++)
        {
            if(str.charAt(i)==ch)
            {
                continue;
            }
            else
            {
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str="abcde";
        char ch='c';
       String ans= removeAllOccurrencesOfChar(str,ch);
        System.out.println(ans);
    }
}
