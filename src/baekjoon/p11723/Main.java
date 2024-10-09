package baekjoon.p11723;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        Set<Integer> s = new HashSet<>();

        for(int i = 0; i < M; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            int input = -1; // why -1 인지는 모르겠음.

            switch(command) {
                case "add":
                    s.add(Integer.parseInt(st.nextToken()));
                    break;
                case "remove":
                    s.remove(Integer.parseInt(st.nextToken()));
                    break;
                case "check":
                    input = Integer.parseInt(st.nextToken());
                    if (s.contains(input)){
                        sb.append(1);
                    }else{
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;

                case "toggle":
                    input = Integer.parseInt(st.nextToken());
                    if (s.contains(input)){
                        s.remove(input);
                    }else{
                        s.add(input);
                    }
                    break;
                case "all":
                    s = new HashSet<>();
                    for (int j = 1 ; j <=20; i++){
                        s.add(j);
                    }
                    break;
                case "empty":
                    s.clear();
                    break;
            }



        }

    }
}
