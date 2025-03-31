
class Q5DeleteByValueLinkedList {
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
    
    public void deleteByValue(int value) {
        if (head == null) return;
        
        if (head.data == value) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }
        
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    
   
    
    public static void main(String[] args) {
        Q5DeleteByValueLinkedList list = new Q5DeleteByValueLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
        
        list.deleteByValue(20);
        list.display();  
    }
}
//30 -> 20 -> 10 -> null
//30 -> 10 -> null