public class Main {
    public static void main(String[] args) {

//        int[] A = new int[]{4, 3, 4, 4, 4, 2};
        int[] A = new int[]{3, 3, 2, 4, 4, 2};
        int n = A.length;

        int leader1 = 0;
        int leader2 = 0;
        int counter = 0;
        int equiLeaderCounter = 0;

        for (int S = 1; S < n; S++) {
            leader1 = getLeaderFor1stArray(A, 0, S);
            leader2 = getLeaderFor2ndArray(A, S, A.length);
            if (leader1 == leader2 && (leader1 != -1 || leader2 != -1))
                equiLeaderCounter++;

        }
//        leader1 = getLeaderFor1stArray(A, 0, 1);
//        leader2 = getLeaderFor2ndArray(A, 1, A.length);
//        System.out.println("Leader1 , Leader2 : " + leader1 + " , " + leader2);

        System.out.println("Output : " + equiLeaderCounter);
    }

    private static int getLeaderFor1stArray(int[] A, int startIndex, int endIndex) {
        int leader = -1;
        int candidate = 0;
        int leaderIndex = -1;
        int counter = 0;
        int n = endIndex;

        for (int i = startIndex; i < n; i++) {
            candidate = A[i]; counter = 0;

            for(int j = startIndex; j < n; j++) {
                if(A[j] == candidate)
                    counter++;
            }
            if (counter > (n/2))
                leader = candidate; leaderIndex = i;

        }
        return leader;
    }

    private static int getLeaderFor2ndArray(int[] A, int startIndex, int endIndex) {
        int leader = -1;
        int candidate = 0;
        int leaderIndex = -1;
        int counter = 0;
        int n = endIndex;
        int halfOfTheArray = (endIndex - startIndex) / 2;

        for (int i = startIndex; i < n; i++) {
            candidate = A[i]; counter = 0;

            for(int j = startIndex; j < n; j++) {
                if(A[j] == candidate)
                    counter++;
            }
            if (counter > halfOfTheArray)
                leader = candidate; leaderIndex = i;

        }
        return leader;
    }


}