package stack;


public class MyStack<T>  implements  IStack<T> {

  private int size;
  private Node head;

  public MyStack(){
      this.size= size();
      this.head=new Node( null);

  }

    @Override
    public void push(T data) {
     Node node  =new Node( data,this.head.next);
     this.head.next = node;
     this.size++;
    }

    @Override
    public T pop() {   //데이터를 밖으로 내보내주면서 데이터하나씩 지우는 메서드
        if (isEmpty()){
            return null;
        }
      Node curr = this.head.next;  //head.next가 제일 최신이기 떄문에
      this.head.next = curr.next;  //그다음 노드를 head.next로 연결
      curr.next = null; //
      this.size--;
        return curr.data;
    }

    @Override
    public T peek() {
      if (isEmpty()){
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
        Node(T data) {this.data= data;}
        Node(T data, Node next ){
            this.data=data;
            this.next=next;
        }
    }
}
