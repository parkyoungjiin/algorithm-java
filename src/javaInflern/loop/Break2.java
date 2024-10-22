package javaInflern.loop;

public class Break2 {
    public static void main(String[] args) {
        int val = 1;
        while (val <= 5){

            if (val == 3){
                val++;
                continue;
            }

            System.out.println("val=" + val);
            val++;
        }
    }
}
