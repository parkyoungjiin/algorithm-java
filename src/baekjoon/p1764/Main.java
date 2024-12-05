package baekjoon.p1764;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] nums = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int n = nums[0];
        int m = nums[1];

        HashSet<String> names = new HashSet<>();

        for (int i = 0 ; i < n; i++){
            String name = br.readLine();
            names.add(name);
        }

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0 ; i < m; i++){
            String name = br.readLine();
            //name이 존재하는 경우
            if(names.contains(name)){
                result.add(name);
            }

        }


        Collections.sort(result);

        System.out.println(result.size());

        for(String r : result){
            System.out.println(r);
        }





    }
}
