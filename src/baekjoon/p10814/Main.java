package baekjoon.p10814;
import java.io.*;
import java.util.*;
import java.util.StringTokenizer;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringBuilder initMember[] = new StringBuilder[201];//나이는 1이상 200이하이므로 크기를 201까지 지정해준다.

        for (int i = 0; i < 201; i++) {
            initMember[i] = new StringBuilder(); //StringBuilder 배열이기 때문에 해당 StringBuilder를 생성해주어야한다.(요소마다)
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            //출력 형식을 배열에 추가해준다.(같은 나이일 때 이러면 등록된 순서대로 나옴)
            initMember[age].append(age + " " + st.nextToken() + "\n");
        }

        br.close();

        for (StringBuilder sb : initMember) {
            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
    }
}//Main class
