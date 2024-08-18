import java.util.*;
public class sumOfRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		int sum = 0;
		for(int i = a; i<=b; i++){
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}
}

//Using formula
import java.util.*;
public class sumOfRange{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		System.out.println("The sum is : "+ (b*(b+1)/2)-(a*(a+1)/2 + a);
	}
}