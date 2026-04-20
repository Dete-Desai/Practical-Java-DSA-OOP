package EliminateCodeDSA.TheCollectionsFrameWork.TraversingListsAndCustomTypes;

public class Vehicle {
    String make;
    String model;
    String color;
    double price;
    boolean isNew;
    int milage;

    public String toString() {
        return "Vehicle Properties [\nMake: "+make+", \nModel: "+model+",  \nColor: "+color+", \nPrice: "+price+", \nCondition: "+isNew+", \nMilage: "+milage+"\n]";
    }

    public Vehicle(String make, String model, String color, int price,  boolean condition, int milage) {
        super();
        this.make = make;
        this.model = model;
        this.color = color;
        this.price = price;
        this.isNew = condition;
        this.milage = milage;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean getConditon() {
        return isNew;
    }

    public void setCondition(boolean condition) {
        isNew = condition;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int theMilage){
        this.milage = theMilage;
    }
}
