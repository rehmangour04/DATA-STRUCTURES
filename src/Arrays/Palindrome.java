package Arrays;

public class Palindrome {

    public static void palindrome(int n){
        int rev=0;
        int temp=n;

        while(n>0){
            rev=(rev*10)+ n%10;
            n=n/10;
        }
        if(temp==rev){
            System.out.println("yes its palindrome number");
        }
        else{
            System.out.println("not a palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome(101);

    }
}
