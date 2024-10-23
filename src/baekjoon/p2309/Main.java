package baekjoon.p2309;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] arr = new int[9];
        // 9명의 합계
        int sum = 0;

        //9명 난쟁이 키 저장
        for(int i = 0; i < arr.length; i++){
            int high = Integer.parseInt(br.readLine());
            arr[i] = high;
            sum += high;
        }
        // 오름차순 정렬
        Arrays.sort(arr);


        int fake1 = 0;
        int fake2 = 0;

        // 브루트포스 (9명에서 2명을 뺐을 때 100이면 그 2명이 가짜 난쟁이.)
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                int twoSmallMan = arr[i] + arr[j];

                if (sum - twoSmallMan == 100){
                    //2명의 가짜 난쟁이 인덱스 저장
                    fake1= i;
                    fake2= j;
                    break;
                }
            }
        }
        //fake1, fake2의 인덱스가 아닌 경우 출력.
        for (int idx=0; idx < arr.length; idx++){
            if (idx != fake1 && idx != fake2){
                System.out.println(arr[idx]);
            }
        }







//        for (int i = 0; i <= arr.length - 7; i++){
//            for (int j = i ; j < i+7; j++){
//                System.out.println(arr[j]);
//            }
//        }

    }
}
