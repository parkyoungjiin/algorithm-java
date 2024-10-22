package javaInflern.loop;

public class Break1 {
    public static void main(String[] args) {
        //1부터 시작해서 계속 누적해서 더하다가 합계가 10보다 처음으로 큰 값은 얼마인가?
        int sum = 0;
        int val = 1;
        while(true){ //true는 무한반복.
            sum += val;

            if (sum > 10){
                System.out.println("합이 10보다 크면 종료 val="+val + "sum=" + sum);
                break;
            }
            val++;
        }

    }
}
