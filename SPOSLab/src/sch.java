import java.io.*;
import java.util.*;

class sch
{
	static int pid[]=new int[10];
	static int at[]=new int[10];
	static int bt[]=new int[10];
	static int pt[]=new int[10];
	static Scanner sc = new Scanner(System.in);


	int pid1[]=new int[10];
	int at1[]=new int[10];
	int bt1[]=new int[10];

	int ct[]=new int[10];
	int tt[]=new int[10];
	int wt[]=new int[10];
	private int k;

	void input1(int n)
	{

		for(int i=0;i<n;i++)
		{
			pid[i]=i;
			System.out.println("Enter arrival time of "+i +" process");
			at[i]=sc.nextInt();
			System.out.println("Enter burst time of "+i +" process");
			bt[i]=sc.nextInt();
		}


	}

	///////////////////////////////////////////////////////////////////////////
	void assign1(int n)
	{
		for(int j=0;j<n;j++)
		{
			pid1[j]=pid[j];
			at1[j]=at[j];
			bt1[j]=bt[j];
		}
	}
	//////////////////////////////////////////////////////////////////

	void get_priority(int n)
	{
		System.out.println("Enter priority of processes...");
		for(int i=0;i<n;i++)
		{
			pt[i]=sc.nextInt();
		}
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////

	void sort1(int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(at1[j]>at1[j+1])
				{
					temp=bt1[j];
					bt1[j]=bt1[j+1];
					bt1[j+1]=temp;

					temp=at1[j];
					at1[j]=at[j+1];
					at1[j+1]=temp;

					temp=pid1[j];
					pid1[j]=pid1[j+1];
					pid1[j+1]=temp;
				}
			}
		}

	}

	//////////////////////////////////////////////////////////////////////////////////

	void sort2(int n)
	{
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(pt[j]>pt[j+1])
				{
					temp=pt[j];
					pt[j]=pt[j+1];
					pt[j+1]=temp;

					temp=bt1[j];
					bt1[j]=bt1[j+1];
					bt1[j+1]=temp;

					temp=at1[j];
					at1[j]=at[j+1];
					at1[j+1]=temp;

					temp=pid1[j];
					pid1[j]=pid1[j+1];
					pid1[j+1]=temp;
				}
			}
		}

	}

	/////////////////////////////////////////////////////////////////////////////////////////

	void fcfs(int n)
	{
		int k,t=at1[0];
		for(int i=0;i<n;i++)
		{

			ct[i]=t+bt1[i];
			tt[i]=ct[i]-at1[i];
			wt[i]=tt[i]-bt1[i];

			t=ct[i];
		}

		for(int j=0;j<n;j++)
		{
			System.out.println(pid1[j]+"\t"+at1[j]+"\t"+bt1[j]+"\t"+ct[j]+"\t"+tt[j]+"\t"+wt[j]+"\n");
		}

	}
	//////////////////////////////////////////////////////////////////////////////
	void priority_sch(int n)
	{
		int t=at1[0];
		for(int i=0;i<n;i++)
		{

			ct[i]=t+bt1[i];
			tt[i]=ct[i]-at1[i];
			wt[i]=tt[i]-bt1[i];
			t=ct[i];
		}

		for(int j=0;j<n;j++)
		{
			System.out.println(pid1[j]+"\t"+pt[j]+"\t"+at1[j]+"\t"+bt1[j]+"\t"+ct[j]+"\t"+tt[j]+"\t"+wt[j]+"\n");
		}
	}
	/////////////////////////////////////////////////////////////////////////////////
	int search_min(int n,int t)
	{
		int pos=0,min=100;
		for(int i=0;i<n;i++)
		{
			if((bt1[i]<min)&&(bt1[i]!=0)&&(t>=at1[i]))
			{
				min=bt1[i];
				pos=i;
			}
		}
		return pos;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	void sjf(int n)
	{
		int pos=0,size=0;
		for(int i=0;i<n;i++)
			size+=bt[i];

		for(int j=0;j<size;j++)
		{
			pos=search_min(n,j);
			//      System.out.println(pos+"\t");
			bt1[pos]=bt1[pos]-1;
			if(bt1[pos]==0)
			{
				ct[pos]=j+1;
				tt[pos]=ct[pos]-at1[pos];
				wt[pos]=tt[pos]-bt[pos];
			}
		}

		for(int j=0;j<n;j++)
		{
			System.out.println(pid[j]+"\t"+at[j]+"\t"+bt[j]+"\t"+ct[j]+"\t"+tt[j]+"\t"+wt[j]+"\n");
		}

	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	void round_robin(int n)
	{

		Queue<Integer> q = new LinkedList<>();
		int size=0;
		for(int i=0;i<n;i++)
			size+=bt[i];
		q.add(pid1[0]);
		int p=0,i,flag=0,flag1=0,k;
		while(p<size)
		{
			flag1=0;
			i=q.remove();
			System.out.print(i+" ");
			bt1[i]-=1;
			if(bt1[i]==0)
			{

				ct[i]=p+1;
				tt[i]=ct[i]-at1[i];
				wt[i]=tt[i]-bt[i];
				k=i+1;
				if(k==n)
					k=0;
				while(k!=i)
				{
					if(q.contains(k))
						flag1=1;                     //only show element is present in queue
					if(at1[k]<=ct[i]&&flag1==0&&bt1[k]!=0)
						q.add(k);             //if present then dont insert in queue

					if(k==n-1)
						k=0;
					else
						k++;

					flag1=0;
				}   
			}
			else
			{
				k=i+1;
				if(k==n)
					k=0;
				while(k!=i)
				{
					if(q.contains(k))
						flag1=1;                     //only show element is present in queue
					if(at1[k]<=(p+1)&&flag1==0&&bt1[k]!=0)
						q.add(k);             //if present then dont insert in queue

					if(k==n-1)
						k=0;
					else
						k++;
					flag1=0;
				} 
				q.add(i);   
			}


			p++;
		}
		System.out.println("");
		for(int j=0;j<n;j++)
		{
			System.out.println(pid[j]+"\t"+at[j]+"\t"+bt[j]+"\t"+ct[j]+"\t"+tt[j]+"\t"+wt[j]+"\n");
		}

	}

	/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
	public static void main(String args[])
	{
		sch s = new sch();
		int n,ch,cont;
		System.out.println("Enter no of processes..");
		n=sc.nextInt();
		s.input1(n);


		do{
			System.out.println("1.FCFS\n 2.PRIORITY\n 3.SJB\n 4.RR");
			System.out.println("Enter a choice..");
			ch=sc.nextInt();
			switch(ch){
			case 1:s.assign1(n);
			s.sort1(n);
			s.fcfs(n);
			break;
			case 2:s.assign1(n);
			s.get_priority(n);
			s.sort2(n);
			s.priority_sch(n);
			break;
			case 3:s.assign1(n);
			s.sjf(n);
			break;
			case 4://s.sort1(n);
			s.assign1(n);
			s.round_robin(n);
			break;
			default:System.out.println("Enter wrong choice...");
			break;
			}
			System.out.println("Do you want to continue...");
			cont=sc.nextInt();
		}while(cont==1);


	}
}


