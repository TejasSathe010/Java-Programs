
public class LQueue {
	int front,rear;
	int capacity;
	int arr[];

	public LQueue(int cap) {
		capacity = cap;
		rear = front = - 1;
		arr = new int[capacity]; 
	}
	boolean isEmpty() {
		return (front == -1 && rear == -1);
	}

	public void Enqueue(int item) {
		if((rear + 1)%capacity == front) {
			System.out.println("Queue Is Full..");
			return;
		}else if (isEmpty()) {
			rear = front = 0;
		}else {
			rear = (rear + 1)%capacity;
		}
		System.out.println(rear + " Rear in Queue..");
		arr[rear] = item;
		System.out.println(item + " Enqueued in Queue..");
	}

	public int Dequeue() {
		int item = 0;
		if(isEmpty()) {
			return Integer.MIN_VALUE;
		}else if(front == rear) {
			front = rear = -1;
		}else {
			System.out.println(front + " Front in Queue..");
			item = arr[front];
			front = (front + 1)%capacity;
		}
		return item;
	}
	
	int front() 
    { 
        if (isEmpty()) 
            return Integer.MIN_VALUE; 
           
        return this.arr[this.front]; 
    } 
        
    // Method to get rear of queue 
    int rear() 
    { 
        if (isEmpty()) 
            return Integer.MIN_VALUE; 
           
        return this.arr[this.rear]; 
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LQueue queue = new LQueue(5); 

		queue.Enqueue(10); 
		queue.Enqueue(20); 
		queue.Enqueue(30); 
		queue.Enqueue(40);
		queue.Enqueue(80); 
		queue.Enqueue(70); 
		queue.Enqueue(60); 


		System.out.println(queue.Dequeue() +  
				" dequeued from queue\n");
		queue.Enqueue(60); 


		System.out.println("Front item is " +  
				queue.front()); 

		System.out.println("Rear item is " +  
				queue.rear()); 


	}

}
