package list;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class boj_11728 {
    public static void main(String[] args) {
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //배열 A의 사이즈
        int M = sc.nextInt(); //배열 B의 사이즈

        List<Integer> listA = new LinkedList();
        List<Integer> listB = new LinkedList();
        //배열 A의 값 입력
        for (int i = 0 ; i< N; i++){
            int n = sc.nextInt();
            listA.add(n);
        }
        //배열 B의 값 입력
        for (int i = 0; i< M; i++) {
            int m = sc.nextInt();
            listB.add(m);
        }
        // 두 배열을 값 하나 씩 비교 하면서 배열 C에 저장
        List<Integer> result = new LinkedList();

        int i= 0 , j=0; // 배열 A의 인덱스-> i , 배열 B의 인덱스-> j
        while (i < N && j< M){
            int a=listA.get(i);
            int b=listB.get(j);

            if (a <= b){
                result.add(a);
                i++;
            }else{
                result.add(b);
                j++;
            }
        }
        for ( ;i<N; i++){
            result.add(listA.get(i));
        }
        for (; j<M; j++){
            result.add(listB.get(j));
        }


        //output
        StringBuilder sb= new StringBuilder();
        for (int e : result){
            sb.append(e + " ");
        }
        System.out.println(sb.toString());
    }


}
