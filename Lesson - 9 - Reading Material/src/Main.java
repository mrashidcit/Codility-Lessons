import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[] {5, -7, 3, 5, -2, 4, -1};

        // ***4
        System.out.println("Input Array : " + printArray(A));
        System.out.println("Result : " + golden_max_slice(A));

        // ***3
//        System.out.println("Result : " + quadratic_max_slice(A));

        // ***2

//        System.out.println("Input Array : " + printArray(A));
//        int[] prefixSumArray = getPrefixSumArray(A);
//        System.out.println("PrefixSum Array : " + printArray(prefixSumArray));
//
//        System.out.println("Result : " + quadratic_max_slice(A, prefixSumArray));

        // ***1

//        System.out.println("Result : " + slow_max_slice(A));


    }

    public static int golden_max_slice(int[] A) {
        int max_ending = 0; int max_slice= 0;
        for (int a=0; a<A.length; a++) {
            max_ending = Integer.max(0, max_ending+a);
            max_slice = Integer.max(max_slice, max_ending);
        }
        return max_slice;
    }

    public static int[] getPrefixSumArray(int[] A) {
        int n = A.length;
        int outputArray[] = new int[n+1];
//        outputArray[0] = A[0];
        for(int i = 1; i < n+1; i++)
            outputArray[i] = outputArray[i-1] + A[i-1];

        return outputArray;
    }

    private static String printArray(int[] A) {
        StringBuilder strBuilder = new StringBuilder();

        for(int i = 0; i < A.length; i++)
            strBuilder.append(A[i] + " , ");

        return strBuilder.toString();
    }

    public static int slow_max_slice(int[] A) {
        int n = A.length; int result = 0; int sum = 0;
        for (int p = 0; p < n; p++) {
            for (int q = p; q < n; q++) {
                sum = 0;
                for(int i = p; i < q+1; i++)
                    sum += A[i];
                result = Integer.max(result, sum);
            }
        }
        return result;
    }

    public static int quadratic_max_slice(int[] A) {
        int n = A.length; int result = 0; int sum = 0;
        for (int p = 0; p < n; p++) {
            sum = 0;
            for (int q = p; q < n; q++) {
                sum += A[q];
                result = Integer.max(result, sum);
            }
        }
        return  result;
    }

    public static int quadratic_max_slice(int[] A, int[] pref) {
        int startIndex = 0; int endIndex = 0;
        int n = A.length; int result = 0; int sum = 0;
        for (int p = 0; p < n; p++) {
            startIndex = p;
            for (int q = p; q < n-1; q++) {
                endIndex = q;
                sum = pref[q+1] - pref[p];
                result = Integer.max(result, sum);
            }

        }
//        System.out.println(">> startIndex , endIndex : " + startIndex + " , " + endIndex);
        return  result;
    }
}