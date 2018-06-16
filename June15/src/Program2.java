import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to find square root of a given number
		System.out.print("Please Enter Number : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println("Given Number "+num+" Square Root is : "+Math.sqrt(num));
	}

}
