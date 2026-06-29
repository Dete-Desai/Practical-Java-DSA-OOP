package TheCollectionsFrameWork.Lists;

public class Appdll {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertAfter(3, 0);
        list.insertBefore(7, 6);
        list.insertLast(7);
        list.insertLast(8);

        list.displayForward();
        list.displayBackward();
        list.displayList();
        list.deleteFirst();
        list.deleteLast();
        list.displayList();
    }
}
