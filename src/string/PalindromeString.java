package string;

public class PalindromeString {


    public static boolean isPalindrome(String str){

        int n=str.length();
        int i=0;
        int j=n-1;

        while(i<=j){
            if(str.charAt(i) !=str.charAt(j)){
                return false;
            }

            j--;
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        String str="aba";
//        isPalindrome(str);
        System.out.println(isPalindrome(str));
    }

}
