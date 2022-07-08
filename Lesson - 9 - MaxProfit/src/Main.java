public class Main {
    public static void main(String[] args) {

        int[] A = new int[] {23171, 21011, 21123, 21366, 21013, 21367};
        int maximumProfit =  0; int sum =0;
        for(int i=0; i<A.length; i++) {

            for(int j=i+1; j<A.length; j++){
                sum = A[j] - A[i] ;
                maximumProfit = Integer.max(maximumProfit, sum);
            }
        }

        System.out.println("Outpue : " + maximumProfit);

    }
}