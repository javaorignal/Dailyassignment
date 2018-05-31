import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		int i = sc.nextInt();
		System.out.println("Please Enter second Number :");
		int j = sc.nextInt();
		int temp;
		temp=i;
		i=j;
		j=temp;
		System.out.println("Swap Number: "+i + " " +j);
		
		
	}

}	
