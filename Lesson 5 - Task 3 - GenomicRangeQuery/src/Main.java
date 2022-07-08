import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        String S = "CAGCCTA";
        int[] P = new int[]{2, 5, 0};
        int[] Q = new int[]{4, 5, 6};


        HashMap<String, Integer> impactFactorHashMap = new HashMap<>();
        impactFactorHashMap.put(String.valueOf('A') , 1);
        impactFactorHashMap.put(String.valueOf('C'), 2);
        impactFactorHashMap.put(String.valueOf('G'), 3);
        impactFactorHashMap.put(String.valueOf('T'), 4);

        ArrayList<Integer> impactArrayList = new ArrayList<Integer>();
        int minimumImpactValue = Integer.MAX_VALUE;
        char[] sCharArray = S.toCharArray();
        int pItem = 0; int qItem = 0;
        int[] tempImpactValues = new int[]{};
        int tempImpactIndex = 0;
        for (int i = 0; i < P.length; i++) {
            pItem = P[i]; qItem = Q[i];
            tempImpactValues = new int[(qItem - pItem) + 1];
            tempImpactIndex = 0;
            for (int j = pItem; j <= qItem; j++) {
//                System.out.println(sCharArray[j]);
//                System.out.println(impactFactorHashMap.get(String.valueOf('G') ));
                if (impactFactorHashMap.get(String.valueOf(sCharArray[j]) ) < minimumImpactValue)
                    tempImpactValues[tempImpactIndex] = impactFactorHashMap.get(String.valueOf(sCharArray[j]) );

                tempImpactIndex++;
            }
            impactArrayList.add(Arrays.stream(tempImpactValues).min().getAsInt());
        }
        impactArrayList.stream().mapToInt(i -> i).toArray();
        System.out.println("impactArrayList : " + Main.printArrayList(impactArrayList));


    }

    private static String printArrayList(ArrayList<Integer> impactArrayList) {
        StringBuilder strBuilder = new StringBuilder();
        for (int i =0; i < impactArrayList.size(); i++) {
            strBuilder.append(impactArrayList.get(i) + " , ");
        }
        return strBuilder.toString();
    }
}