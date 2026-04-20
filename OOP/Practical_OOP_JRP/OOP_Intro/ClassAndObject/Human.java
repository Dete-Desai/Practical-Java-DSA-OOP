public class Human {
    String name;
    String tribe;
    double weight;
    double height;
    String dateOfBirth;
    String Nationality;

    public Human() {}

    public void speak(){
        System.out.println("My name is " + name);
        System.out.println("My tribe is " + tribe);
        System.out.println("My weight is " + weight);
        System.out.println("My height is " + height);
        System.out.println("My date of birth is " + dateOfBirth);
        System.out.println("My Nationality is " + Nationality);
    }

    public void identityInfo(){
        System.out.println("Name: " + name);
        System.out.println("Tribe: " + tribe);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("DoB: " + dateOfBirth);
        System.out.println("Nationality: " + Nationality);
    }
}