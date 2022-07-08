import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{4, 3, 2, 1, 5};
//        int[] B = new int[]{0, 1, 0, 0, 0};
//        int[] A = new int[]{0, 1};
//        int[] B = new int[]{1, 1};
        int[] A = new int[]{4, 1, 2, 1, 5};
        int[] B = new int[]{0, 1, 0, 0, 0};



        // ****2
        Stack<Integer> fishStack = new Stack<Integer>();
        Stack<Integer> directionStack = new Stack<Integer>();

        boolean isFirstDownStreamFound = false;
        int lastFishInStack = 0; int lastFishDirection = 0;
        for (int i = 0; i < A.length; i++) {

            if(B[i] == 1 && !isFirstDownStreamFound) {
                isFirstDownStreamFound = true;
                fishStack.push(A[i]); directionStack.push(B[i]);

            } else if (isFirstDownStreamFound) {

                lastFishInStack = fishStack.lastElement();
                lastFishDirection = directionStack.lastElement();

                if (lastFishDirection != B[i]) {
                    if (lastFishInStack > A[i]) {
                        // Do nothing No need to Add this Firsh in the Stack
                        // Because lastfirst of stack will eat this current fish
                    } else if (A[i] > lastFishInStack) {
                        fishStack.pop(); directionStack.pop();
                        fishStack.push(A[i]); directionStack.push(B[i]);
                    }
                } else if (lastFishDirection == B[i]) {
                    fishStack.push(A[i]); directionStack.push(B[i]);
                }

            } else {
                fishStack.push(A[i]); directionStack.push(B[i]);
            }

        }

        int totalFishAlive = fishStack.size();

        System.out.println("Output : " + totalFishAlive);


        // ****1

//        Stack<Integer> upstreamFishingStack = new Stack<Integer>();
//        Stack<Integer> downstreamFishingStack = new Stack<Integer>();
//
//        if (B[0] == 0)
//            upstreamFishingStack.push(A[0]);
//        else
//            downstreamFishingStack.push(A[0]);
//
//
//        int upstreamLastElement = -1; int downstreamLastElement = -1;
//        for (int i = 1; i < A.length; i++) {
//
//            if (upstreamFishingStack.size() != 0)
//               upstreamLastElement = upstreamFishingStack.lastElement();
//            else
//                upstreamLastElement = -1;
//            if (downstreamFishingStack.size() != 0)
//                downstreamLastElement = downstreamFishingStack.lastElement();
//            else
//                downstreamLastElement = -1;
//
//            if (B[i] == 1 && upstreamLastElement != -1 && upstreamLastElement > A[i]) {
//                // No need to Add downstream Fish because it has been eaten by upstreamLastElement
//            } else if (B[i] == 1 && upstreamLastElement != -1 && A[i] > upstreamLastElement) {
//                upstreamFishingStack.pop();
//                downstream
//
//            }
//
//
//        }

    }
}