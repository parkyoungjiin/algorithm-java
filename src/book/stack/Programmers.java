package book.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Programmers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = 0;
        ArrayList<Character> s = new ArrayList<>();

        for (int k = 0; k < str.length() ; k++){
            s.add(str.charAt(k));
        }

        Map<Character, Character> map = new HashMap<>(); // key, value
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        //
        for (int i = 0 ; i < s.size() ; i++){
            Stack<Character> stack = new Stack<>();

            for (int j = 0; j <s.size(); j++){
                if(stack.isEmpty()){
                    stack.push(s.get(j));
                }else if(stack.peek() == map.get(s.get(j))){
                    stack.pop();
                }else{
                    stack.push(s.get(j));
                }
            }

            if (stack.size() == 0){
                answer++;
            }

            //회전
            char temp = s.get(0);
            s.remove(0);
            s.add(temp);
        }



        System.out.println(answer);
    }
}
