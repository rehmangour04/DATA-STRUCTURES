package string;

public class CountWords {

    public static int count(String str){
        int n=str.length();

        int count=1;
        if(n==0){
            return count= 0;
        }

        for(int i=0;i<=n;i++) {
            if (str.charAt(i) == ' ') {
                count++;

            }
        }
    return count;
}
}