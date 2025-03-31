class LinkedListDemo{ 

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
		/*Node n = start;
		while (n.next != null){
			System.out.println(n.data);
			n = n.next;
		}*/
	}


	public static void main(String[] args){
		
		LinkedListDemo l= new LinkedListDemo();
		l.start = new Node(5);
		Node second = new Node(10);
		Node third = new Node(20);
		Node four = new Node (30);
		
		l.start.next = second;
		second.next = third;
		third.next = four; 
		// four.next = null;
		
		l.display();
		
	
	}
	
}
