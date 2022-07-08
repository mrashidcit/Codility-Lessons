import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        int A = 6; int B = 11; int K = 2;
        int A = 0; int B = 1; int K = 11;
//        int A = 10; int B = 10; int K = 5;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        int counter = 0;
        int i = A;
//        if (A < B) {
            while (i <= B) {
                if (i % K == 0) {
//                    arrayList.add(i);
                    counter++;
                }
                i++;
            }
//        }


        System.out.println("Output : " + counter);
    }
}