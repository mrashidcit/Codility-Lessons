import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int N = 5;
        int[] A = new int[]{3, 4, 4, 6, 1, 4, 4};
//        int[] ACounterArray = new int[A.length];
        int[] counterArrayList = new int[N];

        // ***2
//        for (int i = 0; i < A.length; i++){
//            ACounterArray[A[i]] = ACounterArray[A[i]] + 1;
//        }
//        System.out.println("ACounterArray : " + printArrayList(ACounterArray));



//        for (int i = 0; i < N; i++) {
//            counterArrayList[0] = 0;
//        }
//        System.out.println(Main.printArrayList(counterArrayList));

        int ak = 0; int maxValueOfCounter = 0;
        for (int i = 0; i < A.length; i++) {
            ak = A[i];
            for (int X = 1; X <= N; X++ ) {
                if (ak == X) {
                    counterArrayList[X-1] = counterArrayList[X-1] + 1;
                } else if (ak == N + 1) {
                    maxValueOfCounter = Arrays.stream(counterArrayList).max().getAsInt();
                    for(int j=0; j < counterArrayList.length; j++ )
                        counterArrayList[j] = maxValueOfCounter;

                }
            }
//            System.out.println(Main.printArrayList(counterArrayList));

        }





    }

    static String printArrayList(int[] inputArray) {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("(");
        for (int i = 0; i < inputArray.length; i++) {
            strBuilder.append(inputArray[i] + ", ");
        }
        strBuilder.append(")");
        return strBuilder.toString();
    }


}