class InsertionBeginDemo{
	
    Node start;   //reference starting pt of the list
    static class Node{
		int data;   //store the value of node
		Node next;  //reference stores the address of next node
		
		Node(int d){
		 data = d;    //default value for node.data
		 next = null; //next link ko null bana rahe hai
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
	//insertion between
	void insertAfter(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
	}
	
	void append(int new_data){
		
		Node new_node = new Node(new_data);
		if(start == null){
			start = new Node(new_data);
			return;
		}
		Node n = start;
		while(n.next != null)
			n=n.next;
		n.next = new_node;
		return;
		
	}
	


	public static void main(String[] args){
		
		InsertionBeginDemo l= new InsertionBeginDemo();
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
		
		System.out.println("\n ");
		System.out.println("insertion at ending");
		l.append(250);
		l.display();
		
		
	
	}
	


}