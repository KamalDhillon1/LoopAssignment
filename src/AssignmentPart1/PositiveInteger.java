package AssignmentPart1;

import java.util.Scanner;

public class PositiveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=7;
	int counter=0;
	 if(num>1) {
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
				 counter++;
		 }

		 if(counter==2) {
		 
			 System.out.println("Prime num");
		 }
	 else
	 {
		 System.out.println("not prime number");
	 }
	 }
	}
}
	
	
		






