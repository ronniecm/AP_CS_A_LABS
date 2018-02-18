package SecondTerm.InheritanceLabs;

public class OrderTester
{
   public static void main(String[] args)
   {
      Order smallOrder = new Order("Tom", 123, 20, 12.99);
      Order secondOrder = new Order("Tom", 123, 20, 12.99);
      ExtraChargeOrder largeOrder = new ExtraChargeOrder("John", 456, 1000, 25.99);
      
      System.out.println(smallOrder.computePrice());
      System.out.println(largeOrder.computePrice());
      
      System.out.println(smallOrder);
      System.out.println(largeOrder);
      
      System.out.println(smallOrder == secondOrder);
      System.out.println(smallOrder.equals(secondOrder));
   }//main
} //OrderTester

/*Output
 ----jGRASP exec: java OrderTester
 259.8
 25994.0
 
 Name: Tom
 Customer Number: 123
 Quantity Ordered: 20
 Unit Price: 12.99
 Total Price: $259.80
 
 Name: John
 Customer Number: 456
 Quantity Ordered: 1000
 Unit Price: 25.99
 Total Price: $25994.00
 false
 true
 
  ----jGRASP: operation complete.
 */