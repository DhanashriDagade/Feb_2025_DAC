class Q4InsertionAtPosition{
	
    Node start;   
    static class Node{
		int data;   
		Node next;  
		
		Node(int d){
		 data = d;   
		 next = null; 
		}
    }
	
	void display(){
		Node n = start;
		while (n!= null){
			System.out.print(n.data + "---->");
			n = n.next;
		}
	}
	
		//insertion begining
	void insert(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = start;
		start = new_node ;
		
	}
	
	//ending
	
	void insertAfter(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	
	public static void main(String[] args){
		
		Q4InsertionAtPosition l= new Q4InsertionAtPosition();
		// print insertion begining
		l.insert(30);
		l.insert(20);
		l.insert(10);
		l.insert(5);
		l.insert(100);
		System.out.println("\n ");
		System.out.println("insertion at strating");
		l.display();
		
		System.out.println("\n ");
		System.out.println("insertion between");
		l.insertAfter(l.start.next.next, 150);
		l.display();
	}
}

/*insertion at strating
100---->5---->10---->20---->30---->

insertion between
100---->5---->10---->150---->20---->30---->*/