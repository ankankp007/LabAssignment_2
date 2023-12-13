package Programs;
import java.util.*;

public class QuestionFour {

	public static void main(String[] args) {
		System.out.println("Enter a number between o and 100 :");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int sum = 0 , r = 0;
		r= num%10;
		sum= sum+r;
		num = num/10;
		r= num%10;
		sum= sum+r;
		num = num/10;
		r= num%10;
		sum= sum+r;
		num = num/10;
		r= num%10;
		sum= sum+r;
		num = num/10;
		System.out.println("The num of the digits is = " + sum);
		
		
		

	}

}
