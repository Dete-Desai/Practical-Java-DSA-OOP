public class HumanConstructor {
    String name;
    String tribe;
    double weight;
    double height;
    String gender;
    String dateOfBirth;
    String nationality;

    public HumanConstructor(String humanName,
    String humanTribe,
    double humanWeight,
    double humanHeight,
    String sex,
    String humanDob,
    String humanNationality) {
        this.name = humanName;
        this.tribe = humanTribe;
        this.weight = humanWeight;
        this.height = humanHeight;
        this.gender = sex;
        this.dateOfBirth = humanDob;
        this.nationality = humanNationality;
    }

    public void speak(){
        System.out.println("PERSONAL INFORMATION\n");
        System.out.println("My name is " + name);
        System.out.println("My tribe is " + tribe);
        System.out.println("My weight is " + weight);
        System.out.println("My height is " + height);
        System.out.println("My gender is " + gender);
        System.out.println("My date of birth is " + dateOfBirth);
        System.out.println("My Nationality is " + nationality + "\n\n");
    }

    public void identityInfo(){
        System.out.println("CITIZEN DATA RECORDED\n");
        System.out.println("Name: " + name);
        System.out.println("Tribe: " + tribe);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Gender: " + gender);
        System.out.println("DoB: " + dateOfBirth);
        System.out.println("Nationality: " + nationality + "\n\n");
    }
}
