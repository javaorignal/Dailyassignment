import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter First Number :");
		int i = sc.nextInt();
		System.out.println("Please Enter second Number :");
		int j = sc.nextInt();
		System.out.println("Please Enter Third Number :");
		int k = sc.nextInt();
		if(i<j && i<k)
		{
		System.out.println("First Number is smallest And Number is : " +i);
	}else if(j<i && j<k)
	{
		System.out.println("Second Number is smallest And Number is : "+j);
		
	}else {
		System.out.println("Third Number is smallest And Number is : "+k);
	}

	}

}
