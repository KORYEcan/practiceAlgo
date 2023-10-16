package basic;

import java.util.Scanner;

public class Median {   //3개의 정숫값을 입력하고 중앙값을 구하여 출력

    static int med3(int a, int b, int c) {
        if (a >= b)        //a가 b보다 크거나 같을때
            if (b >= c)   //b가 c보다 크거나 같을떄
                return b;   // A, B , F , G
            else if (a <= c) //c가 a보다 크거나 같을때
                return a; // D , E , H
            else
                return c;
        else if (a > c)
            return a;
        else if (b < c)
            return c;
        else
            return b;  // L , M

    }



    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.println("a의 값:   ");
        int a= stdIn.nextInt();
        System.out.println("b의 값:  ");
        int b= stdIn.nextInt();
        System.out.println("c의 값:  ");
        int c= stdIn.nextInt();


        System.out.println("중앙 값은 "+med3(a,b,c)+"입니다.");
    }
}



