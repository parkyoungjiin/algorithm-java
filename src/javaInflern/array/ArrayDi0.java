package javaInflern.array;

public class ArrayDi0 {
    public static void main(String[] args) {
//        int[][] arr = new int[2][3]; //2*3 2차원 배열
//        arr[0][0] = 1;
//        arr[0][1] = 2;
//        arr[0][2] = 3;
//        arr[1][0] = 4;
//        arr[1][1] = 5;
//        arr[1][2] = 6;

        int[][] arr = {
            {1,2,3},
            {4,5,6}
        };

        for (int i=0; i<arr.length; i++){
            for (int j=0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
