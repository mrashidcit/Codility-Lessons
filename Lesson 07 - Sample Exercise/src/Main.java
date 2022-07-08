import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        int[] A = new int[] {0, 1, 0, 1, 1, 0, 0, 0, 1, 1};

        LinkedList<Integer> counterQueue = new LinkedList<Integer>();
        LinkedList<Integer> incomingCustomersToStoreQueue = new LinkedList<Integer>();

        for (int i = 0; i < A.length; i++ ){
            if (A[i] == 1)
                counterQueue.add(A[i]);
            else
                incomingCustomersToStoreQueue.add(A[i]);
        }

        System.out.println("Total Customers Already in Row are : " + counterQueue.size());

    }
}