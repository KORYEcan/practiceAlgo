package list;

public class MyDoubleLinkedList<T> implements IList<T> {

   private Node head;   // Node의 시작 head
   private Node tail;   //Node의 끝 tail
   private int size;   //리스트의 크기를 저장할 수 있는 변수

   public MyDoubleLinkedList(){
       this.size=0;  //list의 크기 = 0 초기화
       this.head=new Node(null);  //list head을 null 초기화
       this.tail= new Node(null);//list tail를 null 초기화
       this.head.next=this.tail;  // 초기에는 head과 tail밖에 없어서 두 데이터를 연결
       this.tail.prev=this.head; // 초기에는 head과 tail밖에 없어서 두 데이터를 연결
   }
   public class Node {  //연결리스트의 노드를 정의
       T data;  //각 노드는 데이터를 가지고 있음
       Node prev;  // 이전 노드를 가리키는 포인터
       Node next;  //다음 노드를 가리키는 포인터

       Node(T data ){ this.data=data;}
       Node(T data, Node prev, Node next ){
           this.data=data;
           this.prev=prev;
           this.next=next;
       }
   }
    @Override
    public void add(T t) { //리스트 끝에 요소를 추가함
      Node last= this.tail.prev; // last 마지막 노드를 나타냄 , tail prev이  노드 마지막
      Node node = new Node(t,last,this.tail); // 새로운 노드 생성, t로 데이터추가, prev(last) 추가, next(this.tail)  추가
      last.next=node;  // 꼬리 이전의 다음에  새로운 node 연결
      this.tail.prev=node; // tail전에 있는 node를 새로운 node랑 연결
      this.size++; // size 추가
    }

    @Override
    public void insert(int index, T t) {  //특정 위치에 요소를 삽입
     Node prev =  null;
     Node curr = null;

     int i =0 ;   //index를 찾기 위한 카운터

     if ( index < this.size /2){   //리스트의 크기에 반해서 index보다 작으면 head에 가까움
         prev = this.head; //head에 가까우니깐 prev를 head로 최기화
         curr = this.head.next; // head에 가까우니깐 curr를 head 다음로 초기화

         while (i++ < index){ // prev와 curr를 index위치까지 이동
             prev= prev.next;
             curr= curr.next;
         }

     }else{   //tail에 가까운 경우
         curr = this.tail;  // tail에 가까우니깐 curr-> tail에 참조
         prev= this.tail.prev; //tail에 가까우니깐 prev-> tail이전으로 참조
         while (i++ < (this.size - index)){ // index위치까지 이동
             curr = curr.prev; //tail에서 시작하니깐 역순으로 prev
             prev= prev.prev; // tail전에서 시작하니깐 역순으로 prev.prev으로
         }
     }
        Node node = new Node(t, prev , curr); //새로운 노드를 prev과 curr에 포인터 연결
        prev.next = node; // prev 다음을 새로운 노드와 연결
        curr.prev= node; // curr이전 노드를 새로운 노드와 연결

        this.size++;  //size 업
    }

    @Override
    public void clear() {  // 리스트를 초기화 해주는 메소드
    this.size=0; //사이즈 0으로 초기화
    this.head.next=this.tail;  // head와 tail 서로 연결
    this.tail.prev=this.head; // head와 tail 서로 연결
    }

    @Override
    public boolean delete(T t) {
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
       Node prev= null;  //null값으로 초기화
       Node curr =null;  //null값으로 초기화
       Node next = null; //null값으로 초기화

       int i  =0;   // 카운트를 위한 변수

       if (index < this.size /2  ){  //head에 가까운 경우
           prev= this.head;  //prev은 head에서 시작
           curr =this.head.next; //curr은 head다음으로 시작

           while (i++ < index) {  //index위치까지 찾기
               prev = prev.next;
               curr =curr.next;
           }
           prev.next =curr.next; //curr.next->  prev.next로 초기화
           curr.next.prev=prev;  //prev을 curr.next.prev로 초기화
           curr.next=null;
           curr.prev=null;


       }else{ //tail 가까운 경우
           curr = this.tail.prev;
           next= this.tail;
           while (i++ < (this.size - index -1)){
               next = next.prev;
               curr= curr.prev;
           }
           next.prev = curr.prev;
           curr.prev.next =next;
           curr.next= null;
           curr.prev=null;

       }
      this.size--;
        return false;
    }

    @Override
    public T get(int index) {
       if (index >= this.size || index < 0 ){
           throw new IndexOutOfBoundsException();
       }

       int i = 0;
       Node curr = null;

       if (index < this.size /2 ){   //index 가 헤드에서 더 가까우면
           curr = this.head.next;
           while (i++ < index){
               curr = curr.next;
           }
       }else{   //index가 tail에서 더 가까운 경우
        curr = this.tail.prev;
        while (i++ <(this.size - index -1) ){
            curr = curr.prev;
         }
       }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(T t) {  // O(N) -> O(N/2)
//       Node curr= this.head.next;
//       if (index < this.size /2 ) {
//           while (curr != null) {
//               if (curr.data != null && curr.data.equals(t)) {
//                   return true;
//               }
//               curr = curr.next;
//           }
//       }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
