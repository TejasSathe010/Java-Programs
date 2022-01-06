
class LinkedListDemo {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
		
		public void printList() {
			Node n = head;
			while(n != null) {
				System.out.println(n.data + " ");
				n = n.next;
			}
		}
		
		public void push(int data) {
			Node new_node = new Node(data);
			new_node.next = head;
			head = new_node;
		}
		
		public void insertAfter (Node prev, int data) {
			if(prev == null) {
				System.out.print("Prev Can Not Be Null");
				return;
			}
			
			Node new_node = new Node(data);
			new_node.next = prev.next; 
		    prev.next = new_node;
		}
		
		public void append (int new_data) {
			//if(head == null) {
			//	System.out.print("Head Can Not Be Null");
			//	return;
			//}
			
			Node new_node = new Node(new_data);
			new_node.next = null;
			
			Node last = head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
			return;
		}
		
	    void deleteNodeKey(int key) {
	    	Node temp = head;
	    	Node prev = null;
	    	
	    	if(temp != null && temp.data == key) {
	    		head = temp.next;
	    		return;
	    	}
	    	
	    	while(temp != null && temp.data != key) {
	    		prev = temp; 
	    		temp = temp.next;
	    	}
	    	
	    	if(temp == null)
	    		return;
	    	
	    	prev.next = temp.next;
	    }
	    
	    void deleteNodePos(int position) {
	    	if(head == null) {
	    		return;
	    	}
	    	
	    	Node temp = head;
	    	if(position == 0) {
	    		head = temp.next;
	    		return;
	    	}
	    	
	    	for(int i = 0; temp != null && i < position -1;i++) {
	    		temp = temp.next;
	    	}
	    	
	    	if(temp == null || temp.next == null) {
	    		return;
	    	}
	    	
	    	Node next = temp.next.next;
	    	temp.next = next;
	    }




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListDemo llist = new LinkedListDemo();
		llist.head = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		
		llist.head.next = second;
		second.next = third;
		third.next = llist.head;
		
		llist.push(5);
		llist.insertAfter(second, 15);
		llist.append(95);
		llist.deleteNodeKey(15);
		llist.deleteNodePos(1);

		
		llist.printList();
	}
}
