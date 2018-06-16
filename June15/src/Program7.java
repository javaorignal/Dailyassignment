import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Ceiling Of"+num+" is  :"+Math.ceil(num));
		
	}

}
