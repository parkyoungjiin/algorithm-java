package javaInflern.array;

public class ArrayDi1 {
    public static void main(String[] args) {
        //배열 크기와 상관없이 배열에 순서대로 1씩 증가
        int[][] arr = new int[100][3];
        int num = 1;

        //값 할당
        for(int row=0; row < arr.length; row++){
            for(int col=0; col < arr[row].length; col++){
                arr[row][col] = num++;
            }
        }
        //출력
//        for (int i=0; i<arr.length; i++){
//            for (int j=0; j < arr[i].length; j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        //향상된 for문
        for(int[]a : arr){
            for (int i=0; i<a.length; i++){
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
}
