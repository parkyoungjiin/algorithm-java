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
                flushStack(stack, sb);
                sb.append(ch);
            } else if(ch == '>'){
                isTag = false;
                sb.append(ch);
            } else if (isTag) {// 태그 안
                sb.append(ch);
            } else if(ch == ' '){ //태그 밖 공백 -> stack값들을 sb + " " 넣어주고 초기화
                flushStack(stack, sb);
                sb.append(" ");
            }else{
                stack.push(ch);
            }
        }

        //스택에 남아있으면 sb에 넣고 초기화
        flushStack(stack, sb);

        System.out.println(sb);

    }//main method

    private static void flushStack(Stack<Character> stack, StringBuilder sb) {
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
    }


}