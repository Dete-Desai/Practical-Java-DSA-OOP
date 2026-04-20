public class HumanExeTwo {
    public static void main(String[] args){
        HumanConstructor humanConstructor1 = new HumanConstructor(
                "Veronica Suiyanka",
                "Maasai",
                50.0,
                5.1,
                "Female",
                "01/01/2004",
                "Kenyan`"
        );
        HumanConstructor humanConstructor2 = new HumanConstructor(
                "Roman Desai",
                "Maasai",
                50.0,
                5.1,
                "Male",
                "01/01/2004",
                "Kenyan`"
        );

        humanConstructor1.speak();
        humanConstructor1.identityInfo();

        humanConstructor2.speak();
        humanConstructor2.identityInfo();
    }
}
