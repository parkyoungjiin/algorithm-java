package javaInflern.loop;

public class WhileEx2 {
    public static void main(String[] args) {
        //중첩 for문 사용하여 구구단 완성
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " = " + (i*j));
            }
        }

    }
}
