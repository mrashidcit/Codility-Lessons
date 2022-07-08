public class Main {
    public static void main(String[] args) {

//        System.out.println("Total Divisors : " + divisors(36));
//        System.out.println("Total Divisors : " + divisors(4));
//        System.out.println("Total Divisors : " + primality(3));
        System.out.println("Tail Coins : " + coins(10));

    }

    public static int coins(int n ) {
        int result = 0; int[] coin = new int[n+1];
        int k = 0;
//        System.out.println("Initial Coins Array ::: " + printArrayStartingFromIndex1(coin));
        for (int i = 1; i < n + 1; i++) {
            k = i;
            while (k <= n) {
                coin[k] = (coin[k] + 1) % 2;
                k += i;
            }
//            System.out.println("i = " + i + " ::: " + printArrayStartingFromIndex1(coin));
            result += coin[i];
        }

        return result;
    }

    public static String printArrayStartingFromIndex1(int[] A) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i=1; i<A.length; i++)
            strBuilder.append(A[i] + ", ");

        return strBuilder.toString();
    }

    public static boolean primality(int n) {
        int i = 2;
        while (i*i <= n) {
            if (n%i == 0)
                return false;
            i += 1;
        }
        return true;
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