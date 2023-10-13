package dataStructure;

import java.util.Arrays;

public class list3 {
    public static void main(String[] args) {
        int [][] array = new int[8][9];

        //배열에 구구단의 결과값을 저장
        for (int i= 2 ; i<10; i++){
            for (int j=1;j<10;j++){
                array[i-2][j-1]= i * j;
            }
        }

        //배열에 저장된 내용을 출력
        for(int i=0 ; i< array.length; i++){
            System.out.println((i+2) + "단: ");
            System.out.println(Arrays.toString(array[i]));
            System.out.println();
        }
    }
}
