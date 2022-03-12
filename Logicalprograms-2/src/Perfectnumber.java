import java.util.Scanner;

public class Perfectnumber {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Perfectnumber rv=new Perfectnumber();
		System.out.println("Enter the Number ");
		int number=inp.nextInt();
		rv.perfectNumber(number);
		}
	void perfectNumber(int number) {
		int divisor=0;
				for(int i=1;i<number;i++) {
					if(number%i==0) {
						divisor=divisor+i;
					}
				}
				if(divisor==number) {
					System.out.println("It is a Perect Number");
				}
				else {
					System.out.println("It is Not a Perfect NUmber");
				}
		}
}
