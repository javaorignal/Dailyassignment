import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Number :");
		int  k= sc.nextInt();
		
		for(int i=0;i<=k;i++) {
			System.out.println("Print Number :"+i);
		}
		
	}

}
