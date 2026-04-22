package TheCollectionsFrameWork.Set;

public class Animal {
    String animalName;
    int animalAge;

    public Animal(String name, int age) {
        this.animalName = name;
        this.animalAge = age;
    }

    @Override
    public String toString() {
        return "Animals Bio: [\n Name: " + animalName + ", \n Age: " + animalAge + "\n]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + animalAge;
        result = prime * result + ((animalName == null) ? 0 : animalName.hashCode());

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Animal other = (Animal) obj;
        if (animalAge != other.animalAge)
            return false;
        if (animalName == null) {
            return other.animalName == null;
        } else
            return animalName.equals(other.animalName);
    }
}
