package SecondTerm.InheritanceLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Package Lab
What I learned:
************************************************/
import java.text.*;

public class Package
{
   private int weight;
   private char shippingMethod;
   private double shippingCost;
   
   public Package(int weight, char shippingMethod)
   {
      this.weight = weight;
      this.shippingMethod = shippingMethod;
      calculateCost();
   }
   
   public void calculateCost()
   {
      if (this.weight >= 1 && this.weight <= 8) {
         if (this.shippingMethod == 'A') {
            this.shippingCost = 2.00;
         } else if (this.shippingMethod == 'T') {
            this.shippingCost = 1.50;
         } else if (this.shippingMethod == 'M') {
            this.shippingCost = 0.50;
         } else {
            System.out.println("Not a valid shipping method");
         }
      } else if (this.weight >= 9 && this.weight <= 16) {
         if (this.shippingMethod == 'A') {
            this.shippingCost = 3.00;
         } else if (this.shippingMethod == 'T') {
            this.shippingCost = 2.35;
         } else if (this.shippingMethod == 'M') {
            this.shippingCost = 1.50;
         } else {
            System.out.println("Not a valid shipping method");
         }
      } else {
         if (this.shippingMethod == 'A') {
            this.shippingCost = 4.50;
         } else if (this.shippingMethod == 'T') {
            this.shippingCost = 3.25;
         } else if (this.shippingMethod == 'M') {
            this.shippingCost = 2.15;
         } else {
            System.out.println("Not a valid shipping method");
         }
      }
   }
   
   public double getCost()
   {
      return this.shippingCost;
   }
   
   public void setCost(double c)
   {
      this.shippingCost = c;
   }
   public String translateMethod()
   {
      if (this.shippingMethod == 'A') {
         return "Air";
      } else if (this.shippingMethod == 'T') {
         return "Truck";
      } else if (this.shippingMethod == 'M') {
         return "Mail";
      } else {
         return "No shipping method";
      }      
   }
   
   public String toString()
   {
      DecimalFormat d = new DecimalFormat("0.00");
      return "\nPackage: " +
             "\nWeight (ounces): " + this.weight + 
             "\nShipping Method: " + translateMethod() +
             "\nShipping Cost: $" + d.format(this.shippingCost);
   }
}
