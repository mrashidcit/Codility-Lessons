import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        String S = "(()(()))";
//        String S = "{[()()]}";
        String S = "([)()]";
//        String S = "()[()]";
//        String S = ")(";
        int result = 0;

        // *** Solution 2: Using Stack
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                stack.push(S.charAt(i));
            else if (S.charAt(i) == '{')
                stack.push(S.charAt(i));
            else if (S.charAt(i) == '[')
                stack.push(S.charAt(i));
            else if (S.charAt(i) == '(')
                stack.push(S.charAt(i));
            else if (S.charAt(i) == ')' && stack.get(stack.size()-1) == '(')
                stack.pop();
            else if (S.charAt(i) == '}' && stack.get(stack.size()-1) == '{')
                stack.pop();
            else if (S.charAt(i) == ']' && stack.get(stack.size()-1) == '[')
                stack.pop();

//            System.out.println(S.charAt(i) + " , Stack : " + printStack(stack));


        }

        if (stack.size() == 0)
            result = 1;

        System.out.println("Output : " + result);


        // *** Using List Version 1 :: Correcteness is 100%
//        List<Character> characterList = new ArrayList<Character>();
//
//        for (char c : S.toCharArray())
//            characterList.add(c);
//
//        // keep removing brackets from the list until there are not brackets left
//        Boolean bracketsLeft = true;
//
//        while (bracketsLeft == true && characterList.size() > 0) {
//            int parisRemoved = 0;
//            int previousCharacterListLength = characterList.size();
//
////            System.out.println("remove the brackets pairs from the list");
//            // remove the brackets pairs from the list
//            for (int i = 0 ; i < characterList.size()-1; i++) {
//                if (
//                    (characterList.get(i) == '(' && characterList.get(i+1) == ')') ||
//                    (characterList.get(i) == '{' && characterList.get(i+1) == '}') ||
//                    (characterList.get(i) == '[' && characterList.get(i+1) == ']')
//                ) {
//                    characterList.remove(i+1);
//                    characterList.remove(i);
//                    i -= 1; parisRemoved++;
//                }
//
//                if (parisRemoved == 0 && characterList.isEmpty()) {
//                    bracketsLeft = false;
//                }
//
//            }
////            if (!(characterList.size() <= previousCharacterListLength)) {
//            if (characterList.size() == previousCharacterListLength) {
//                bracketsLeft = false;
//            }
//        }
//
//        if (characterList.isEmpty())
//            result = 1;
//
//        System.out.println("Output : " + result);


        // **1
//        char[] sCharArray = S.toCharArray();
//        Stack<String> leftStack = new Stack<String>();
//        Stack<String> rightStack = new Stack<String>();
//        int output = 1;
//
//        for (int i = 0; i < sCharArray.length / 2; i++) {
//            leftStack.add(String.valueOf(sCharArray[i]));
//        }
//        for (int i = sCharArray.length - 1; i >=  sCharArray.length / 2; i--) {
//            rightStack.add(String.valueOf(sCharArray[i]));
//        }
//
//        String leftStackPopElement = "";
//        String rightStackPopElement = "";
//        for (int i = 0; i <= leftStack.size(); i++ ) {
//            leftStackPopElement = leftStack.pop();
//            rightStackPopElement = rightStack.pop();
//
//            if (i == 0 &&
//                (leftStackPopElement.toCharArray()[0] == ')' && rightStackPopElement.toCharArray()[0] == '(') ||
//                (leftStackPopElement.toCharArray()[0] == '}' && rightStackPopElement.toCharArray()[0] == '{') ||
//                (leftStackPopElement.toCharArray()[0] == ']' && rightStackPopElement.toCharArray()[0] == '[')
//            ) {
//                // do nothing
////                System.out.println("0 index. Matched found. ,, left , right :: " + leftStackPopElement + " , " + rightStackPopElement);
//            } else if (
//                    (leftStackPopElement.toCharArray()[0] == '(' && rightStackPopElement.toCharArray()[0] == ')') ||
//                    (leftStackPopElement.toCharArray()[0] == '{' && rightStackPopElement.toCharArray()[0] == '}') ||
//                    (leftStackPopElement.toCharArray()[0] == '[' && rightStackPopElement.toCharArray()[0] == ']')
//            ) {
//                // do nothing
////                System.out.println("Matched found. ,, left , right :: " + leftStackPopElement + " , " + rightStackPopElement);
//            } else {
////                System.out.println("No Matched. ,, left , right :: " + leftStackPopElement + " , " + rightStackPopElement);
//                output = 0; break;
//            }
//        }
//
//
//        System.out.println("Output : " + output);

    }

    static String printStack(Stack<Character> stack) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i=0; i < stack.size(); i++) {
            strBuilder.append(stack.get(i));
        }

        return strBuilder.toString();
    }
}