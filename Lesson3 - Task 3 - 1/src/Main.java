import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{3, 1, 2, 4, 3};
//        int[] A = new int[]{3, 1, 2, 4, 3, -2, -4};
//        int[] A = new int[]{-1000, 1000};
        int P = 1;
        int minimalDifference = Integer.MAX_VALUE;
        HashSet<Integer> outputHashSet = new HashSet<Integer>();
        ArrayList<Integer> outputArrayList = new ArrayList<Integer>();
        while (P < A.length) {

            int part1Sum = 0; int part2Sum = 0;

            // ***3
//            part1Sum = Arrays.stream(A, 0, P).sum();
//            part2Sum = Arrays.stream(A, P, A.length).sum();

            // ***2
            for (int i = 0; i < P; i++) {
                part1Sum += A[i];
            }
            for (int i = P; i < A.length; i++) {
                part2Sum += A[i];
            }


            // ***1
//            for(int i = 0; i < A.length; i++) {
//                if (i < P) {
//                    part1Sum += A[i];
//                } else {
//                    part2Sum += A[i];
//                }
//            }

            int output = (part1Sum - part2Sum);
            if (output < 0) output *= -1;

//            System.out.println("part1Sum - part2Sum = output ::: " + part1Sum + " - " + part2Sum + " = " + output);
//            if (output < minimalDifference) minimalDifference = output;
            outputArrayList.add(output);

            P++;
        }
        Collections.sort(outputArrayList);
        minimalDifference = outputArrayList.get(0);

        System.out.println("Output : " + minimalDifference);

    }
}