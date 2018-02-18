package ThirdTerm.AbstractClassLabs;

public class LocalCall extends PhoneCall
{
   private double rate;
   
   public LocalCall(int duration, double rate)
   {
      super(duration);
      this.rate = rate;
   }
   
   public double getRate()
   {
      return this.rate;
   }
   
   public String toString()
   {
      return super.toString() + "\tLC";
   }
   
   public static void main(String[] args)
   {
      PhoneCall hi = new LongDistanceCall(10);
      System.out.println(hi);
      PhoneCall local = new LocalCall(10, 2);
      System.out.println(local);
   }
}