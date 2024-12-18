package baekjoon.p1316;

import java.io.IOException;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i=0; i<n; i++){
            String word = sc.nextLine();
            if(check(word) ==true) {
                count++;
            }
        }//for

        System.out.println(count);

    }//main

    //그룹단어 체크 함수
    static boolean check(String word){

        boolean[] alpha = new boolean[26]; //알파벳 배열 선언

        int prev = 0;

        for (int j = 0 ; j < word.length(); j++){
            //이전 문자와 다른 경우(연속X)
            int current_word = word.charAt(j);
            if (prev != current_word){
                //이전에 나온 문자인지 확인
                if(alpha[current_word - 'a'] == false){
                    alpha[current_word - 'a'] = true;
                    prev = current_word;
                }else{ //이전에 나온 경우
                    return false;
                }
            }

        }
        return true;
    }

}