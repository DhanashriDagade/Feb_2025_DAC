class Q15RemoveDuplicatesSortedLinkedList {
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
    
    public void removeDuplicates() {
        Node current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }
    
    public static void main(String[] args) {
        Q15RemoveDuplicatesSortedLinkedList list = new Q15RemoveDuplicatesSortedLinkedList();
        list.insertAtBeginning(10);
        list.insertAtBeginning(10);
        list.insertAtBeginning(8);
        list.insertAtBeginning(8);
        list.insertAtBeginning(5);
        list.insertAtBeginning(5);
        list.insertAtBeginning(1);
        list.insertAtBeginning(1);
        
        System.out.println("Original Sorted List with Duplicates:");
        list.display();
        
        list.removeDuplicates();
        
        System.out.println("List after Removing Duplicates:");
        list.display();
    }
}
/*Original Sorted List with Duplicates:
1 -> 1 -> 5 -> 5 -> 8 -> 8 -> 10 -> 10 -> null
List after Removing Duplicates:
1 -> 5 -> 8 -> 10 -> null*/