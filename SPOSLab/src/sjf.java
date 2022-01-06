import java.util.*;
import java.io.*;
class schedule{
	int [] pid,pid1,pt,pt1,at,at1,ft,tt,wt;
	Scanner sc=new Scanner(System.in);     	
	int n;
	void assign(int n){
		this.n=n;
		pid=new int[n];
		pid1=new int[n];
		pt=new int[n];
		pt1=new int[n];
		at=new int[n];
		at1=new int[n];
		ft=new int[n];
		tt=new int[n];
		wt=new int[n];
	}	

	void input(int n){
		for(int i=0;i<n;i++){
			pid[i]=i+1;
		    System.out.println("Enter arrival time..");			
			at[i]=sc.nextInt();			
		    System.out.println("Enter processing time..");			
			pt[i]=sc.nextInt();			
		}
	}

	void assign1(int n){
		for(int i=0;i<n;i++){
			pid1[i]=pid[i];
			at1[i]=at[i];
			pt1[i]=pt[i];
		}
	}
	
	void sjf1(int n){
		int size=0,pos=0;
		for(int i=0;i<n;i++){
			size+=pt[i];
		}
	       System.out.println(size);

		
		for(int j=0;j<size;j++){
			pos=search_min(n,j);
			pt1[pos]=pt1[pos]-1;
			if(pt1[pos]==0){
				ft[pos]=j+1;
				tt[pos]=ft[pos]-at1[pos];
				wt[pos]=tt[pos]-pt[pos];
			}
		}

		for(int j=0;j<n;j++){
       System.out.println(pid[j]+"\t"+at[j]+"\t"+pt[j]+"\t"+ft[j]+"\t"+tt[j]+"\t"+wt[j]+"\n");

		}
	}
	
	int search_min(int n,int t){
		int pos=0,min=100;
		for(int i=0;i<n;i++){
			if((pt1[i]<min) && (pt1[i]!=0) && (t>=at[i])){
				min=pt1[i];
				pos =i;
			}
		}
		return pos;
	}
}

class sjf{
public static void main(String args[]){
    schedule s = new schedule();
	Scanner sc1=new Scanner(System.in);     
	int n;
    System.out.println("Enter no of processes..");
    n=sc1.nextInt();
	s.assign(n);
    s.input(n);
	s.assign1(n);
	s.sjf1(n);
	

}
}
