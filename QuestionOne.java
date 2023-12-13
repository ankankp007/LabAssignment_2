package Programs;
import java.util.*;

public class QuestionOne {

	public static void main(String[] args) {
		System.out.println("Enter a degree in Fahrenheit : ");
	     Scanner obj = new Scanner(System.in);
	     int f = obj.nextInt();
	     double Celsius = (f-32)*5.0/9;
	     System.out.println( f + " is " + Celsius + "Celsius");

	}

}
