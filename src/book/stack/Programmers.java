package book.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Programmers {
    public static void main(String[] args) throws IOException {
        Queue<String> queue = new LinkedList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        // String -> Queue

        for(int i = 0; i < s.length(); i++){
            String str = s.substring(i,i+1);
            queue.add(str);
        }

        // queue 회전

    }
}
