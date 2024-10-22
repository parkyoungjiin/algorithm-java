package javaInflern.cond;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        sc.nextLine();

        int coupon;
        // 등급에 따른 쿠폰 발급
        // 1등급 : 쿠폰 1000
        // 2등급 : 쿠폰 2000
        // 3등급 : 쿠폰 3000
        // 위 등급 아닌 경우 : 쿠폰 500
        /*
        - switch 문은 단순히 값이 같은지만 비교.
        - break 가 없다면 다음 조건으로 분기문을 타게 된다.

        switch (조건식){
            case value:

        }
         */
        switch (grade){
            case 1:
                coupon = 1000;
                System.out.println("발급받은 쿠폰 " + coupon);
                break;
            case 2:
            case 3:
                coupon = 3000;
                System.out.println("발급받은 쿠폰 " + coupon);
                break;
            default:
                coupon = 500;
                System.out.println("발급받은 쿠폰 " + coupon);

        }

    }
}
