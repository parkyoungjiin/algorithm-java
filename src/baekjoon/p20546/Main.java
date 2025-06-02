package baekjoon.p20546;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.*;

public class Main {
    static class Stock{
        int cash; //투자 가능 금액
        int stock_cnt; //주식 수

        //생성자
        public Stock(int cash, int stock_cnt) {
            this.cash = cash;
            this.stock_cnt = stock_cnt;
        }

    }

    static int[] stock_price;

    //준현 투자법
    public static void jun(Stock stock){
        for (int i = 0; i < 14; i++) {
            //매수 여부 확인
            if ((stock.cash / stock_price[i]) >= 1) {
                stock.stock_cnt += stock.cash / stock_price[i];
                stock.cash = stock.cash % stock_price[i];
            }
        }
    }
    //성민 투자법
    public static void sung(Stock stock){
        int val = stock_price[0];
        int[] cnt = new int[2]; //0: down, 1:up

        //성민 주식 계산
        for (int i = 1; i < 14; i++) {
            if (val > stock_price[i]) {//down
                cnt[0] += 1;
                cnt[1] = 0;
                val = stock_price[i];

                if (cnt[0] >= 3 && stock.cash > 0) {
                    //전량 매수
                    stock.stock_cnt += stock.cash / stock_price[i];
                    stock.cash = stock.cash % stock_price[i];
                }else if(cnt[0] >= 3 && stock.cash == 0){
                    stock.stock_cnt += stock.cash / stock_price[i];
                    stock.cash = stock.cash % stock_price[i];
                    cnt[0] = 0;
                }
            }else if(val < stock_price[i]){//up
                cnt[1] += 1;
                cnt[0] = 0;
                val = stock_price[i];

                if(cnt[1] >= 3 && stock.stock_cnt > 0){
                    //전량 매도
                    stock.cash = stock.stock_cnt * stock_price[i];
                    stock.stock_cnt = 0;
                }
            }
        }//끝


    }
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cash = Integer.parseInt(br.readLine());

        stock_price = new int[14];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 14; i++) {
            stock_price[i] = Integer.parseInt(st.nextToken());
        }

        //준현
        Stock stock_j = new Stock(cash, 0);
        jun(stock_j);
        //준현 결과
        int result_a = 0;




        //성민
        Stock stock_s = new Stock(cash, 0);
        sung(stock_s);
        //성민 결과
        int result_b = 0;

        result_a = stock_j.cash + (stock_j.stock_cnt * stock_price[13]);
        result_b = stock_s.cash + (stock_s.stock_cnt * stock_price[13]);


        if (result_a > result_b) {
            System.out.println("BNP");
        } else if (result_a < result_b) {
            System.out.println("TIMING");
        } else{
            System.out.println("SAMESAME");
        }



    }


}
