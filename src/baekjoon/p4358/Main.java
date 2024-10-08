package baekjoon.p4358;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int total = 0;
        Map<String, Integer> map = new HashMap<>();

        while ((s = br.readLine()) != null) {
            System.out.println("s = " + s);
            total++;
            // map.getOrDefault(key, defaultValue) : key 값이 존재하면 값을 return 하고 아니면 defaultValue return
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> list = new ArrayList<>();

        //Map.Entry -> Key, Value
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String tree = entry.getKey();
            list.add(tree);
        }

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        for (String tree : list) {
            int count = map.get(tree) * 100;
            sb.append(tree + " " + String.format("%.4f", (double) count / (double) total) + "\n");
        }
        System.out.print(sb);
    }
}
