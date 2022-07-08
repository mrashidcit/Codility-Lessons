import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{4, 1, 3, 2};
//        int[] A = new int[]{4, 1, 3};
//        int[] A = new int[]{2};
//        int[] A = new int[]{3, 2};
//        int[] A = new int[]{2, 1};
        int[] A = new int[]{9, 5, 7, 3, 2, 7, 3, 1, 10, 8};

        int resultStatus = 1;
        Arrays.sort(A);

        for(int i = 0; i < A.length - 1; i++) {

            System.out.println("i , A[i]+1 == A[i+1] :: " + i + " , " + (A[i]+1) + "==" + A[i+1]);
            if (A[i]+1 == A[i+1]) {
                // Do nothing
            } else {
                resultStatus = 0; break;
            }


//            for(int j = i + 1; j < A.length; i++) {
//                if (!(A[i] == A[j] - 1 )) {
//                    resultStatus = 0; i = A.length - 1; break;
//                }
//            }
        }


        if (A.length == 1 && A[0] == 1) resultStatus = 1;
        if (A.length == 1 && A[0] != 1) resultStatus = 0;
        if (A.length > 1 && A[0] != 1) resultStatus = 0;



        System.out.println("Output : " + resultStatus);


    }
}