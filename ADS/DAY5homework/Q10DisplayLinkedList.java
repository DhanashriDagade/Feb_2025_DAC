class Q10DisplayLinkedList {
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
    
    public static void main(String[] args) {
        Q10DisplayLinkedList list = new Q10DisplayLinkedList();
         list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.insertAtBeginning(30);
        list.display();  
    }
}
