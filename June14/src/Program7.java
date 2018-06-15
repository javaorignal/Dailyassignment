import java.util.*;
public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a program to split a string into a number of substrings
	
		
		
		
		System.out.println("Please Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String str = "shubham singh is my name ";
		int length = str.length()/n;//0-
		for(int i = 0; i < n; i++){  
			System.out.println(str.substring(i*length, ((i+1)*length)));
		}
	}

}
