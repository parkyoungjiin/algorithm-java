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

        Map<String,Integer> answer = new HashMap<>();

        for (int i = 0 ; i < n; i++){
            String name = br.readLine();
            answer.put(name, 0);

        }

        for (int i = 0 ; i < m; i++){
            String name = br.readLine();
            //name이 존재하는 경우
            if (answer.containsKey(name)){
                answer.replace(name, 1);
            }

        }

        // value = 1인 경우 중복되는 학생으로 파악
        int answer_cnt = 0;
        ArrayList<String> human = new ArrayList<>();

        // 중복인 학생 이름 출력 + 개수 확인
        Set<Map.Entry<String, Integer>> ans = answer.entrySet();

        for (Map.Entry<String, Integer> a : ans){
            if(a.getValue() == 1){
                answer_cnt++;
                human.add(a.getKey());
            }
        }

        Collections.sort(human);

        System.out.println(answer_cnt);

        for(String h : human){
            System.out.println(h);
        }





    }
}
