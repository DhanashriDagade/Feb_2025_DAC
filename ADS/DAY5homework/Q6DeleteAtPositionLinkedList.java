
class Q6DeleteAtPositionLinkedList {
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
    
    public void deleteAtPosition(int position) {
        if (head == null || position < 0)
			return;
        
        if (position == 0) {
            head = head.next;
            return;
        }
        
        Node temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }
        
        if (temp == null || temp.next == null) 
			return;
        
        temp.next = temp.next.next;
    }
    
   
    
    public static void main(String[] args) {
        Q6DeleteAtPositionLinkedList list = new Q6DeleteAtPositionLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
        
        list.deleteAtPosition(1);
        list.display();    
    }
}
//30 -> 20 -> 10 -> null
//30 -> 10 -> null