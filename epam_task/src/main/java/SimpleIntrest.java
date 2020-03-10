
public class SimpleIntrest
{
      double principal_amount;
      double rate_of_intrest,time;
      SimpleIntrest(double principal_amount,double  rate_of_intrest,double time  )
      {
    	  this.principal_amount=principal_amount;
    	  this.rate_of_intrest=rate_of_intrest;
    	  this.time=time;
      }
      double calculatesi()
      {
      double si=(principal_amount*time*rate_of_intrest)/100;
      return si;
      }
      double calculateci()
      {
          double compound_intrest= principal_amount*Math.pow((1+( rate_of_intrest/100)),time) -  principal_amount;
          return compound_intrest; 
      }
      
}
