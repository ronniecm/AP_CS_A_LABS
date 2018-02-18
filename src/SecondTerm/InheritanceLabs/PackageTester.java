package SecondTerm.InheritanceLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 3 - Package Lab
What I learned:
************************************************/
public class PackageTester
{
   public static void main(String[] args)
   {
      Package light = new Package(5, 'A');
      Package heavy = new Package(20, 'M');
      
      System.out.println(light);
      System.out.println(heavy);
      
      InsuredPackage lightInsured = new InsuredPackage(5, 'A');
      InsuredPackage heavyInsured = new InsuredPackage(20, 'M');
      
      System.out.println(lightInsured);
      System.out.println(heavyInsured);
   }
}