import java.util.*;
public class positiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a<0){
			System.out.println("The number is negative");
		}
		else if(a>0){
			System.out.println("The number is positive");
		}
		else{
			System.out.println("The number is zero");
		}
	}
}

//using ternary operator
import java.util.*;
public class positiveNegative{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a==0){
			System.out.println("The number is zero");
		}
		else{
			String result = a>0? 'The number is positive' : 'The number is negative';
			System.out.println(result);
		}
	}
}

