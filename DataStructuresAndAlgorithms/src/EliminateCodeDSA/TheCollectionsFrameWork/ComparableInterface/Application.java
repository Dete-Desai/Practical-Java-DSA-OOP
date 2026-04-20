package EliminateCodeDSA.TheCollectionsFrameWork.ComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Application {
    public static void main(String[] args) {
        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Mike", 4000, "IT"));
        hashSet.add(new Employee("Harry", 3000, "Accounting"));
        hashSet.add(new Employee("Mary", 2000, "Hr"));
        hashSet.add(new Employee("Becky", 1000, "Admin"));

        ArrayList<Employee> arrayList = new ArrayList<Employee>(hashSet);

        Collections.sort(arrayList);

        for (Employee employee: arrayList){
            System.out.println(employee);
        }
    }
}
