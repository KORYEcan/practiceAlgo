package basic;

import java.util.Scanner;

public class boj2525 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //현재 시각 입력 A hour B min , 요리하는데 필요한 시간 C
        int A = sc.nextInt();   //현재 시각 hour
        int B = sc.nextInt();  //현재 시각 min
        int C = sc.nextInt();

        int sum = B+C;  // 현재 min 과 조리 min 합

        if (sum >= 60) {

             A+= (sum/60);   // 몫 : 시간
             B+= (sum%60); // 나머지 : 분

            if (B > 60 ){   
                B=0;
               if (A >= 23){
                   A-=23;
               }
            }

            } else {  //분끼리 더한 합이 60분이상 아니면 그냥 시간을 나두고 분끼리 계산해서 예정시간만 보여주면 됨
                B = B + C;
            }
            System.out.println(A + " " + B);
        }
    }

