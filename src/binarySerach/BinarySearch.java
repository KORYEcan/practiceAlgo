package binarySerach;

public class BinarySearch {
    public int search(int[] arr, int target){
        //1. 데이터의 중간 인덱스 값을 찾는다.
        //2. 중간 인덱스 위치를 기준으로 arr을 절반으로 나눈다.
        //3. 나눠진 절반의 리스트에서 target 값을 찾는다.

        int L = 0;  //L은 리스트의 왼쪽 끝 인덱스니깐 0으로 초기화
        int R= arr.length-1;  //리스트의 오른쪽은 끝은 배열길이 -1 으로 초기화

        int m;  // 중간 인덱스  값

    while (L<=R) {   //L은 R보다 크거나 같은건 이미 리스트 한번 다 돈것
         m = L + ((R -L ) /2 );  //오버플로우 예외 나는것을 방지할수 있는 코드
        //이렇게 나온 중간 값으로
         if (arr[m] == target){  //찾고 하는 target값과 동일하다면?
             return m; //위치 인덱스  m return
         }
         if (arr[m]< target){  //target값이 더 큰경우
              L= m +1;
         }else{   //target 값이 더 작은 경우
             R = m -1;
         }
    }
        return -1;
    }
}
