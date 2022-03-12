import java.util.*;
public class Reverseanumber {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Reverseanumber rv=new Reverseanumber();
		System.out.println("Enter a Number-");
		int number=inp.nextInt();
		System.out.println("Reverse Number is "+rv.reverseIs(number));
		}
		int reverseIs(int number) {
			int rem;
			int reversenumber=0;
			while(number!=0) {
				rem=number%10;
				reversenumber=(reversenumber*10)+rem;
				number=number/10;
				}
			return reversenumber;
		} 	
}
