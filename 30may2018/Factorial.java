import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number :");
		int i = sc.nextInt();
		int j=1;
		while(i != 0)
		{
			j=i*j;
			i--;
	}
		System.out.println("Enter Number "+i+ " Factorial is : "+j);
}
}