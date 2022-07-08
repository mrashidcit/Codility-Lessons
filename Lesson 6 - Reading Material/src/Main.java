public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{5, 2, 8, 14, 1, 16};
        int[] A = new int[]{4, 2, 2, 8, 3, 3, 1};
//        System.out.println("Input : " + printArray(A));
//        A = Main.selectionSort(A);
//
//        System.out.println("Output : " + printArray(A));

        Main.countingSort(A, A.length);

    }

    private static int[] countingSort(int array[], int size) {

        // 1. Find out the maximum element from the given array
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }

        int[] outputArray = new int[array.length];
        // 2. Initialize an array of lenth max+1 with all elements 0.
        int[] countArray = new int[max + 1];

        // 3. Store the count of each element at their respective index in count array
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }

        // 4. Store cumulative sum of the elements of the count array.
        // It helps in placing the elements into the correct index of the stored array.
        for (int i = 1; i < countArray.length; i++) {
            countArray[i] += countArray[i-1];
        }

        // 5. Find the index of each element of the original array in the count array.
        // This given the cumulative count.
        // Place the element at the index calculated as shown in figure below.

        for (int i =0; i < array.length; i++) {
            outputArray[ countArray[array[i]]-1 ] = array[i];
            countArray[array[i]]--;
        }

        System.out.println("countArray : " + Main.printArray(outputArray));



        return array;
    }

    private static int[] selectionSort(int[] A) {

        int tempMinimalValue = 0;
        for(int i = 0; i < A.length; i ++) {
            for (int j = i+1; j < A.length; j++) {

                if (A[j] < A[i]) {
                    tempMinimalValue = A[j];
                    A[j] = A[i]; A[i] = tempMinimalValue;
                }

            }
        }

        return A;
    }

    private static String printArray(int[] items) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i =0; i < items.length; i++) {
            strBuilder.append(items[i] + " , ");
        }
        return strBuilder.toString();
    }
}