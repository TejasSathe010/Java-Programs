package polymorphism;

public class list {
	void add(animal d) {
		animal a[] = new animal[5];
		for(int x = 0;x < a.length;x++) {
			a[x] = d;
			System.out.println("Object SuccessFully Added.....: " + x);
		}
	}
}
