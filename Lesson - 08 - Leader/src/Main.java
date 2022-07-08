public class Main {
    public static void main(String[] args) {

        int[] A = new int[]{ 3, 4, 3, 2, 3, -1, 3, 3 };

        int leaderIndex = -1;
        int leader = -1; int counter = 0; int n = A.length;
        int candidate = 0;
        for (int i = 0; i < n; i++) {
            candidate = A[i]; counter = 0;
            for (int j = 0; j < n; j++) {
                if (A[j] == candidate)
                    counter++;
            }
            if (counter > (n/2)) {
                leader = candidate; leaderIndex = i;
            }

        }

        System.out.println("Output : " + leaderIndex);


    }
}