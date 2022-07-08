import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        String S = "(()(())())";
//        String S = "())";
        String S = "";

        int result = 1;
        Stack<Character> stack = new Stack<Character>();

        if (S.length() > 0) {

            stack.push(S.charAt(0));
            for (int i = 1; i < S.length(); i++) {

                if (!stack.isEmpty() &&
                        stack.lastElement() == '(' && S.charAt(i) == ')') {
                    stack.pop();
                } else {
                    stack.push(S.charAt(i));
                }

            }

            if (stack.size() == 0) result = 1;

        }




        System.out.println("Output : " + result);

    }
}