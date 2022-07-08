public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{4, 2, 2, 5, 1, 5, 8};
//        int[] A = new int[]{10, 10, -1, 2, 4, -1, 2, -1};
        int P = 0; int Q = P + 1;

        int minimumSumAvg = Integer.MAX_VALUE;
        int minimumSliceStartIndex = 0; int minimumSliceStartIndexValue = Integer.MAX_VALUE;
        for (int tempP = 0; tempP < A.length - 1; tempP++) {

            int sum = 0; int sumAvg = 0;
            System.out.println("tempP = " + tempP);
            for (int tempQ = tempP+1; tempQ < A.length; tempQ++) {
                sum = 0;

                for (int j = tempP; j <= tempQ; j++) {
//                    System.out.println("j = "  + j);
                    sum += A[j];
                }
                sumAvg = sum / (tempQ - tempP + 1);
                if (sumAvg <= minimumSumAvg && A[tempP] <= minimumSliceStartIndexValue) {
                    minimumSumAvg = sumAvg ;
                    minimumSliceStartIndex = tempP;
                    minimumSliceStartIndexValue = A[tempP];
                }
                System.out.println("tempP , tempQ , sum , sumAvg ::: " + tempP + " , " + tempQ + " , " + sum + " , " + sumAvg);

            }

        }


        System.out.println("minimumSumAvg : " + minimumSumAvg);
        System.out.println("Output : " + minimumSliceStartIndex);

    }
}