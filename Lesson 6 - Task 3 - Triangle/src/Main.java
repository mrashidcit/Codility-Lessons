public class Main {
    public static void main(String[] args) {

//        int[] A = new int[] {10, 2, 5, 1, 8, 20};
//        int[] A = new int[] {1, 1, 1, 1, 5, 5, 5};
        int[] A = new int[] {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
//        int[] A = new int[] {1, 1, 1};

        int Q = 0, R = 0;
        int totalTriangles = 0;
        int tempQ = 0, tempP = 0;
        outerloop:
        for(int P = 0; P < A.length - 2; P++) {

            tempP = P;
            for (Q = tempP+1; Q < A.length - 1; Q++) {
                R = Q+1;
//                System.out.println(tempP + " , " + Q + " , " + R + " = " + A[tempP] + " , " + A[Q] + " , " + A[R]);
//                System.out.println(( (long) A[tempP] + A[Q]));
                if (((long) A[tempP] + A[Q]) > A[R] &&
                    ((long) A[Q] + A[R]) > A[tempP] &&
                    ((long) A[R] + A[tempP]) > A[Q]
//                        A[tempP] != A[Q] &&
//                        A[tempP] != A[R] &&
//                        A[Q] != A[R]
                ) {
//                    System.out.println("true");
                    totalTriangles++;
                    break outerloop;
                }
            }

            tempP = P;
            for (Q = tempP+2; Q < A.length - 1; Q++) {
                R = Q+1;
//                System.out.println(tempP + " , " + (tempP+1) + " , " + R + " = " + A[tempP] + " , " + A[tempP+1] + " , " + A[R]);
                if (((long) A[tempP] + A[tempP+1]) > A[R] &&
                        ((long) A[tempP+1] + A[R]) > A[tempP] &&
                        ((long) A[R] + A[tempP]) > A[tempP+1]
//                        A[tempP] != A[tempP+1] &&
//                        A[tempP] != A[R] &&
//                        A[tempP+1] != A[R]
                ) {
//                    System.out.println("true");
                    totalTriangles++;
                    break outerloop;
                }
            }

            tempP = P;
            for (Q = tempP+2; Q < A.length - 2; Q++) {
                R = Q+1;
//                System.out.println(tempP + " , " + (tempP+2) + " , " + R + " = " + A[tempP] + " , " + A[tempP+2] + " , " + A[R]);
                if (((long) A[tempP] + A[tempP+2]) > A[R] &&
                        ((long) A[tempP+2] + A[R]) > A[tempP] &&
                        ((long) A[R] + A[tempP]) > A[tempP+2]
//                        A[tempP] != A[tempP+2] &&
//                        A[tempP] != A[R] &&
//                        A[tempP+2] != A[R]
                ) {
//                    System.out.println("true");
                    totalTriangles++;
                    break outerloop;
                }
            }

        }

        System.out.println("Output : " + totalTriangles);

    }
}