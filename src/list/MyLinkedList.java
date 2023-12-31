package list;

public class MyLinkedList<T>  implements IList<T>{

    private int size;
    private Node head;

    public MyLinkedList() {
    this.size=0;
    this.head= new Node(null);   //dummy head node
    }
    @Override
    public void add(T t) {
       Node curr = this.head;
       while (curr.next == null){
           curr = curr.next;
       }
       Node node = new Node(t);
       curr.next = node;
       this.size++;
    }

    @Override
    public void insert(int index, T t) {    // 리스트의 특정 위치에 새로운 노드를 삽입
        if (index > this.size || index < 0  ){
            throw  new IndexOutOfBoundsException();
        }
             Node prev = this.head;
             Node curr= prev.next;

             int i = 0;

        while (i++ < index) {
            prev = prev.next;
            curr = curr.next;
        }
        Node node = new Node(t, curr);
        prev.next = node;
        this.size++;

    }

    @Override
    public void clear() {
        this.size= 0;
        this.head.next = null;
    }

    @Override
    public boolean delete(T t) {
        Node prev = this.head;
        Node curr = prev.next;
        while( curr != null){
            if (curr.data.equals(t)){
                prev.next = curr.next;
                curr.next = null;
                this.size--;
                return true;
            }
          prev = prev.next;
          curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        if (index >= this.size || index < 0  ){
            throw  new IndexOutOfBoundsException();
        }
        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        while (i++ < index){
            prev = prev.next;
            curr = curr.next;
        }
        prev.next = curr.next;
        curr.next =null;
        this.size --;
        return true;
    }

    @Override
    public T get(int index) {
        if (index >= this.size || index < 0  ){
            throw  new IndexOutOfBoundsException();
        }

        Node curr = this.head.next;  //this.head는 dummy data이기때문에  그다음애서 시작하기
        int i = 0;
        while (i++ < index){
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        Node curr = this.head.next;
        int index=0;

        while (curr != null){
            if (t.equals(curr.data)){
                return  index;
            }
            curr= curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public boolean contains(T t) {
        Node curr =this.head.next;
        while (curr != null){
            if (t.equals(curr.data)){
               return true;
            }
            curr =curr.next;
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    private class Node {
        T data;
        Node next;

         Node(T data) {
            this.data = data;
        }

        Node(T data , Node next) {
             this.data=data;
             this.next=next;
        }
    }
}
