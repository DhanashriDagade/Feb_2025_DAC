class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Q1LinkedList {
    private Node head;

    public Q1LinkedList() {
        this.head = null;
    }

    //insert
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }
   //delete
    public void delete(int key) {
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value " + key + " not found in the list.");
            return;
        }
        prev.next = temp.next;
    }
    //traverse
    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("None");
    }
	
	//search

    public boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                System.out.println("Value " + key + " found in the list.");
                return true;
            }
            temp = temp.next;
        }
        System.out.println("Value " + key + " not found in the list.");
        return false;
    }

    public static void main(String[] args) {
        Q1LinkedList ll = new Q1LinkedList();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
		
        ll.traverse();
		
        ll.search(20);
		
        ll.delete(20);
		
        ll.traverse();
		
        ll.search(20);
    }
}
