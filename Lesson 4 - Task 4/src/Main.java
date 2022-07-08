import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{1, 3, 6, 4, 1, 2};
//        int[] A = new int[]{1, 2, 3};
//        int[] A = new int[]{-1, -3};
//        int[] A = new int[]{2};
//        int[] A = new int[]{1};
        int[] A = new int[]{4, 5, 6, 2};

        Arrays.sort(A);
        HashSet<Integer> aHashSet = new HashSet<Integer>();
        for (int i=0; i < A.length; i++) {
            aHashSet.add(A[i]);
            aHashSet.add(A[i]);
        }
        A = aHashSet.stream().mapToInt(o -> (int) o).toArray();

        // ***2
        int smallestPositiveInteger = 1;
        if (A.length == 1) {
            if (A[0] == 1)
                smallestPositiveInteger = 2;
            else if (A[0] > 1)
                smallestPositiveInteger = A[0] - 1;

        } else if (A.length > 1 && A[0] > 1) {
                smallestPositiveInteger = 1;
        } else {

            ArrayList<Integer> missingNumbersArrayList = new ArrayList<Integer>();
            int firstElement = A[0];
            for (int i=1; i < A.length; i++) {
                if (!(firstElement == A[i] - 1)) {
                    missingNumbersArrayList.add(firstElement+1); firstElement = A[i];
                } else {
                    firstElement = A[i];
                }

            }

            if (missingNumbersArrayList.size() > 0)
                smallestPositiveInteger = missingNumbersArrayList.get(0);
            else
                smallestPositiveInteger = A[A.length - 1] + 1;

            if (smallestPositiveInteger <= 0)
                smallestPositiveInteger = 1;

        }


        System.out.println("Output : " + smallestPositiveInteger);
        // ***1

        // Now find the missing no
//        int smallestPositiveInteger = A[0];
//        for (int i = 1; i < A.length; i++) {
//            System.out.println(smallestPositiveInteger + " <= " + A[i]);
//            if (smallestPositiveInteger <= A[i]) {
//                smallestPositiveInteger++;
//            }
//
//        }

//        System.out.println("Output : " + smallestPositiveInteger);
    }
}