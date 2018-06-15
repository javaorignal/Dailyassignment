import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//6. Write a program to search a word inside a string.
		System.out.println("Please Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println("Please Enter Find Out String : ");
		//Scanner sc1 = new Scanner(System.in);
		String str1 = sc.next();
		sc.close();
		//ssc.close();
		System.out.println(str.contains(str1));

	}

}
