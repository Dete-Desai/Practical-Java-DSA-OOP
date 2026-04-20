public class HumanExeOne {
    public static void main(String[] args){
        Human male = new Human();
        Human female = new Human();

        male.name = "Lamech Desai";
        male.weight = 95;
        male.height = 6.3;
        male.tribe = "Luo";
        male.Nationality = "Kenyan";
        male.dateOfBirth = "13/04/1995";

        male.speak();
        male.identityInfo();

        female.name = "Faith Suyianka";
        female.weight = 65;
        female.height = 5.6;
        female.tribe = "Maasai";
        female.Nationality = "Kenyan";
        female.dateOfBirth = "06/06/2001";


        female.speak();
        female.identityInfo();
    }
}
