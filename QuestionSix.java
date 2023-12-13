package Programs;
import java.util.*;
public class QuestionSix {

	public static void main(String[] args) {
		System.out.println("Enter the number of seconds : ");
		Scanner obj = new Scanner (System.in);
		double t = obj.nextDouble();
		double d = (1/2.0)*32.174* Math.pow(t, 2);
		System.out.println("Distance travelled : " + d);

	}

}
