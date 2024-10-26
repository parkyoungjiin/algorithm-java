package baekjoon.p2581;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> primeNums = new ArrayList<>();

        int sum = 0;
        int minValue = 0;

        for (int i = m ; i <= n; i++){
            if(i == 1){
                continue;
            }

            boolean isPrime = true;

            for (int j = 2; j < Math.sqrt(i); j++){
                //약수 판별
                if (i % j == 0){
                    isPrime = false;
                    break;
                }

            }
            if (isPrime){
                primeNums.add(i);
            }
        }

        if (primeNums.size() == 0){
            System.out.println(-1);
        }else{
            Collections.sort(primeNums);
            minValue = primeNums.get(0);
            for (int idx = 0 ; idx <primeNums.size(); idx++){
                sum += primeNums.get(idx);
            }

            System.out.println(sum);
            System.out.println(minValue);
        }


    }
}