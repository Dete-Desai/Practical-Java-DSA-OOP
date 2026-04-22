package TheCollectionsFrameWork.CollectionsAndGenerics;

import java.util.ArrayList;

public class ArrayListDS {
    public static void main(String[] args) {
        ArrayList arrayList1 = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<String>();
        ArrayList<Integer> arrayList3 = new ArrayList<Integer>();

        arrayList1.add("Lamech");
        arrayList1.add("Dete");
        arrayList1.add(30);
        arrayList1.add(6.2);

        System.out.println("The array List 1 contains the following: " + arrayList1);
        System.out.println("The array List 1 data at the last index is: " + arrayList1.get(arrayList1.size() - 1));

        arrayList1.remove(3);
        String arrayList1Item1 = (String) arrayList1.get(0);
        System.out.println("The array List 1 contains the following: " + arrayList1);
        System.out.println("The array List 1 data at the last index is: " + arrayList1Item1);

        arrayList1.add(100);
        System.out.println("The array List 1 contains the following: " + arrayList1);

        arrayList2.add("Lamech");
        arrayList2.add("Dete");
        arrayList2.add("Desai");

        String arrayList2Item1 = arrayList2.get(0);
        System.out.println("The array List 2 contains the following: " + arrayList2);
        System.out.println("The array List 2 data at the last index is: " + arrayList2Item1);

        arrayList2.remove(2);

        String arrayList2Item2 = arrayList2.get(0);
        System.out.println("The array List 2 contains the following: " + arrayList2);
        System.out.println("The array List 2 data at the last index is: " + arrayList2Item2);

        arrayList3.add(30);
        arrayList3.add(180);
        arrayList3.add(1995);

        Integer arrayList3Item1 = arrayList3.get(0);
        System.out.println("The array List 3 contains the following: " + arrayList3);
        System.out.println("The array List 3 data at the last index is: " + arrayList3Item1);

        arrayList3.remove(2);
        Integer arrayList3Item2 = arrayList3.get(0);
        System.out.println("The array List 3 contains the following: " + arrayList3);
        System.out.println("The array List 3 data at the last index is: " + arrayList3Item2);
    }
}
