package TheCollectionsFrameWork.CollectionsAndGenerics;

import java.util.LinkedList;

public class LinkedListDS {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        LinkedList<String> linkedList2 = new LinkedList<String>();
        LinkedList<Double> linkedList3 = new LinkedList<Double>();

        linkedList1.add("Lamech Dete");
        linkedList1.add(30);
        linkedList1.add(6.2);

        System.out.println("The linked List 1 contains the following: " + linkedList1);
        System.out.println("The linked List 1 data at the last index is: " + linkedList1.get(linkedList1.size() - 1));

        linkedList1.remove(2);
        String linkedList1Item1 = (String) linkedList1.get(0);
        System.out.println("The linked List 1 contains the following: " + linkedList1);
        System.out.println("The linked List 1 data at the last index is: " + linkedList1Item1);

        linkedList1.add(100);
        System.out.println("The linked List 1 contains the following: " + linkedList1);

        linkedList2.add("Lamech");
        linkedList2.add("Dete");
        linkedList2.add("Desai");

        String linkedList2Item1 = linkedList2.get(0);
        System.out.println("The linked List 2 contains the following: " + linkedList2);
        System.out.println("The linked List 2 data at the last index is: " + linkedList2Item1);

        linkedList2.remove(2);

        String linkedList2Item2 = linkedList2.get(0);
        System.out.println("The linked List 2 contains the following: " + linkedList2);
        System.out.println("The linked List 2 data at the last index is: " + linkedList2Item2);

        linkedList3.add(30.0);
        linkedList3.add(180.0);
        linkedList3.add(1995.0);

        Double linkedList3Item1 = linkedList3.get(0);
        System.out.println("The linked List 3 contains the following: " + linkedList3);
        System.out.println("The linked List 3 data at the last index is: " + linkedList3Item1);

        linkedList3.remove(2);
        Double linkedList3Item2 = linkedList3.get(0);
        System.out.println("The linked List 3 contains the following: " + linkedList3);
        System.out.println("The linked List 3 data at the last index is: " + linkedList3Item2);
    }
}
