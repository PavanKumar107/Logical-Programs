import java.util.Random;
import java.util.Scanner;

public class Couponnumbers {
	public static void main(String[] args) {
		Scanner inp=new Scanner(System.in);
		Couponnumbers rv = new Couponnumbers();
		System.out.println("Enter The Value of N For N Distinct Coupon Number");
		int number=inp.nextInt();
		rv.couponGenerator(number);
		}
	
	void couponGenerator(int number) {
		int randomCouponNumber;
		int index=0;
		int[] duplicateArray=new int[number];
		int[] distinctArray=new int[number];
		int previousCouponNumber;
		Random ran=new Random();
		
		for(int i=0;i<number;i++) {
			duplicateArray[i]=ran.nextInt(99999);
			}
		 for (int i = 0; i < duplicateArray.length; i++)   
	     {   
	         int flag = 0;  
	         //innermost loop to make comparison between elements and skip duplicate elements  
	         for (int j = 0; j < i; j++){  
	             if (duplicateArray[i] == duplicateArray[j]){   
	                 flag = 1;  
	                 break;   
	             }  
	         }  
	         if(flag==0) {
	        	 distinctArray[index]=duplicateArray[i];
	        	 index++;
	     }


		 }
		 System.out.println("Distinct coupon Numbers are");
		  for(int i = 0; i < index; i++)  
	          System.out.print("  "+ distinctArray[i] );   
		}
}
