package SecondTerm.InheritanceLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Package Lab
What I learned:
************************************************/
public class InsuredPackage extends Package 
{
   private double insuranceCost;
   
   public InsuredPackage(int weight, char shippingMethod)
   {
      super(weight, shippingMethod);
      calculateInsuranceCost();
      calculateInsuredCost();
   }
   
   public void calculateInsuranceCost()
   {
      if (getCost() >= 0 && getCost() <= 1.00)
      {
         insuranceCost = 2.45;
      } else if (this.getCost() >= 1.01 && getCost() <= 3.00) {
         insuranceCost = 3.95;
      } else {
         insuranceCost = 5.55;
      }
   }
   
   public void calculateInsuredCost()
   {
      setCost(insuranceCost + getCost());
   }
   
   public String toString()
   {
      return super.toString();
   }
}