public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{1, 5, 2, 1, 4, 0};
//        int[] A = new int[]{1, 1, 1};
        int[] A = new int[]{1, 2147483647, 0};

//        long a =  2147483647;
//        a += 1;
//        System.out.println("a = " + a);

        int totalIntersections = 0;
        for (int i = 0; i < A.length; i++) {

            for (int j = i+1; j < A.length; j++ ) {


//                if ( (i <= j || A[i] <= A[j])
////                        &&
////                        (i >= j || A[i] >= A[j])
//                ) {
                    long circle1LeftValue = i - (long) A[i];
                    int circle1Center = A[i];
                    long circle1RightValue = i + (long) A[i];
                    long circle2LeftValue = j - (long) A[j];
                    int circle2Center = A[j];
                    long circle2RightValue = j + (long) A[j];

//                System.out.println("i , j :: A[i] , A[j] = " + i + " , " + j + " :: " + A[i] + " , " + A[j] +
//                        " ,,, circle1Left, circle1Right : circle2Left, circle2Right = " + circle1LeftValue + " , " + circle1RightValue + " : " + circle2LeftValue + " , " + circle2RightValue );


                // circle1 right lies within Circle2
                 if (
                     (circle1RightValue >= circle2LeftValue &&
                        circle1RightValue <= circle2RightValue)
                    ) {
//                        System.out.println("Inersaction found. : circle1 right line lies within Circle2");
                        totalIntersections++;

                    // If whole circle2 lies within circle1
                } else if (
                         ( circle2LeftValue >= circle1LeftValue &&
                                circle2RightValue <= circle1RightValue )
                 ) {
//                     System.out.println("Inersaction found. : circle2 whole lies within circle1");
                     totalIntersections++;
                 }


                }

        }

        System.out.println("Output : " + totalIntersections);


    }
}