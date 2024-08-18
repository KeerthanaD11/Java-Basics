import java.util.*;
public class greatestofTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		if(a>b){
			System.out.println(a+ " is greater");
		}
		else if(a==b){
			System.out.println("Both are equal");
		}
		else{
			System.out.println(b+ " is greater");
		}
	}
}

//inbuild method

import java.util.*;
public class greatestofTwo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = sc.nextInt();
		System.out.println("Enter second number: ");
		int b = sc.nextInt();
		if(a==b){
			System.out.println("Both are equal");
		}
		else{
			System.out.println(Math.max(a, b) + "is greater.");
		}
	}
}
