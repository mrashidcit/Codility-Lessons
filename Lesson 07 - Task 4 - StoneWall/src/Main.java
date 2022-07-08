import java.util.ArrayList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

//        int[] H = new int[]{8, 8, 5,
//                            7, 9, 8,
//                            7, 4, 8};
//        int[] H = new int[]{8, 8};
//        int[] H = new int[]{8};
        int[] H = new int[]{8, 8, 5,
                            7, 9, 8,
                            7, 4, 8};


        Stack<Integer> itemsStack = new Stack<Integer>();
        int blocksCounter = 0;


        for(int i = 0; i < H.length + 1; i++) {

            if (i < H.length) {
                if (itemsStack.isEmpty()) {
                    itemsStack.push(H[i]);

                } else if (H[i] >= itemsStack.firstElement()) {

                    itemsStack.push(H[i]);

                } else if (H[i] < itemsStack.lastElement()) {

                    blocksCounter = getBlocksCounter(itemsStack, blocksCounter); i--;

                }
            } else  {
                blocksCounter = getBlocksCounter(itemsStack, blocksCounter);
            }

        }



        System.out.println("Output : " + blocksCounter);

    }

    private static int getBlocksCounter(Stack<Integer> itemsStack, int blocksCounter) {
        while (itemsStack.size() > 0) {

            int minimumHeight = itemsStack.get(0);
            for(int j = 1; j < itemsStack.size(); j++) {
                if (itemsStack.get(j) < minimumHeight) {
                    minimumHeight = itemsStack.get(j);
                }
            }

            // making one block on minimumHeight
            blocksCounter++;

            // minus the minimumHeight From the Existing items
            for (int j = 0; j < itemsStack.size(); j++) {
                if ((itemsStack.get(j) - minimumHeight) == 0) {
                    itemsStack.remove(j); j--;
                } else {
                    itemsStack.set(j, itemsStack.get(j) - minimumHeight);
                }
            }

        } // [END] while loop
        return blocksCounter;
    }


}