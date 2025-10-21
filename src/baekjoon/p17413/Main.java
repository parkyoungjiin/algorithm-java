package baekjoon.p17413;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        int len = input.length();

        Stack<Character> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();

        boolean isTag = false;

        for (int i = 0; i < len; i++) {
            char ch = input.charAt(i);

            if (ch == '<') {
                isTag = true;
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(ch);
            } else if(ch == '>'){
                isTag = false;
                sb.append(ch);
            }else if(ch == ' '){
                if(isTag){ //태그 안 공백일 경우 sb에 바로 넣음.
                    sb.append(ch);
                }else{//태그 밖 공백 -> 기존 stack 값이 있으면 sb에 넣어서 초기화
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(" ");
                }
            }else{
                if(isTag){
                    sb.append(ch);
                }else{
                    stack.push(ch);
                }

            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        System.out.println(sb);

    }
}