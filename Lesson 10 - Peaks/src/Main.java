import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int[] A = new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2};
//        int[] A = new int[] {5};
//        int[] A = new int[] {3, 3, 3};
//        int[] A = new int[] {3, 4, 3};
//        int[] A = new int[] {0, 1, 0, 0, 1, 0, 0, 1, 0};
//        int[] A = new int[] {1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2, 2, 2, 2, 6, 2};

        System.out.println("Length : " + A.length);

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

//        System.out.println("Peak Indexes : " + printArrayList(peakIndexes));

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

        int eachBlockLength = 1; int divider = 1;
        int noOfBlocks = 1;


        int currentBlockCounter = 1;
        int currentBlockStartIndex = 0; int currentBlockLastIndex = 0;

//        if ((n%2) != 0) {
//            if (peakIndexes.size() > 0)
//                noOfBlocks = 1;
//            else
//                noOfBlocks = 0;
//        } else {

            if (n%2 != 0)
                n--; // considering only positive set of Elements array only

            outterLoop:
            while (true) {
//            System.out.println(">> trying to check these noOfBlocks : " + noOfBlocks);
                eachBlockLength = n/noOfBlocks; currentBlockCounter = 1;
                currentBlockStartIndex = 0; currentBlockLastIndex = 0;

                while (currentBlockCounter <= noOfBlocks) {

                    currentBlockLastIndex = (currentBlockStartIndex + eachBlockLength - 1);

//                System.out.println("Block " + currentBlockCounter + " : startIndex , endIndex " + currentBlockStartIndex + " , " + currentBlockLastIndex);

                    boolean isPeakFoundInTheBlock = false;
                    innerLoop:
                    for (int i=0; i<peakIndexes.size(); i++) {
                        if (peakIndexes.get(i) >= currentBlockStartIndex && peakIndexes.get(i) <= currentBlockLastIndex ) {
//                        System.out.println("Peak found in the block");
                            isPeakFoundInTheBlock = true; break innerLoop;
                        }
                    }

                    if (!isPeakFoundInTheBlock) {
                        noOfBlocks--; // decrement it because in the previous no of blocks there was a peak in every block
                        break outterLoop;
                    }

//            System.out.println("Block " + currentBlockCounter + " : " + printArray(A));

                    currentBlockStartIndex += eachBlockLength;
                    currentBlockCounter++;
                }

                noOfBlocks++;
            }

//        }


        System.out.println("totalValidBlocks : " + noOfBlocks);

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

    public static String printArray(int[] items) {
        StringBuilder strBuilder = new StringBuilder();
        for(int i=0; i < items.length ; i++)
            strBuilder.append(items[i] + ", ");
        return strBuilder.toString();
    }



}