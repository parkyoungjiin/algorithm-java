package javaInflern.map;
import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, Double> map = new HashMap<>();

        map.put(1, 0.1);
        map.put(2, 0.2);
        map.put(3, 0.3);
        map.put(4, 0.4);

        List<Map.Entry<Integer, Double>> test = new ArrayList<>(map.entrySet());

        for (Map.Entry<Integer, Double> t : test){
            System.out.println(t.getKey() + " " +t.getValue());
        }

    }
}
