package TheCollectionsFrameWork.TraversingListsAndCustomTypes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();

        System.out.println("\n\nTYPES OF CARS\n\n");

        cars.add("Sedan");
        cars.add("Wagon");
        cars.add("Convertable");
        cars.add("SUV");

        printCars(cars);

        System.out.println("\n\nCARS I WILL BUY NEXT YEAR\n\n");

        List<Vehicle> vehicles = new LinkedList<Vehicle>();

        Vehicle vehicle1 = new Vehicle("Nissan", "Patrol 2025", "Grey", 20000, true, 0);
        vehicles.add(vehicle1);
        vehicles.add(new Vehicle("Toyota", "Landcruiser ZX 2025", "White", 20000, true, 0));
        vehicles.add(new Vehicle("Land Rover", "Vogue 2025", "White", 20000, true, 0));

        printCars(vehicles);
    }

    public static void printCars(List vehicleList) {
        for (Object car : vehicleList) {
            System.out.println(car);
        }
    }
}
