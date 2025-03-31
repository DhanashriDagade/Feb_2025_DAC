class Q11ReverseLinkedList {
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
    
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    
    public static void main(String[] args) {
        Q11ReverseLinkedList list = new Q11ReverseLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        
        System.out.println("Original List:");
        list.display();  
        
        list.reverse();
        
        System.out.println("Reversed List:");
        list.display();
    }
}
/*Original List:
30 -> 20 -> 10 -> null
Reversed List:
10 -> 20 -> 30 -> null*/