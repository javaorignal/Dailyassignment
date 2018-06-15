import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4. Write a program to replace a substring inside a string by another one 
		System.out.println("Please Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Please Enter Which String replace : ");
		String str1 = sc.next();
		System.out.println("Please Enter which String into String: ");
		String str2 = sc.next();
		sc.close();
		System.out.println( str.replace(str1 ,str2 ) );
		

	}

}
