class Q13DetectLinkedList {
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
    
    public boolean hasCycle() {
        if (head == null) return false;
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Q13DetectLinkedList list = new Q13DetectLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        
        System.out.println("Original List:");
        list.display();  
        
        // Creating a cycle for testing
        list.head.next.next.next.next.next = list.head.next; 
        
        if (list.hasCycle()) {
            System.out.println("The linked list has a cycle.");
        } else {
            System.out.println("The linked list does not have a cycle.");
        }
    }
}
/*Original List:
50 -> 40 -> 30 -> 20 -> 10 -> null
The linked list has a cycle.*/