package baekjoon.p20920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]); //M = 단어의 길이 기준 M 미만은 출력 X

        //map -> 횟수 체크
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if(str.length() < M){
                continue;
            }
//            존재여부 파악
//            if (map.containsKey(str)) {
//                map.replace(str, map.get(str) + 1);
//            }else{
//                map.put(str, 1);
//            }
            map.put(str, map.getOrDefault(str, 0) + 1);

        }

//        확인 (entrySet)
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + " : " + entry.getValue());
//        }

//        확인 (keySet)
//        for (String str : map.keySet()) {
//            System.out.println("key : " + str);
//        }
        ArrayList<String> key = new ArrayList<>(map.keySet());
        Collections.sort(key, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){

                int o1_cnt = map.get(o1);
                int o2_cnt = map.get(o2);

                if(o1_cnt != o2_cnt){
                    return o2_cnt - o1_cnt;
                }
                else if(o1.length() != o2.length()){
                    return o2.length() - o1.length();
                }else{
                    return o1.compareTo(o2);
                }
            }
        });

        // 정렬된 단어들을 출력
        StringBuilder sb = new StringBuilder();
        for (String str : key) {
            sb.append(str + "\n");
        }
        System.out.println(sb);

        // ** 해당 코드에서 시간초과 발생 **
//        for(String str : key){
//            System.out.println(str);
//        }

        //if 조건 1.횟수 비교 - 2. 단어 길이 비교 3. 사전순
        // 횟수 비

    }
}
