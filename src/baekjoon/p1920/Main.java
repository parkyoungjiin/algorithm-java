package baekjoon.p1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
public class Main {
    public static int [] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 2025-09-11 이분탐색 복습

        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }


        // 이분탐색을 위한 정렬
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        int [] m_arr = new int[m];

        st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        //이분탐색
        for (int i = 0; i < m; i++) {

            int key = Integer.parseInt(st.nextToken());
            if (binary_search(arr, key) >= 0) {
                sb.append(1).append("\n");
            }else{
                sb.append(0).append("\n");
            }
        }

        System.out.println(sb);



    }//main

    /**
     *
     * @param arrN 정렬된 배열
     * @param key 찾으려는 값
     * @return key와 일치하는 arrN의 index값, 불일치 -1 리턴
     */
    public static int binary_search(int[] arrN, int key) {
        int start = 0; // 왼쪽 끝 인덱스
        int end = arr.length - 1; // 오른쪽 끝 인덱스

        /*
         왼쪽 끝 ~ 오른쪽 끝이 같은 경우까지 탐색 -> start가 end보다 커지기 전까지만 반복.
         */

        while (start <= end) {
            int mid = (start + end) / 2; // 중간위치 구하기

            // key값이 중간 위 값보다 작을 경우
            // end 값을 줄인다.

            if (key < arrN[mid]) {
                end = mid - 1;
            }
            // key값이 중간 위치 값보다 클 경우
            else if (key > arr[mid]) {
                start = mid + 1;
            }
            // key값과 중간위치 값이 같을 경우 -> 값을 찾은경우
            else{
                return mid;
            }



        }

        //원하는 값을 못찾은 경우
        return -1;

    }
}//class
