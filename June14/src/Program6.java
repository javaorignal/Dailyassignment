import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please Enter String : ");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		System.out.println("Please Enter Concatenate String : ");
		Scanner sc1 = new Scanner(System.in);
		String str2 = sc1.next();
		sc.close();
		sc1.close();
		System.out.println(str1.concat(str2));
		
		
				

	}

}
