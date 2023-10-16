package dataStructure;

import java.util.LinkedList;
import java.util.Queue;

public class practice {
    public static void main(String[] args) {
        //LinkedList를 사용하여 큐 생성
        Queue<Integer> myQueue = new LinkedList<>();

        myQueue.offer(5);
        myQueue.offer(2);
        myQueue.offer(3);

        //큐에서 요소 추출
        int frontElement = myQueue.poll();   // 큐의 맨 앞 요소를 추출하고 반환
        System.out.println("Front Emlement: "+ frontElement );

        //현재 큐의 맨 앞 요소 확인 ( 제거하지 않고 반환)
        int peekedElement = myQueue.peek();
        System.out.println("Peeked Elmenet : "+ peekedElement);

        //큐의 크기 확인
        int size = myQueue.size();
        System.out.println("Queue Size : "+ size);
    }

}
