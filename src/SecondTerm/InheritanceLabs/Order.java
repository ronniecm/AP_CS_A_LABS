package SecondTerm.InheritanceLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 1 - Order Lab
What I learned:
************************************************/
import java.text.*;

public class Order
{
   private String name;
   private int number, quantityOrdered;
   private double unitPrice;
   
   public Order(String name, int number, int quantityOrdered, double unitPrice)
   {
      this.name = name;
      this.number = number;
      this.quantityOrdered = quantityOrdered;
      this.unitPrice = unitPrice;
   } //Order
   
   public String getName()
   {
      return this.name;
   } //getName
   
   public void setName(String n)
   {
      this.name = n;
   } //setName
   
   public int getNumber()
   {
      return this.number;
   } //getNumber
   
   public void setNumber(int n)
   {
      this.number = n;
   } //setNumber
   
   public int getQuantityOrdered()
   {
      return this.quantityOrdered;
   } //getQuantityOrdered
   
   public void setQuantityOrdered(int q)
   {
      this.quantityOrdered = q;
   } //setQuantityOrdered
   
   public double getPrice()
   {
      return this.unitPrice;
   } //getPrice
   
   public void setPrice(double p)
   {
      this.unitPrice = p;
   } //setPrice
   
   public double computePrice()
   {
      return this.quantityOrdered * this.unitPrice;
   } //computePrice
   
   public boolean equals(Order other)
   {
      return this.name.equals(other.name) &&
             this.number == other.number &&
             this.quantityOrdered == other.quantityOrdered &&
             this.unitPrice == other.unitPrice;
   } //equals
   
   public String toString()
   {
      DecimalFormat d = new DecimalFormat("0.00");
      return "\nName: " + this.name +
             "\nCustomer Number: " + this.number +
             "\nQuantity Ordered: " + this.quantityOrdered +
             "\nUnit Price: " + this.unitPrice +
             "\nTotal Price: $" + d.format(this.computePrice());
   } //toString
} //Order