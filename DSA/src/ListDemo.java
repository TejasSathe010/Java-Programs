import java.util.*; 


public class ListDemo {
	
	static void LinkedListDemo() {
		System.out.println("\n\nLinkedList");

        List<String> Li = new LinkedList<String>();
        Li.add("Tejas");
        Li.add("Anil");
        Li.add("Sathe");
        Li.sort(null);
        List<String> Li1 = new LinkedList<String>(Li);
        Li1.forEach(e->System.out.print("\t" + e));

        

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		//li.remove(2);
		li.forEach(e->System.out.print(e));

		List<Integer> li1 = new ArrayList<Integer>();
		li1.add(1);
		li1.addAll(li);
		
		ListIterator<Integer> ltr = li1.listIterator();
		while(ltr.hasNext()) {
			System.out.println(ltr.next());
		}
		System.out.println("\n");

		System.out.println(li.get(1));
		
		li.set(0, 10);
		System.out.println("\n");

	
		System.out.println(li.get(0));
		
		System.out.println("\n");

		System.out.println(li.indexOf(10));
		
		List<Integer> range = new ArrayList<Integer>();
		range = li1.subList(1, li1.size());

		System.out.println("\nRange..>");

		ListIterator<Integer> ltr1 = range.listIterator();
		while(ltr1.hasNext()) {
			System.out.println(ltr1.next());
		}
		
		LinkedListDemo();
	}
}
