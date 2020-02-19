package MD_ARBAAZ_KHAN.Task_4_CLEAR_CODE;


public class simple_and_compount_interest {

	
	
	
	double Simple_Interest(int time,double principal,double interest_rate)
	{
		double simple_interest = (principal * time * interest_rate)/100;
		
		return simple_interest;
	}
	
	
	
	
	
     double Compound_Interest(int time,double principal,double interest_rate)
	{
		double compound_interest = principal * (Math.pow((1 + interest_rate / 100), time)) - principal ; 
      
           return compound_interest;
	}
	
	
	
}
