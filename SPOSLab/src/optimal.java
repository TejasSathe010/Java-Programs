
import java.util.ArrayList;
import java.util.Scanner;
public class optimal{
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter no of pages");
		int p = sc.nextInt();
		System.out.println("Enter size of frame");
		int f = sc.nextInt();
		int pf = 0;
		int parray[] = new int[p];
		ArrayList<Integer> q = new ArrayList<Integer>();
		for(int i=0;i<p;i++) {
			System.out.println("Enter page");
			parray[i] = sc.nextInt();
		}

		for(int i=0;i<p;i++) {
			if(q.size() < f && !q.contains(parray[i])) {
				q.add(parray[i]);
				pf++;
			}
			else if(q.size() < f &&q.contains(parray[i])) {}
			else if(q.size() >= f && q.contains(parray[i])) {}
			else if(q.size() >= f && !q.contains(parray[i])) {
				int dist[] = new int[f];
				int max=0;
				for(int j=0;j<f;j++) {
					dist[j] = 999;
				}
				for(int j=i+1;j<p;j++) {
//					System.out.println("hi");
					for(int w = 0;w<f;w++) {
						if(q.get(w) == parray[j]) {
							if(j< dist[w]) {
								dist[w]=j-i;
							}
						}
					}
				}
				for(int j=0;j<f;j++) {
					if(dist[j]>=max) {
						max = j;
					}
				}
				q.remove(q.get(max));
				q.add(parray[i]);
				pf++;
			}
			System.out.println(q.toString());
		}
		pf-=1;
		System.out.println("Page faults = "+pf);
		}
	}


