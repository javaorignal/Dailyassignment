import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to compare strings.
		System.out.println("Please Enter First String : ");
		Scanner sc = new Scanner(System.in);
		String firststring = sc.next();
		System.out.print("Please Enter second String : ");
		String secondstring = sc.next();
		sc.close();
		System.out.println(firststring.compareTo(secondstring));
		
		if(firststring.compareTo(secondstring) == 0)
		{
			System.out.println("String is equal ");
		}else {
			System.out.println("String is not equal");
		}
	}

}
