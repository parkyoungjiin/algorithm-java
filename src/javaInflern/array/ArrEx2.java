package javaInflern.array;
import java.util.*;

public class ArrEx2 {
    //가장 큰수, 작은수 확인
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 개수를 입력하세요.");
        int n = sc.nextInt();

        System.out.println("정수를 입력하세요.");
        //배열 선언
        int [] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //최소값, 최대값 저장 변수
        int minValue, maxValue;

        //배열 0번지 값으로 초기화.
        minValue = maxValue = arr[0];

        for (int i = 1; i < arr.length; i++){
            int num = arr[i];
            if (minValue > num){
                minValue = num;
            }
            if(maxValue < num){
                maxValue = num;
            }

        }

        System.out.println("최대값: " + maxValue);
        System.out.println("최소값: " + minValue);

    }
}
