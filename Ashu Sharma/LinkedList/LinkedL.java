package LinkedList;


class Node{
      Node next;
      int data;
      
      Node(int data){
            this.data = data;
            this.next = null;
      }
}


public class LinkedL {
      Node head;
      Node tail;
      
     
       public void addLast(int data){
            Node newNode = new Node(data);
            if(head == null){
                  head = newNode;
                  tail = newNode;
            }else{
                  tail.next = newNode;
                  tail = newNode;
            }


      }

      public void addFirst(int data){
            Node newNode = new Node(data);
            if(head == null){
                  head = newNode;
                  tail = newNode;
            }else{
                  newNode.next = head;
                  head = newNode;
            }
      }

      public void printList(){
            Node current = head;
            while(current != null){
                  System.out.print(current.data + " -> ");
                  current = current.next;
            }
            System.out.println("null");
      }

      public void addmiddle(int data, int index){
            Node newNode = new Node(data);
            if(index == 0){
                  addFirst(data);
                  return;
            }
            Node current = head;
            for(int i = 0; i < index - 1; i++){
                  if(current == null){
                        System.out.println("Index out of bounds");
                        return;
                  }
                  current = current.next;
            }
            if(current == null){
                  System.out.println("Index out of bounds");
                  return;
            }
            newNode.next = current.next;
            current.next = newNode;
            if(newNode.next == null){
                  tail = newNode;
            }
      }

      


}
