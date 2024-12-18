package book.stack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Solution {
    public static String solution(int decimal) {
        Deque<Integer> stack = new ArrayDeque<Integer>();
        //1이 될 때까지
        while (decimal != 1){
            //나머지는 스택에 저장.
            stack.push(decimal % 2);

            //몫은 갱신
            decimal /= 2;
        }
        Iterator<Integer> iterator = stack.iterator();

        while(iterator.hasNext()){
            Integer val = iterator.next();
            System.out.println(val);
        }

        //이터레이터 사용법을 모름
        return "";
    }
}