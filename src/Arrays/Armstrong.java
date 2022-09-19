package Arrays;

public class Armstrong {

    public static void isArmstrong(int n){

        int temp=n;
        double sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+ (rem*rem*rem);
            n=n/10;
        }
        if(temp==sum){
            System.out.println("true");
        }
        else{

            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        isArmstrong(1553);
    }
}
