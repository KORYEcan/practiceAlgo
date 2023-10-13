package dataStructure;

public class list2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // 2차원 배열 순회하여 모든 요소 출력
        for (int[] row : matrix) {   //배열 'matrix'의 각 행을 순회함 , 'row'변수에는 각행의 참조가 순차적으로 할당됨
            for (int element : row) {  // 행을 순회하여 해당 행의 각 열의 요소를 가져옴
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
