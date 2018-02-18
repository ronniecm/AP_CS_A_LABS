package ThirdTerm.AbstractClassLabs;

public abstract class PhoneCall
{
   private int durationInMinutes;
   
   public PhoneCall(int duration)
   {
      durationInMinutes = duration;
   }
   
   public int getDuration()
   {
      return durationInMinutes;
   }
   
   public abstract double getRate();
   
   private int calculateTotalCost()
   {
      return (int)(durationInMinutes * getRate());
   }
   
   public String toString()
   {
      return "Duration " + durationInMinutes +
             "\tRate " + getRate() +
             "\tTotal " + calculateTotalCost();
   }
   
   
}