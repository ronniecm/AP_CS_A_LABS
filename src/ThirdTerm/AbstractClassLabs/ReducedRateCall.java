package ThirdTerm.AbstractClassLabs;

public class ReducedRateCall extends LongDistanceCall
{
   private double rate;
   
   public ReducedRateCall(int duration)
   {
      super(duration);
      rate = 3.0;
   }
   
   public double getRate()
   {
      return rate;
   }
   
   public String toString()
   {
      return super.toString() + 
             "\tLDRR";
   }
   
   public static void main(String[] args)
   {
      PhoneCall []  calls = new PhoneCall [4]; 
      calls[0] =  new LocalCall (10, 2);   // 10 minutes, rate = 2  
      calls[1] =  new LongDistanceCall (3); 
      calls[2] = new  ReducedRateCall (8);
      for  (PhoneCall  call :  calls)
         System.out.println (call); 
   }
}