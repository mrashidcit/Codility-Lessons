public class Main {
    public static void main(String[] args) {

        int N = 24;
//        int N = 36;
        int factorCounter = 0;

//        for (int i = 1; i <= N; i++) {
//            if (N % i == 0) {
//                factorCounter++;
//            }
//        }

        System.out.println("Result : " + divisors(N));

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