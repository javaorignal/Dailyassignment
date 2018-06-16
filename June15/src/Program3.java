import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find floor of a given number 
		System.out.print("Please Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(Math.floor(num));
		

	}

}
