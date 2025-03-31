class Q3Insertionend{
	
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
		
		Q3Insertionend l= new Q3Insertionend();
		// print insertion begining
		l.insert(30);
		l.insert(20);
		l.insert(10);
		l.insert(5);
		l.insert(100);
		
		System.out.println("insertion at ending");
		l.append(250);
		l.display();
	}
}

//insertion at ending
//100---->5---->10---->20---->30---->250---->