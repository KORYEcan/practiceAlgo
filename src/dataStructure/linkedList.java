package dataStructure;

import java.util.LinkedList;

public class linkedList {

  class Node {
    int data;
    Node next;

    public Node(int data) {
      this.data = data;
      this.next = null;
    }
  }
    private Node head;


    public void append(int data ) {
     Node newNode = new Node( data);

     if (head == null){
       head =newNode;
       return;
     }
     Node current= head;
     while (current.next != null ){
       current = current.next;
     }
     current.next=newNode;
    }

    public void prepend ( int data) {
   Node newNode = new Node(data);
   newNode.next = head;
   head =newNode;
    }

    public void delete(int data){
      if (head == null){   //삭제할 데이터 값이 없으면 바로 메소드 종료
        return;
      }
      if (head.data == data){   //삭제할 데이터 값이 현재 위치에있는 데이터 값가 일치하면
        head = head.next;
        return;
      }
      Node current = head;
      while (current.next != null){
        if (current.next.data == data){
          current.next = current.next.next;
          return;
        }
        current = current.next;

      }
    }

    public void display() {
      Node current= head;
      while (current != null){
        System.out.println(current.data + " -> ");
        current = current.next;
      }
      System.out.println("null");
    }

  public static void main(String[] args) {
    linkedList linkedList = new linkedList();
    linkedList.append(1);
    linkedList.append(2);
    linkedList.append(3);
    linkedList.prepend(0);
    linkedList.delete(2);

    linkedList.display();
    }
  }

