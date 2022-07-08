import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[] {1, 2, 3, 4, 3, 4, 1, 2, 3, 4};
//        int[] A = new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
//        int[] A = new int[] {5};
//        int[] A = new int[] {3, 3, 3};
//        int[] A = new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2, 2, 2, 2, 6, 2};

        // Finding Peaks Indexes
        ArrayList<Integer> peakIndexes = new ArrayList<Integer>();
//        ArrayList<Integer> peakValues = new ArrayList<Integer>();
        // Every Next Peak Value is the sum of it's distance from previous peak
        ArrayList<Integer> peakValuesPlusDistance = new ArrayList<Integer>();
        int n = A.length;
        for (int i = 1; i < n-1; i++) {
            if (A[i-1] < A[i] && A[i] > A[i+1]) {
                peakIndexes.add(i);
//                peakValues.add(A[i]);
                i++; // Skipping the i+1 element for next check
            }
        }

        System.out.println("Peak Values : " + printArrayList(peakIndexes));

        int totalFlags = peakIndexes.size();
        int noOfInstalledFlags = 0;
        int diff = 0; int lastFlagPeakIndex = 0;
        if (peakIndexes.size() == 0) {
            // Do nothing
        } else  {
            lastFlagPeakIndex = peakIndexes.get(0); noOfInstalledFlags++;
            for (int i = 1 ; i < peakIndexes.size(); i++) {
                diff = Math.abs(lastFlagPeakIndex - peakIndexes.get(i));
                if (diff >= totalFlags) {
                    noOfInstalledFlags++; lastFlagPeakIndex = peakIndexes.get(i);
                }

            }
        }



        System.out.println("TotalFlagInstalled : " + noOfInstalledFlags);

//        System.out.println("Distance : " + getDistanceBetweenToPeaks(A, 1, 5));


    }

    public static int getDistanceBetweenToPeaks(int[] A, int peakAIndex, int nextPeakIndex) {
        int distance = 0;
        int nextPeakPlusDistance = A[peakAIndex];
        for (int i = peakAIndex+1; i < nextPeakIndex-1; i++) {
            nextPeakPlusDistance += A[i];
        }

        distance = Math.abs(peakAIndex - nextPeakPlusDistance);
        return distance;
    }

    public static String printArrayList(ArrayList items) {
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i < items.size(); i++)
            strBuilder.append(items.get(i) + ",");
        return strBuilder.toString();
    }
}