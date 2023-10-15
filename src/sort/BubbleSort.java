package sort;

public class BubbleSort implements ISort{
    @Override
    public void sort(int[] arr) {
        //안정 정렬
        //인플레이스 정렬
        for (int i = 0; i< arr.length-1; i++){   //전체 리스트
            for (int J =0; J <arr.length -1 -i; J++){  //정렬된 리스트를 제외
                if (arr[J] > arr[J +1]){  //인덱스 0부터 시작해서 크기를 비교 , 크기가 왼쪽 인덱스의 데이터값이 더크면 값교환 , 그렇지 않으면 패스
                    int tmp = arr[J];
                    arr[J] = arr[J+1];
                    arr[J+1]=tmp;
                }
            }
        }

    }
}
