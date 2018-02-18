package ThirdTerm.AbstractClassLabs;

public class LongDistanceCall extends PhoneCall
{
   private double rate;
   
   public LongDistanceCall(int duration)
   {
      super(duration);
      rate = 6.0;
   }
   
   public double getRate()
   {
      return rate;
   }
   
   public String toString()
   {
      return super.toString() + "\tLD";
   }
   
   public static void main(String[] args)
   {
      PhoneCall hi = new LongDistanceCall(10);
      System.out.print(hi);
   }
}