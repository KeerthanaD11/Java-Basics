import java.util.*;
public class sumofNnumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int a = sc.nextInt();
		int sum = 0 ;
		for(int i = 1; i<=a;i++){
			sum+=i;
		}
		System.out.println("Sum: "+sum);
	}
}

//Using Formula
import java.util.*;
public class sumofNnumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int a = sc.nextInt();
		System.out.println(n*(n+1)/2);
	}
}