import java.util.Scanner;

public class bankersme{
	int need[][],allocate[][],max[][],avail[][],np,nr;

	public void op(){
		Scanner sc=new Scanner(System.in);
		//INPUT
		System.out.println("Enter no of processes : ");		
		np=sc.nextInt();  	
		System.out.println("Enter no of resources : ");
		nr=sc.nextInt();

		need=new int[np][nr];
		allocate=new int[np][nr];
		max=new int[np][nr];
		avail=new int[1][nr];

		System.out.println("Enter allocation matrix : ");
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				allocate[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter max matrix : ");
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				max[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter avail matrix : ");
		for(int j=0;j<nr;j++){
			avail[0][j]=sc.nextInt();
		}


		//DISPLAY


		System.out.println("allocation matrix is: ");
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				System.out.print("\t"+allocate[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("max matrix is: ");
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				System.out.print("\t"+max[i][j]);
			}
			System.out.println("\n");
		}

		System.out.println("avail matrix is: ");
		for(int j=0;j<nr;j++){
			System.out.print("\t"+avail[0][j]);
		}
		System.out.print("\n");

		//need matrix 
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				need[i][j]=max[i][j]-allocate[i][j];
			}
		}

		System.out.println("need matrix is: ");
		for(int i=0;i<np;i++){
			for(int j=0;j<nr;j++){
				System.out.print("\t"+need[i][j]);
			}
			System.out.println("\n");
		}
		//
		//

		boolean done[]=new boolean[np];
		int j=0;
		while(j<np){
			boolean allocated=false;
			for(int i=0;i<np;i++){
				if(!done[i] && check(i)){
					for(int k=0;k<nr;k++){
						avail[0][k]=avail[0][k]+allocate[i][k];
					}
					System.out.println("Allocated process is : "+i);
					allocated=done[i]=true;
					j++;
				}
				if(allocated)
					break;
			}
		}
		if(j==np){
			System.out.println("All processes are safely allocated...");
		}
		else{
			System.out.println("Can not allocate process...");
		}
	}

	//
	//
	public boolean check(int i){
		for(int j=0;j<nr;j++){
			if(avail[0][j]<need[i][j]){
				return false;
			}
		}
		return true;	
	}		

	public static void main( String[] args ){
		new bankersme().op();
	}
}
