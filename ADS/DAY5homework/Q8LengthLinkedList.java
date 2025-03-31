
class Q8LengthLinkedList {
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
    
 public int getLength() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
   
    
    public static void main(String[] args) {
        Q8LengthLinkedList list = new Q8LengthLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
        
     System.out.println("Length of the list: " + list.getLength());   
    }
}
/*30 -> 20 -> 10 -> null
Length of the list: 3*/