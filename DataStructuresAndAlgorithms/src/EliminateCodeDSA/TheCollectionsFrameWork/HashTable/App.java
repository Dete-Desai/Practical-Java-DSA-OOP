package TheCollectionsFrameWork.HashTable;

public class App {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable(10);
        hashTable.put("Apple");
        hashTable.put("Banana");
        hashTable.put("Cherry");
        hashTable.put("Date");
        hashTable.put("Elderberry");

        hashTable.display();

        System.out.println("Size of hash table: " + hashTable.size());
        System.out.println("Is hash table empty? " + hashTable.isEmpty());

        System.out.println("Retrieving 'Cherry': " + hashTable.get("Cherry"));
        System.out.println("Retrieving 'Grape': " + hashTable.get("Grape"));
        System.out.println("Retrieving 'Apple': " + hashTable.get("Apple"));
    }
}
