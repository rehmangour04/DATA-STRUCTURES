package string;

import java.util.Stack;

public class StringWordReverse {

    public static String reverseWords(String s) {
        Stack<String> st = new Stack<>();
        StringBuilder temp = new StringBuilder();
        StringBuilder ans  = new StringBuilder();

        for(int i =0; i <s.length(); i++){
            if(s.charAt(i) == ' '){
                if(temp.length() > 0)
                    st.push(temp.toString());
                temp = new StringBuilder();
            }else
                temp.append(s.charAt(i));
        }

        ans.append(temp);

        while(!st.isEmpty()){
            ans.append(" ").append(st.pop());
        }

        if(ans.length() != 0 && ans.charAt(0) == ' ')
            ans = new StringBuilder(ans.substring(1));

        return ans.toString();
    }

    public static void main(String[] args) {
        String s="coding ninjas is  best";
        String ans=reverseWords(s);
        System.out.println(ans);
    }
}
