
class Q9EmptyLinkedList {
    Node head;
	
  class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
   }
   
   public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    
  public boolean isEmpty() {
        return head == null;
    }
    
   
    
    public static void main(String[] args) {
        Q9EmptyLinkedList list = new Q9EmptyLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
        
     System.out.println("Length of the list: " + list.isEmpty());   
    }
}
