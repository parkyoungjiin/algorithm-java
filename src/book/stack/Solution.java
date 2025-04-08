package book.stack;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Solution {
    public static void main(String[] args) {
//        solution(10);
        solution(27);

    }

        public static String solution(int decimal) {
            Deque<Integer> stack = new ArrayDeque<Integer>();
            //1이 될 때까지
            while (decimal > 0){
                //나머지는 스택에 저장.
                stack.push(decimal % 2);

                //몫은 갱신
                decimal /= 2;
            }

            // String 타입 + 연산은 성능이 안좋기에 StringBuilder 사용.
            StringBuilder sb = new StringBuilder();

            while(!stack.isEmpty()){
                sb.append(stack.pop());
            }
//            Iterator<Integer> iterator = stack.iterator();
//            while(iterator.hasNext()){
//                Integer val = iterator.next();
//                System.out.println(val);
//            }

            return sb.toString();
        }
}