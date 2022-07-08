public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{-3, 1, 2, -2, 5, 6};
        int[] A = new int[]{-5, 5, -5, 4};
//        int[] A = new int[]{-10, -2, -4};
//        int[] A = new int[]{-4, -6, 3, 4, 5};
//        int[] A = new int[]{-5, -6, -4, -7, -10};

        // ***3
//        int maxTripleMultiply = 0;
//        int temp = 0;
//        boolean isMinus = false;
//        int firstValuePair = 1;
//        for (int i = 0; i < A.length - 2; i++) {
//
//            for (int j = i+1; j+1 < A.length; j++) {
//                temp = A[i] * A[j] * A[j+1];
//                System.out.println(A[i] + " * " + A[j] + " * " + A[j+1] + " = " + temp);
//
//                if (maxTripleMultiply < temp)
//                    maxTripleMultiply = temp;
//                else if(maxTripleMultiply == 0)
//                    maxTripleMultiply = temp;
//                else if (maxTripleMultiply < temp)
//                    maxTripleMultiply = temp;
//            }
//
//            for (int j = i+2; j < A.length; j++) {
//                temp = A[i] * A[i+1] * A[j];
//                System.out.println(A[i] + " * " + A[i+1] + " * " + A[j] + " = " + temp);
//
//                if (maxTripleMultiply < temp)
//                    maxTripleMultiply = temp;
//                else if(maxTripleMultiply == 0)
//                    maxTripleMultiply = temp;
//                else if (maxTripleMultiply < temp)
//                    maxTripleMultiply = temp;
//            }
//
//        }
//
//        System.out.println("Output : " + maxTripleMultiply);

        // ***2
//        int maxTripleMultiply = 0;
//        int temp = 0;
//        boolean isMinus = false;
//        for (int i = 0; i+2 < A.length; i++) {
//            temp = A[i] * A[i+1] * A[i+2];
//            if (temp < 0) {
//                temp *= -1; isMinus = true;
//            } else {
//                isMinus = true;
//            }
//            if (maxTripleMultiply < temp)
//                maxTripleMultiply = temp;
//        }
//        if (isMinus) maxTripleMultiply *= -1;
//
//        System.out.printf("Output: " + maxTripleMultiply);

        // ***1
        MergeSort mergeSort = new MergeSort();

        System.out.println("InputArray : " + Main.printArray(A));
        mergeSort.mergeSort(A, 0, A.length - 1);
        System.out.println("SortedArray : " + Main.printArray(A));
        int arrayLength = A.length;
        int maxTripleMultiply = A[arrayLength - 3] * A[arrayLength - 2] * A[arrayLength - 1];

        System.out.println("Output : " + maxTripleMultiply);
    }
    static String printArray(int arr[]) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i=0; i<arr.length; i++) {
            strBuilder.append(arr[i] + " , ");
        }
        return strBuilder.toString();
    }
}

class MergeSort {

    // Merge two subarrays L and M into arr
    void merge(int arr[], int p, int q, int r) {

        // Create L <- A[p..q] and M <- A[q+1..r]
        int n1 = q - p + 1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for (int i=0; i < n1; i++)
            L[i] = arr[p + i];
        for (int j=0; j < n2; j++)
            M[j] = arr[q + 1 + j];

        // Maintain current index of sub-arrays and main array
        int i, j, k;
        i = 0; j = 0; k = p;

        // Untill we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < n1 && j < n2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i]; i++;
            } else {
                arr[k] = M[j]; j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < n1) {
            arr[k] = L[i];
            i++; k++;
        }

        while (j < n2) {
            arr[k] = M[j];
            j++; k++;
        }
    }

    // Divide the array into two subarrays, sort them and merge them
    void mergeSort(int arr[], int l, int r) {
        if (l < r) {

            // m is the point where the array is divided into the two sub arrays
            int m = (l + r) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m+1, r);

            // Merge the sorted subarrays
            merge(arr, l, m, r);
        }
    }

}