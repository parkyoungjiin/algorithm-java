package baekjoon.p1978;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int cnt = 0;
        while(st.hasMoreTokens()){
        // 소수 판별 변수 (소수 = true, 소수X = false)
            boolean isPrime = true;

            int num = Integer.parseInt(st.nextToken());

            if (num == 1){
                isPrime = false;
                continue;
            }

            for (int i = 2 ; i <= Math.sqrt(num) ; i++){
                if(num % i == 0){ //약수인 경우 소수가 아니기에 break
                    isPrime = false;
                    break;
                }
            }

            if (isPrime){
                cnt++;
            }
        }
        System.out.println(cnt);
    }

}
