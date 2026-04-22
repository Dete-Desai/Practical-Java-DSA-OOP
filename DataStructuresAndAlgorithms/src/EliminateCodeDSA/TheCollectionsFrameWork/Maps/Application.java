package TheCollectionsFrameWork.Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        System.out.println("HASH MAP DICTIONARY RESULT\n");
        HashMap<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Vehicle", "Mode of transport that uses the road");
        hashMap.put("Vehicle", "Mode of transport that uses the road");
        hashMap.put("Plane", "Mode of transport that flies in the air");
        hashMap.put("Ship", "Mode of transport that uses the water");

        for (Map.Entry<String, String> map : hashMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

        System.out.println("LINKED HASH MAP DICTIONARY RESULT\n");
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("Vehicle", "Mode of transport that uses the road");
        linkedHashMap.put("Plane", "Mode of transport that flies in the air");
        linkedHashMap.put("Plane", "Mode of transport that flies in the air");
        linkedHashMap.put("Ship", "Mode of transport that uses the water");

        for (Map.Entry<String, String> map : linkedHashMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }

        System.out.println("TREE MAP DICTIONARY RESULT\n");
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        treeMap.put("Vehicle", "Mode of transport that uses the road");
        treeMap.put("Plane", "Mode of transport that flies in the air");
        treeMap.put("Ship", "Mode of transport that uses the water");
        treeMap.put("Ship", "Mode of transport that uses the water");

        for (Map.Entry<String, String> map : treeMap.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }
}
