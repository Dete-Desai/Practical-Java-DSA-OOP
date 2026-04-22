package TheCollectionsFrameWork.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        System.out.println("HASH SET CLASS DATA\n");

        HashSet<String> stringSet = new HashSet<String>();
        HashSet<Integer> integerSet = new HashSet<Integer>();
        HashSet<Animal> animalSet = new HashSet<Animal>();

        stringSet.add("Faith");
        stringSet.add("Lamech");
        stringSet.add("Brazil");
        stringSet.add("Brazil");

        for (String set : stringSet) {
            System.out.println(set);
        }

        integerSet.add(30);
        integerSet.add(25);
        integerSet.add(1);
        integerSet.add(1);

        for (Integer set : integerSet) {
            System.out.println(set);
        }

        animalSet.add(new Animal("Dog", 1));
        animalSet.add(new Animal("Cat", 2));
        animalSet.add(new Animal("Horse", 3));
        animalSet.add(new Animal("Horse", 3));

        for (Animal animal : animalSet) {
            System.out.println(animal);
        }

        System.out.println("\nLINKED HASH SET CLASS DATA\n");
        LinkedHashSet<String> stringLinkedSet = new LinkedHashSet<String>();
        LinkedHashSet<Integer> integerLinkedSet = new LinkedHashSet<Integer>();
        LinkedHashSet<Animal> animalLinkedSet = new LinkedHashSet<Animal>();

        stringLinkedSet.add("Faith");
        stringLinkedSet.add("Lamech");
        stringLinkedSet.add("Brazil");
        stringLinkedSet.add("Brazil");

        for (String set : stringLinkedSet) {
            System.out.println(set);
        }

        integerLinkedSet.add(30);
        integerLinkedSet.add(25);
        integerLinkedSet.add(1);
        integerLinkedSet.add(1);

        for (Integer set : integerLinkedSet) {
            System.out.println(set);
        }

        animalLinkedSet.add(new Animal("Dog", 1));
        animalLinkedSet.add(new Animal("Cat", 2));
        animalLinkedSet.add(new Animal("Horse", 3));
        animalLinkedSet.add(new Animal("Horse", 3));

        for (Animal animal : animalLinkedSet) {
            System.out.println(animal);
        }
    }

}
