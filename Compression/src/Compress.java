import java.util.*;
public class Compress{
	public static void main(String args[]){

		Scanner scan=new Scanner(System.in);
		String originalString = scan.nextLine();
		int number = scan.nextInt();
		
		if(args[0].equals("-c"))
		{
			System.out.println("compress");
            compress(originalString);
		}
	
		else if(args[0].equals("-d"))
		{
			System.out.println("decompress");
            decompress(originalString);
		}
		else{System.out.println("Compress program by Kelsey Faram");
		System.out.println("usage: java Compress [-c,-d] < inputFile > outputFile");
		}
	}
	
	
	public static void compress(String originalString)
	{
		int count = 0;
		char comp = originalString.charAt(0);
		for(int i=0; i < originalString.length(); i++){
		originalString.charAt(i);
		
		if(comp==originalString.charAt(i))
		count++;
		else{
			System.out.print(comp+""+count);
			comp=originalString.charAt(i); count=1;
		}	
		} System.out.println(comp+""+count);
	}
	
	public static void decompress(String originalString)
    {
		
	}
	
	
}