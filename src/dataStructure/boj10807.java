package dataStructure;

import java.util.Scanner;

public class boj10807 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();  //배열의 길이 입력
        int[] array = new int[length];  //배열의 선언과 동시에 length 세팅

        for (int i = 0; i < array.length; i++) {   //배열의 값 입력과 삽입
            array[i] = sc.nextInt();
        }
        int number=sc.nextInt();
        int count=0;   // 카운트 해주는 변수

        for (int i = 0; i < length; i++) {
            if (number == array[i]) {  //같을 때 카운트 세주는
               ++count;
            }
        }
        System.out.println(count);
    }
}
