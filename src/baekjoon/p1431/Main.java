package baekjoon.p1431;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String [] arr = new String [n];

        for (int i = 0; i < n ; i++){
            String input = br.readLine();
            arr[i] = input;
        }

        // 정렬
        Arrays.sort(arr, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                if (o1.length() == o2.length()){
                    //2조건, 자릿수 합 오름차순 정렬
//                    for (int i = 0; i<= o1.length(); i++){
//                        if (o1.charAt(i).isDigit());
//                    }
                    int sum1 = 0;
                    int sum2 = 0;
                    //숫자인 값들만 계산
                    for(char a : o1.toCharArray()){
                        if (Character.isDigit(a)){
                            sum1 += a - '0'; // 숫자 그대로의 값이 아니라 ASCII값이 연산되기에 '0'으로 뺴준다.
                        }
                    }

                    for(char b : o2.toCharArray()){
                        if (Character.isDigit(b)){
                            sum2 += b - '0';
                        }
                    }

                    if (sum1 == sum2){
                        //3조건, 사전순 비교
                        return o1.compareTo(o2);
                    }else{
                        return sum1 - sum2;
                    }
                }else{
                    return o1.length() - o2.length(); // 길이 오름차순 (1조건, 다른 경우)
                }

            }
        });

        for (String s : arr){
            System.out.println(s);
        }




    }
}
