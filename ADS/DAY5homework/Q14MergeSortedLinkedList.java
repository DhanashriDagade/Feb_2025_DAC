class Q14MergeSortedLinkedList {
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
    
    public static Node mergeSortedLists(Node l1, Node l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        Node dummy = new Node(0);
        Node current = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }
        
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }
        
        return dummy.next;
    }
    
    public static void main(String[] args) {
        Q14MergeSortedLinkedList list1 = new Q14MergeSortedLinkedList();
        list1.insertAtBeginning(10);
        list1.insertAtBeginning(8);
        list1.insertAtBeginning(5);
        list1.insertAtBeginning(1);
        
        Q14MergeSortedLinkedList list2 = new Q14MergeSortedLinkedList();
        list2.insertAtBeginning(9);
        list2.insertAtBeginning(6);
        list2.insertAtBeginning(3);
        list2.insertAtBeginning(2);
        
        System.out.println("List 1:");
        list1.display();
        
        System.out.println("List 2:");
        list2.display();
        
        Node mergedHead = mergeSortedLists(list1.head, list2.head);
        
        System.out.println("Merged Sorted List:");
        Q14MergeSortedLinkedList mergedList = new Q14MergeSortedLinkedList();
        mergedList.head = mergedHead;
        mergedList.display();
    }
}
