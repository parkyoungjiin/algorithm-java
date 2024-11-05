package baekjoon.p10814;
import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        List<Customer> customers = new ArrayList<Customer>();


        for (int i = 0; i < n ; i++){
            st = new StringTokenizer(br.readLine()); // new StringTokenizer("문자열"); -> " " 공백을 기준으로 문자열을 토큰화 하여 저장.

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            Customer custom = new Customer(i, age, name);
            customers.add(custom);
        }

        Collections.sort(customers, new Comparator<Customer>(){
            //나이 오름차순, 나이 동률 시 가입순 오름차순
            @Override
            public int compare(Customer o1, Customer o2){
                if (o1.old == o2.old){
                    return o1.index - o2.index;
                }

                return o1.old - o2.old; //나이 오름차순
            }
        });

        //나이 이름
        for (Customer c : customers){
            System.out.println(c.old + " " + c.name);
        }

    }//main method

    static class Customer {
        int index;
        int old;
        String name;

        //생성자
        public Customer(int index, int old, String name){
            this.index = index;
            this.old = old;
            this.name = name;
        }
    }
}//Main class
