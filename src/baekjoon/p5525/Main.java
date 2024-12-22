package baekjoon.p5525;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String s = br.readLine();

        String str = "IOI";
        String PN = "OI";

        // PN 연산
        str = str + PN.repeat(n-1);

        int answer = 0;

        //횟수 계산
        for (int i = 0; i <= m-str.length() ; i++){
            String temp_str = s.substring(i, i+str.length());
            if (temp_str.contains(str)){
                answer++;
            }
        }
        System.out.println(answer);
    }
}