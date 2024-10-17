package baekjoon.p1157;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Map<Character, Integer> ans = new HashMap<Character, Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine().toUpperCase();
        //1. String -> char[] 배열로 변환
        char[] w = word.toCharArray();

        //2. map에 key가 있는 지 확인하여 개수 count
        for (int i=0; i<word.length(); i++){
            char a = w[i];
            if (ans.containsKey(a)){
                ans.replace(a, ans.get(a) + 1);
            }else{
                ans.put(a, 1);
            }

        }

        //3. 많이 사용된 알파벳 대문자로 출력
        int maxValue = Integer.MIN_VALUE;
        char maxKey = 0;
        boolean isMaxValue = false;
        for (Map.Entry<Character, Integer> entry : ans.entrySet()){
//            System.out.println(entry.toString());
            if (entry.getValue() > maxValue){
                maxValue = entry.getValue();
                maxKey = entry.getKey();
                isMaxValue = false;
            }else if(entry.getValue() == maxValue){
                isMaxValue = true;
            }
        }
        if (isMaxValue){
            System.out.println("?");
        }else{
            System.out.println(maxKey);
        }

    }
}
