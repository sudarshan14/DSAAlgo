class Main{


public static void main(String[] main){
    SinglyLinkedList  s = new SinglyLinkedList();
    s.createSignlyLinkedList(5);
    System.out.println(s.head.value);
    // System.out.println(s.tail.value);

    s.insertInLinkedList(6,1);
  System.out.println(s.head.next.value);
  }

}