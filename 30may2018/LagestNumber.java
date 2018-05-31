import java.util.Scanner;

public class LagestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		int a = sc.nextInt();
		System.out.println("Please Enter second Number :");
		int b = sc.nextInt();
		System.out.println("Please Enter Third Number :");
		int c = sc.nextInt();
		if(a>b && a<c)
		{
		System.out.println("First Number is largest And Number is" +a);
	}else if(b>a && b>c)
	{
		System.out.println("Second Number is largest And Number is"+b);
		
	}else {
		System.out.println("Third Number is largest And Number is"+c);
	}

}
}
