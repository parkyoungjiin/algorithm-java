package baekjoon.p1181;

import java.util.*;
import java.util.Collections;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        //리스트 제작
        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            arr.add(input);
        }

        //정렬
        // 1. 짧은 순
        // 2. 사전 순
        // 3. 중복 제거

        Collections.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                //짧은 순
                if(o1.length() != o2.length()){
                    return o1.length() - o2.length();
                } else {
                    return o1.compareTo(o2);
                }

            }
        });

        //중복 제거를 위해 arr을 set으로 변환
        arr = new ArrayList<>(new LinkedHashSet<>(arr));

        for(String a : arr){
            System.out.println(a);
        }
    }//main
}//class