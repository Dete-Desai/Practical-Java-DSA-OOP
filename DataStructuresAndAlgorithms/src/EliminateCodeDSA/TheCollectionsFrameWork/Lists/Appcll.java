package TheCollectionsFrameWork.Lists;

public class Appcll {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertLast(7);
        list.insertLast(8);

        list.displayList();}
}
