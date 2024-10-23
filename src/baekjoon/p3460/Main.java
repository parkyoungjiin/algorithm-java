package baekjoon.p3460;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        sc.nextLine();

        for (int t=0; t<tc; t++){
            int n = sc.nextInt();

            //2진수 변환
            String bs = Integer.toBinaryString(n);

            //1의 위치 공백으로 한 줄에 출력
            for (int i = bs.length() - 1; i >= 0; i--){
                if (bs.charAt(i) == '1'){
                    System.out.print(bs.length() - i - 1 + " "); // 출력의 핵심부분
                }
            }
        }

    }
}