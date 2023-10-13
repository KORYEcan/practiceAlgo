package dataStructure;

public class Node {   // Node 클래스 : 링크드 리스트의 각 노드를 나타냅니다.

        int data;  //노드가 저장하는 데이터
        Node next;  // 다음 노드를 가리키는 포인터

        public Node(int data) {   //Node 객체를 생성할 때 데이터를 받아 초기화 합니다.
            this.data = data;
            this.next = null;  // 다듬 노드는 초기에는 없으므로 null로 설정합니다.

        }
    }

    class Queue {   // 큐를 구현
        private Node front;  // 큐의 맨 앞 요소를 가리키는 포인터
        private Node rear; // 큐의 맨 뒤 요소를 가리키는 포인터

        public Queue() {  // 큐를 초기화합니다.
            this.front = null;  // 초기에는 노드가 없으므로  null 설정
            this.rear = null; //초기에는 노드가 없으므로 null 설정
        }

        public boolean isEmpty() {
            return front == null;
        }   //큐가 비어있는지 확인
                                //front가 null이면 큐는 비어있습니다.
        public void enqueue(int data) {   //큐에 요소를 추가
            Node newNode = new Node(data); //새로운 노드를 생성함

            if (isEmpty()) {   //큐가 비어있다면 새롱룬 노드가 맨 앞이자 맨 뒤임
                front = rear = newNode;
                return;
            }  //큐가 비어있지 않다면 새로운 노드를 큐의 뒤쪽에 추가함
            rear.next = newNode;  //현재 rear가 가리키는 노드의 다음을 새 노드로 설정
            rear = newNode;  // rear를 새로운 노드로 업데이트함
        }

        public int dequeue() {  //큐에서 요소를 제거하고 반환함
            if (isEmpty()) {  //큐가 비어있다면 예외를 던짐
                throw new IllegalStateException(" Queue is empty");
            }

            int data =front.data;  //front가 가리키는 노드의 데이터를 저장함
            front = front.next;   //front를 다음 노드로 업데이트함
            if (front == null) {//만약 큐가 비어잇다면 , rear도 null로 업데이트함
                rear = null;
            }
            return data; //제거된 요소의 데이터를 반환함
        }

        public int peek() {   //큐의 맨 앞 요소를 반환
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return front.data;   //front가 가리키는 노드의 데이터를 반환함
        }
    }





