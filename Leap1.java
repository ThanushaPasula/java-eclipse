package Demo;

import java.util.Scanner;

public class Leap1 {
 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter the number of years to check: ");
	        int n = sc.nextInt();  // Number of years to check
	        
	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter year " + (i + 1) + ": ");
	            int year = sc.nextInt();
	            
	            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
	                System.out.println(year + " is a Leap Year.");
	            } else {
	                System.out.println(year + " is not a Leap Year.");
	            }
	        }
	        
	        sc.close();
	    }
}
