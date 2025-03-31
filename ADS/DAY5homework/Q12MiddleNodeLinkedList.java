class Q12MiddleNodeLinkedList {
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
    
    public Node findMiddle() {
        if (head == null) return null;
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    
    public static void main(String[] args) {
        Q12MiddleNodeLinkedList list = new Q12MiddleNodeLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.insertAtBeginning(40);
        list.insertAtBeginning(50);
        
        System.out.println("Original List:");
        list.display();  
        
        Node middle = list.findMiddle();
        if (middle != null) {
            System.out.println("Middle Node: " + middle.data);
        } else {
            System.out.println("List is empty.");
        }
    }
}
/*Original List:
50 -> 40 -> 30 -> 20 -> 10 -> null
Middle Node: 30*/