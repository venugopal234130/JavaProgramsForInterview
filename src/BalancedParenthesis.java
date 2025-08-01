import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "{}()([]";
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='{'||str.charAt(i)=='['||str.charAt(i)=='(') {
                stack.push(str.charAt(i));
            }
            else{
                if(stack.isEmpty()){
                    System.out.println(str.charAt(i)+" Not balanced");
                    break;
                }
                if((str.charAt(i)=='}'&& stack.peek()=='{') || (str.charAt(i)==']' && stack.peek()=='[') || (str.charAt(i)==')' && stack.peek()=='(')) {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
        {
            System.out.println("balanced");
        }
        else {
            System.out.println("not balanced");
        }
    }
}
