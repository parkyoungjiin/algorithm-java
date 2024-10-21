package javaInflern.array;
import java.util.*;

public class ArrEx4 {
    public static void main(String[] args) {
        /**
         * 상품 관리 프로그램
         * 1. 상품 등록 -> 이름, 가격을 입력받아 배열에 저장
         * 2. 상품 목록 -> 배열에 저장된 모든 상품 출력
         * 3. 종료 -> 프로그램 종료.
         *
         * 상품은 최대 10개까지 등록. -> maxProducts int 형 변수
         */
        Scanner sc = new Scanner(System.in);
        String[] menu = {"상품 등록", "상품 목록", "종료"};
        String[] productNames = new String[10]; //최대 10개 설정.
        int[] productPrices = new int[10];
        int productCount = 0; // 상품 개수 저장할 변수

        while (productCount <= 10) {
            for (int i = 0; i < menu.length; i++) {
                System.out.print((i + 1) + " . " + menu[i] + " | ");
            }
            System.out.println("");
            System.out.print("메뉴를 선택하세요:");
            int menuNum = sc.nextInt();
            if (menuNum == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            if (productCount == 10){
                System.out.println("더 이상 상품을 등록할 수 없습니다.");
                break;
            }

            if (menuNum == 1){// 상품 등록
                System.out.print("상품 이름을 입력하세요:");
                productNames[productCount] = sc.next();
                System.out.print("상품 가격을 입력하세요:");
                productPrices[productCount] = sc.nextInt();

                productCount++;
                System.out.println("현재 상품 개수: " + productCount);
            }else if(menuNum == 2){// 상품 목록
                if (productCount > 0){
                    for (int idx = 0 ; idx < productCount; idx++){
                        System.out.println(productNames[idx] + ": " + productPrices[idx] + "원");
                    }

                }else if(productCount == 0){ // 등록된 상품이 없는 경우
                    System.out.println("등록된 상품이 없습니다.");
                }
            }
        }//while end
        sc.close();

    }



}
