import java.util.Scanner;
public class Primenumber {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Primenumber rv=new Primenumber();
		System.out.println("Enter a Number ");
		int number=inp.nextInt();
		rv.prime(number);
		}
	void prime(int number) {
		boolean primeNumber=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				primeNumber=false;
				break;
				}
		}
		if(primeNumber==true) {
			System.out.println("It is a prime Number");
		}
		else {
			System.out.println("It is not a prime Number");
		}
	}
}
