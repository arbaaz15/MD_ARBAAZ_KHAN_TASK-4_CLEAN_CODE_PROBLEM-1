package MD_ARBAAZ_KHAN.Task_4_CLEAR_CODE;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	
    	@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
    	int time;
    	double interest_rate,principal;
    	
    	
    	System.out.println("Enter the Principal amount");
		principal=sc.nextDouble();
		System.out.println("Enter the Rate of Interest");
		interest_rate=sc.nextDouble();
		System.out.println("Enter the Time period");
	    time=sc.nextInt();
	    
	    
	    
    	simple_and_compount_interest ob = new simple_and_compount_interest();
    	
   
    	
    	
    	double Simple_interest_result = ob.Simple_Interest(time,principal,interest_rate);
    	System.out.println("The Simple Interest =        "+ Simple_interest_result);
    	
    	
    	double Compound_interest_result = ob.Compound_Interest(time,principal,interest_rate);
    	System.out.println("The Simple Interest =        "+ Compound_interest_result);
    	
     }

}    
