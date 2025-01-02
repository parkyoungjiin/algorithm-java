package baekjoon.p4889;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1; // 횟수


        while (true){
            int answer = 0; // 최소 연산 수
            String str = br.readLine();

            // "-" 가 포함 -> 마지막 줄 -> 종료
            if (str.contains("-")){
                break;
            }

            Stack stack = new Stack();

            for(int i = 0; i < str.length(); i++){
                if (str.charAt(i) == '{'){
                    stack.push(str.charAt(i));
                }else{// '}'
                    if(!stack.isEmpty()){ // stack에 '{' 이 있는 경우
                        stack.pop();
                    }else{ // stack empty
                        stack.push('{'); // '{' 변환 후 cnt 1증가
                        answer++;
                    }
                }

            }

            answer += stack.size() / 2;

            System.out.println(cnt +". " + answer);

            cnt++;

        }
//        System.out.println()




    }
}
