package dataStructure;

public class Stack {

    private int[] array;   // 정수형 데이터를 저장할 배열
    private int top;    // 스택의 최상위 인덱스를 나타냄
    private int capacity;  //스택의 최대 크기를 나타냄

    public Stack(int capacity){    // 생성자 정의 , capacity를 받아와서 배열의 크기를 초기화하고 ,top 을 -1로 설정하여 스택이 비어있음을 나타냄
        this.capacity =capacity;
        this.array=new int[capacity];
        this.top= -1;   //스택이 비어 있을 때의 상태를 나타냄
    }

    public void push(int item){    // push 메서드 는 스택에 요소를 추가함
        if(isFull()){   // isFull 메서드를 사용하여 스택이 가득 찼는지 확인함
            System.out.println("스택이 가득 찼습니다.");  //가득 찼으면 오류 메시지를 출력하고 함수를 종료
            return;
        }
        array[++top]= item;  //아니라면 top을 증가시키고 , 그 위치에 데이터를 추가함
    }

    public int pop() {   //스택에서 요소를 꺼냅니다.
        if(isEmpty()){   //  스택이 비어있는지 확인
            System.out.println("스택이 비어있습니다.");
            return -1; //특정 값으로 에러 상태를 나타냄
        }
        return array[top --];   // top 위치에 있는 값을 반환 하고 top을 감소시켜 해당 위치를 삭제함
    }

    public int peek() {   //스택의 맨위 요소를 반환함
        if(isEmpty()){ //스택이 비어 있는지 확인
            System.out.println("스택이 비어있습니다.");
            return -1; //특정 값으로 에러 상태를 나타냄
        }
        return array[top];  //top위치에 있는 값을 반환함
    }
    public boolean isEmpty(){
        return  top == -1;   // 스택이 비어있는지 여부를 확인 , top이 -1이면 비어있다고 판단함
    }
    public boolean isFull() {  //스택이 가득 찼는지 여부를 확인 함
        return top == capacity -1 ; //
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);

        System.out.println("Top element: "+ stack.peek());  //출력 : 30
        System.out.println("Popped element: "+ stack.pop());  //출력 : 30
        System.out.println("Top element: "+ stack.peek());  //출력 : 20
        System.out.println("Popped element: "+ stack.pop());  //출력 : 30
        System.out.println("Top element: "+ stack.peek());  //출력 : 20

    }

}
