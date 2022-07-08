import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[] {6, 8, 4, 6, 8, 6, 6};
        int[] A = new int[] {6, 8, 4, 6, 8, 6, 6, 8, 8, 8, 8};

//        System.out.println("Slow Leader : " + slowLeader(A));
        System.out.println("Slow Leader : " + goldenLeader(A));

    }


    static int goldenLeader(int[] A) {
        int n = A.length;
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            if (stack.size() == 0) {
                stack.push(A[i]);
            } else {
                if (stack.lastElement() != A[i]){
                    stack.pop();
                } else {
                    stack.push(A[i]);
                }
            }
        }
        int candidate = -1; int leader = -1; int count = 0;
        if (stack.size() > 0)
            candidate = stack.lastElement();
        for (int i = 0; i < n; i++) {
            if (A[i] == candidate) count++;
        }
        if (count > (n/2))
            leader = stack.lastElement();

        return leader;
    }


    static int slowLeader(int[] A) {

        int leader = -1;
        int candidate = 0; int count = 0;
        for (int i = 0; i < A.length; i++) {
            candidate = A[i]; count = 0;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == candidate)
                    count++;
            }
            if (count > (A.length / 2))
                leader = candidate;
        }
        return  leader;
    }
}