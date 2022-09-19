package string;

public class RemoveConsecutiveElement {

    public static String removeConsective(String str){

        int n=str.length();
        String ans="";
        ans=ans+str.charAt(0);
        for(int i=0;i<n;i++){

            if(str.charAt(i) != ans.charAt(ans.length()-1)){
                ans=ans+str.charAt(i);
            }



        }
        return ans;
    }

    public static void main(String[] args) {
        char[] str = "geeksforgeeks".toCharArray();
      String ans=  removeConsective(String.valueOf(str));
        System.out.println(ans);
    }
}
