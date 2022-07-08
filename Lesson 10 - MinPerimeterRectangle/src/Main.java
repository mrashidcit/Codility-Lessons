public class Main {
    public static void main(String[] args) {

//        int N = 30;
        int N = 1;

        int A = 0; int B = 0;
        int perimeter = Integer.MAX_VALUE; int minPerimeter = Integer.MAX_VALUE;

        B = N;

        // ***2
        int i = 1;
        while (i*i <= N) {
            if (N % i == 0) {
                A = i;
                for (int j = N; j >= 1; j--) {
                    B = j;
                    if (A*B == N) {
//                            System.out.println("A * B = area , perimeter :: " + A + " * " + B + " = " + (A*B) + " , " + (2*(A+B)));
                        perimeter = 2*(A+B);
                        if (perimeter < minPerimeter)
                            minPerimeter = perimeter;
                    }
                }

            }

            i++;
        }

        // ***1
//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                A = i;
//                for (int j = N; j >= 1; j--) {
//                    B = j;
//                    if (A*B == N) {
////                            System.out.println("A * B = area , perimeter :: " + A + " * " + B + " = " + (A*B) + " , " + (2*(A+B)));
//                        perimeter = 2*(A+B);
//                        if (perimeter < minPerimeter)
//                            minPerimeter = perimeter;
//                    }
//                }
//
//            }
//        }



        System.out.println("Result : " + minPerimeter);


    }

    public static int divisors(int n) {
        int i = 1; int result = 0;
        while(i * i < n) {
            if (n % i == 0)
                result += 2;
            i += 1;
        }
        if (i * i == n)
            result += 1;

        return result;
    }

}