package SecondTerm.InheritanceLabs;

public class ExtraChargeOrder extends Order
{
   static double shippingAndHandlingCharge = 4.00;
   
   public ExtraChargeOrder(String name, int number, int quantityOrdered, double unitPrice)
   {
      super (name, number, quantityOrdered, unitPrice);
   } //ExtraChargeOrder
   
   public double computePrice()
   {
      return getQuantityOrdered() * getPrice() + shippingAndHandlingCharge;
   } //computePrice
      
   public String toString()
   {
      return super.toString();
   } //toString
} //ExtraChargeOrder