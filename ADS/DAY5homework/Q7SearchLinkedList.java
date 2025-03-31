
class Q7SearchLinkedList {
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
    
     public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    
   
    
    public static void main(String[] args) {
        Q7SearchLinkedList list = new Q7SearchLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
        
        System.out.println("Search 30: " + list.search(30)); 
        System.out.println("Search 20: " + list.search(20)); 
        System.out.println("Search 50: " + list.search(50));  
    }
}
