package recusrion;
public class NumberOfDigits {
    public static int  countNumberOfDigits(int n){

        if(n==0) {
            return 0;
        }
        return 1 + countNumberOfDigits(n/10);

    }

        public static void main(String[] args) {
            System.out.println(countNumberOfDigits(123445556));


    }
}
