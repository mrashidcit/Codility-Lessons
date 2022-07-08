public class Main {
    public static void main(String[] args) {

//        int[] A = new int[] {3, 2, -6, 4, 0};
//        int[] A = new int[] {-10};
        int[] A = new int[] {-2, -2};

        int result = 0;
        if (A.length == 1){
            result = A[0];
        } else {
            result = quadratic_max_slice(A);
        }


        System.out.println("Result : " + result);

    }

    public static int quadratic_max_slice(int[] A) {
        int n = A.length; int result = Integer.MIN_VALUE; int sum = 0;
        for (int p = 0; p < n; p++) {
            sum = 0;
            for (int q = p; q < n; q++) {
                sum += A[q];
                result = Integer.max(result, sum);
            }
        }
        return  result;
    }
}
