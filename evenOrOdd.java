import java.util.*;
public class evenOrOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		if(a%2 == 0){
			System.out.println("Even");
		}
		else{
			System.out.println("Odd");
		}
	}
}

//Using ternary operator
import java.util.*;
public class evenOrOdd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		String result = a%2 ==0? ' is Even': ' is Odd';
		System.out.println(a + result);
	}
}
