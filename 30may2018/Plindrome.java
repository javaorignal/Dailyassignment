import java.util.Scanner;
public class Plindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
				System.out.println("Enter string to reverse:");
				
				Scanner read = new Scanner(System.in);
				String str = read.nextLine();
				String reverse = "";
				
				
				for(int i = str.length()-1; i >= 0; i--)
				{
					reverse = reverse + str.charAt(i);
				}
				
				if(str.equals(reverse))
				{
					System.out.println("Plindrome");
				
				}
				else
				{
					System.out.println("Not Plindrome");
				}
				
			}
	}

	
