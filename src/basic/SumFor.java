package basic;

import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.println("n값: ");
        int n= sc.nextInt();
        int sum= 0;

        if (n>0){
            for (int i= 1; i<=n;i++){
                sum+=i;
            }
            System.out.println("총합은 "+sum+" 입니다");

        } else{
            System.out.println("음수 말고 양수로 입력해주세요!");
        }



    }
}
