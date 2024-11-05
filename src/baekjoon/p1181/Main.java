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

        //중복된 단어 저장 X
        Set<String> temp = new HashSet<String>();
        for (int i = 0; i < n; i++){
            temp.add(br.readLine());
        }

        String [] words = new String[temp.size()];
        temp.toArray(words); // set -> Array


        //길이가 짧은 것 -> 사전 순
        Arrays.sort(words, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if (o1.length() == o2.length()){
                    return o1.compareTo(o2); //사전순 정렬
                }
                return o1.length() - o2.length(); // 길이 짧은 순 정렬
            }
        });//Arrays.sort()

        for (String word : words){
            System.out.println(word);
        }


    }//main
}//class