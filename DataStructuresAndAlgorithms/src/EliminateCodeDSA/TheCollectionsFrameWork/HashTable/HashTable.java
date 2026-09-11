package TheCollectionsFrameWork.HashTable;

public class HashTable {
    String [] hashArray;
    int arraySize;
    int size = 0;

    public HashTable(int arraySize) {
        this.arraySize = arraySize;
        hashArray = new String[arraySize];

        if(isPrime(arraySize)){
            this.arraySize = arraySize;
        } else {
            this.arraySize = getNextPrime(arraySize);

            System.out.println("Array size given is not prime. Size changed to " + this.arraySize);
            System.out.println("Hash table size is " + this.arraySize);
            System.out.println("Hash table is empty: " + isEmpty());
        }   
    }

    private boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
    return true;
   }

    private int getNextPrime(int number) {
        while (!isPrime(number)) {
            number++;
        }
        return number;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void put(String key) {
        int hashIndex = hashFunction(key);

        while (hashArray[hashIndex] != null) {
            hashIndex++;
            hashIndex %= arraySize;
        }

        hashArray[hashIndex] = key;
        size++;
    }

    public String get(String key) {
        int hashIndex = hashFunction(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].equals(key)) {
                return hashArray[hashIndex];
            }
            hashIndex++;
            hashIndex %= arraySize;
        }

        return null;
    }

    public void remove(String key) {
        int hashIndex = hashFunction(key);

        while (hashArray[hashIndex] != null) {
            if (hashArray[hashIndex].equals(key)) {
                hashArray[hashIndex] = null;
                size--;
                return;
            }
            hashIndex++;
            hashIndex %= arraySize;
        }
    }

    public void display() {
        for (int i = 0; i < arraySize; i++) {
            if (hashArray[i] != null) {
                System.out.println("Index " + i + ": " + hashArray[i]);
            }
        }
    }

    private int hashFunction(String key) {
        int hashVal = 0;

        for (int i = 0; i < key.length(); i++) {
            hashVal += key.charAt(i);
        }

        return hashVal % arraySize;
    }
}


