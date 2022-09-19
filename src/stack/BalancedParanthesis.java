package stack;

import java.util.Stack;

public class BalancedParanthesis {

    public static boolean isBalanced(String expression) {
        //Your code goes here


        Stack<Character> st= new Stack<>();

        for( int i= 0; i< expression.length(); i++ )
        {
            char ch= expression.charAt(i);

            if( ch == '(' || ch == '{' || ch == '[' )
            {
                st.push(ch);
            }
            else if( ch == ')' )
            {
                if( st.size() == 0 )
                {
                    return false;
                }

                if( st.peek() == '(' )
                {
                    st.pop();
                }
                else
                {
                    return false;
                }


            }
            else if( ch == '}' )
            {
                if( st.size() == 0 )
                {
                    return false;
                }

                if( st.peek() == '{' )
                {
                    st.pop();
                }
                else
                {
                    return false;
                }

            }

            else
            {
                if( st.size() == 0 )
                {
                    return false;
                }

                if( st.peek() == '[' )
                {
                    st.pop();
                }
                else
                {
                    return false;
                }

            }

        }

        if( st.size() != 0 )
        {
            return false;
        }

        return true;


    }
}
