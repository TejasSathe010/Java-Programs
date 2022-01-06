import java.util.Scanner;

class LLU{
	Scanner sc = new Scanner(System.in);
	int size,frame;
	int flag = 0,flag1 = 0,pf = 0;
	int[] Frames,Pages,Present;
	LLU( int n, int p){
		size = p;
		frame = n;
		Frames = new int[frame];
		Pages = new int[size];
		Present = new int[frame];
		for(int i = 0; i < frame; i++) {
			Frames[i] = -1;
		}
	}
	
	void get() {
		System.out.println("Enter Pages ..??");
		for(int i = 0; i < size; i++) {
			Pages[i] = sc.nextInt();
		}
	}
	
	void LRU() {
		for(int i = 0; i < size; i++) {
			if(i < frame) {
				Frames[i] = Pages[i];
				pf++;
				for(int j=0;j<frame;j++){
					System.out.print(Frames[j]+"   ");
					System.out.println();
				}
			}else {
				if(Check(Pages[i]) == -1) {
					int r = replace(i);
					Frames[r] = Pages[i];
					pf++;
					for(int j=0;j<frame;j++){
						System.out.print(Frames[j]+"   ");
						System.out.println();
					}
					
				}else {
					for(int j=0;j<frame;j++){
						System.out.print(Frames[j]+"   ");
						System.out.println();
					}
				}
			}
		}
	}

	
	private int replace(int x) {
		// TODO Auto-generated method stub
		int i;
		for( i=0;i<frame;i++){
			Present[i]=0;
		}
		flag1=0;
		for( i=x-1;i>=0;i--){
			if(Check(Pages[i])>=0){
				flag1++;
				Present[Check(Pages[i])]=1;
			}
			if(flag1==(size-1)){
				break;
			}
		}
		for(i=0;i<size;i++)
			if(Present[i]==0)
			{
				flag1=i;
				break;
			}
		return flag1;
	}

	private int Check(int i) {
		// TODO Auto-generated method stub
		flag = -1;
		for(int j = 0; j < frame; j++) {
			if(Frames[j] == i) {
				flag = i;
			}
		}
		return flag;
	}
	
	
}
public class DemoLLU {
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Frame Size..??");
		int n = sc.nextInt();
		System.out.println("Enter Page Size..??");
		int p = sc.nextInt();
		
		LLU llu = new LLU(n,p);
		llu.get();
		llu.LRU();
	}
}
