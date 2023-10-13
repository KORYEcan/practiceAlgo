package dataStructure;

public class LinkedList {


    class Node  {
        int data;  //노드에 저장되는  정수 데이터 값
        Node next;  //다음 노드를 가리키는 참조

         Node(int data) {   //노드를 생성하는 생성자, 데이터를 받아 해당 데이터로 노드를 초기화함
            this.data = data;
            this.next = null;
        }
    }

    private Node head;   // 전역 변수로 사용 , 이유-> 포인터로 사용하기 위함  , 접근제어자 Private을 사용하는 이유는 외부 직접 접근을 막기 위함
                        // head는 연결 리스트의 첫번째 노드를 가리키는 변수 이기 때문에 초기에는 null설정되어있음


    public  void append(int data){   // 연결리스트의 끝에 새로운 노드를 추가 하는 메소드
        Node newNode = new Node(data);  //새로운 노드를 만들고 데이터를 설정

        if (head == null ){  //만약 리스트가 비어있다면(headd == null) 새로운 노드를 첫번째 노드로 만들고 메소드를 종료
            head = newNode;  // 변수를 새로운 노드로 업데이트하여 첫 번째 노드를 가리키게 함
            return; // 메소드를 여기서 끝나고 빠져나가게 함
        }
        Node current= head;       // 현재 노드를 가리키는 current 변수를 선언하고 , 이를 head로 초기화함 , 즉 현재 노드를 연결 리스트의 첫 번쨰 노드로 설정함
        while (current.next != null){   //while 반복문을 통해  현재 노드의 다음 노드가 존재 할때까지 반복함 ,현재 노드가 마지막 노드가 될때까지 이동
            current = current.next;
        }
        current.next= newNode;   //반복문에 빠져나오는 후 , 현재 노드가 마지막 노드를 가리키게 됨 /여기에 새로운 노드를 추가하여 연결리스트의 끝에 새로운 노드를 연결함
    }

    public void prepend(int data ){
         Node newNode = new Node(data);
         newNode.next= head;
         head= newNode;
    }

    public void delete ( int data){
        if (head == null){   // 리스트가 비어 있으면 , 더 이상 할 이 없으므로 메소드 종료
            return;
        }
        if (head.data == data){   //첫번째 노드의 데이터가 삭제하려는 데이터와 같다면 , 첫 번째 노드를 두번째 노드로 바꾸고 메소드를 종료
            head= head.next;
            return;
        }
        Node current= head;  // 삭제할 노드를 찾지 못했다면 , 현재 노드를 가리키는  current 변수를 생성하고 이를 첫번쨰 노드(head)로 초기화
        while (current.next != null){   //현재 노드의 다음노드가 존재 할때 까지 반복 , 현재 노드가 마지막 노드에 도달 할때까지 계속해서 다음 노드로 이동
            if (current.next.data == data){  // 현재 노드의 다음노드의 데이터가 삭제하려는 데이터와 같다면
                current.next = current.next.next; //현재 노드의 다음 노드를 그 다음 노드로 연결하고 메소드를 종료함
                return;
            }
            current= current.next; //현재 노드를 다음 노드로 업데이트하여 계속해서 다음 노드로 이동함
        }   //반복문이 끝나면 삭제할 데이터가 없을 시 메소드 종료 
    }
    public void display() {
        Node current = head;
        while( current != null){
            System.out.println(current.data + " -> ");
            current= current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.prepend(8);
        linkedList.append(4);
        linkedList.append(0);
        linkedList.append(6);

        linkedList.display();
    }

}