import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find minimum of three input numbers without using conditional statements
		System.out.print("Please Enter First Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("Please Enter Second Number : ");
		int num2 = sc.nextInt();
		System.out.print("Please Enter Second Number : ");
		int num3 = sc.nextInt();
		sc.close();
		System.out.println("Minimum is : " + Math.min(num, min(num2, num3)));
		// i am not clear 
		
	}

}
