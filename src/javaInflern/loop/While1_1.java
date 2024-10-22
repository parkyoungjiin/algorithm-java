package javaInflern.loop;

public class While1_1 {
    public static void main(String[] args) {
        int value = 0;
        while(true){
            System.out.println("현재 value =" + value);
            if (value >= 3){
                break;
            }

            value++;

            //continue : 반복문의 조건식으로 다시 돌아간다.
        }
    }
}
