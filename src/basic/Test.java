package basic;

import java.util.Scanner;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int min = sc.nextInt();

        if (min >= 45) {   //45분보다 크면 45분만 빼서 시간은 No change
            min -= 45;
        } else {     //45분보다 작으면 시간에서 1시간 빼서 분을 환산해 60분을 더하고 -45 해주면  45분 일찍 나오는 결과를 얻을 수 있다.
            min += 60 - 45;  // 이게 그 45분을 구하는 수식
            hour -= 1;  // 시간 처리를 분 처리 이후에 하도록 수정
            if (hour < 0) {   // 여기 하나더 추가 사항 0:0 자정이라는 조건 떄문에 if을 하나를 더 만들어서 걸러준다.
                hour = 23;
            }
        }

        System.out.print(hour + " " + min);
    }
}

