import java.util.*;
public class primeNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		checkPrime(num);
	}
		private static void checkPrime(int num){
			int count = 0;
			if(num<=2){
				System.out.println(num+ " is not a prime number");
			}
			else{
				for(int i=1; i<=num; i++){
					if(num%i == 0){
						count++;
					}
				}
				if(count>=2){
					System.out.println(num+ " is not a prime number.");
				}
				else{
					System.out.println(num+ " is a prime number.");

				}
			}
		}
		
}
