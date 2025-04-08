package baekjoon.p20546;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        /*
        준현 vs 성민
        준현 -> 매수 후 매도하지 않음.
        성민 -> 33매매법

        - 3일 연속 가격 상승 -> 다음 날 가격 하락 -> 전량 매도 (동일은 상승으로 치지 않음)
        - 3일 연속 가격 하락 -> 다음 날 가격 상승 -> 전량 매수 (동일은 하락으로 치지 않음)


        비교 : 1월 14일 자산 (현금 + 1월 14일 주가 * 주식 수)
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cash = Integer.parseInt(br.readLine());

        int[] stock = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 14; i++) {
            stock[i] = Integer.parseInt(st.nextToken());
        }

        //준현 계산
        int cash_a = cash;
        int stock_a = 0;
        //준현 결과
        int result_a = 0;

        for (int i = 0; i < 14; i++) {
            //매수 여부 확인
            if((cash_a / stock[i]) >= 1){
                stock_a += cash_a / stock[i]; //주식 수 갱신
                cash_a = cash_a % stock[i]; //현금 갱신
            }
        }


        //성민
        int cash_b = cash;
        int stock_b = 0;
        int result_b = 0;
        int[] cnt = new int[2]; //0: down, 1:up

        int val = stock[0];
        //성민 주식 계산
        for (int i = 1; i < 14; i++) {
            if (val > stock[i]) {//down
                cnt[0] += 1;
                cnt[1] = 0;
                val = stock[i];

                if (cnt[0] >= 3 && cash_b > 0) {
                    //전량 매수
                    stock_b += cash_b / stock[i];
                    cash_b = cash_b % stock[i];
                }else if(cnt[0] >= 3 && cash_b == 0){
                    stock_b += cash_b / stock[i];
                    cash_b = cash_b % stock[i];
                    cnt[0] = 0;
                }
            }else if(val < stock[i]){//up
                cnt[1] += 1;
                cnt[0] = 0;
                val = stock[i];

                if(cnt[1] >= 3 && stock_b > 0){
                    //전량 매도
                    cash_b = stock_b * stock[i];
                    stock_b = 0;
                }
            }
        }//끝

        result_a = cash_a + (stock_a * stock[13]);
        result_b = cash_b + (stock_b * stock[13]);

        if (result_a > result_b) {
            System.out.println("BNP");
        } else if (result_a < result_b) {
            System.out.println("TIMING");
        } else{
            System.out.println("SAMESAME");
        }



    }
}
