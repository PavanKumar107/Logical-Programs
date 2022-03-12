import java.util.Scanner;
public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Fibonacciseries rv=new Fibonacciseries();
		System.out.println("Enter the Value");
		int number=inp.nextInt();
		rv.fabonacci(number);
	}
	void fabonacci(int number) {
		int number1=0;
		int number2=1;
		int number3;
		System.out.print(" "+number1+ " "+number2);
		for(int i=0;i<number;i++) {
			number3=number1+number2;
			System.out.print(" "+number3);
			number1=number2;
			number2=number3;
		}
	}
}
