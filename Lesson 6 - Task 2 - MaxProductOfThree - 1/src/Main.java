public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{-3, 1, 2, -2, 5, 6};
//        int[] A = new int[]{-5, 5, -5, 4};
//        int[] A = new int[]{-10, -2, -4};
        int[] A = new int[]{-4, -6, 3, 4, 5};
//        int[] A = new int[]{-5, -6, -4, -7, -10};
//        int[] A = new int[]{23, 45, 22, 10, 234, 500, 200, 300, 40, 100, 65, 75};

        int maxProductOfTriplet = Integer.MIN_VALUE;
        int tempValue = 0;
        for (int i =0; i < A.length - 2; i ++) {

            for (int j = i+1; j < A.length - 1; j++) {
                tempValue = A[i] * A[j] * A[j+1];
                System.out.println(A[i] + " * " + A[j] + " * " + A[j+1] + " = " + tempValue);
                if (maxProductOfTriplet < tempValue)
                    maxProductOfTriplet = tempValue;

                if (i+1 != j) {
                    tempValue = A[i] * A[i+1] * A[j+1];
                    System.out.println(A[i] + " * " + A[i+1] + " * " + A[j+1] + " = " + tempValue);
                    if (maxProductOfTriplet < tempValue)
                        maxProductOfTriplet = tempValue;
                }

            }

        }

        System.out.println("Output : " + maxProductOfTriplet);

    }
}