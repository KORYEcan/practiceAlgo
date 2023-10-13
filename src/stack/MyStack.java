package stack;

public class MyStack<T> implements IStack<T> {
   private int size;
   private Node head;

public MyStack() {  //stack 초기화
  this.size= size();
  this.head= new Node(null);  // head는 null을 가리키고 있다.
}


  @Override
  public void push(T data) {   //데이터를 넣을 떄 쓰는 메서드 , 데이터를 추가할 떄
  Node node =  new Node(data,this.head.next);
  this.head.next = node;
  this.size++;
  }

  @Override
  public T pop() {   //데이터를 꺼내주는 메서드
    Node curr = this.head.next;
    this.head.next =curr.next;
    curr.next= null;
    this.size--;
    return curr.data;
  }

  @Override
  public T peek() {   //
     if (this.isEmpty()) {
          return null;
     }
    return this.head.next.data;
  }

 private boolean isEmpty() {
    return this.head.next == null;
  }

  @Override
  public int size() {
    return this.size;
  }

  public class Node {
    T data;
    Node next;

    Node(T data){ this.data= data;}
    Node(T data , Node next ){
      this.data = data;
      this.next = next;
    }

  }
}
