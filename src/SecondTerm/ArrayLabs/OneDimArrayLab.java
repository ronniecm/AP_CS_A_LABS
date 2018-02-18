package SecondTerm.ArrayLabs;

/************************************************
Name: Ronnie Mohapatra
Lab: Lab 1 - Finding Sum, Average, Min and Max Lab
What I learned: a) For loops are very helpful for
                   processing arrays
                b) When searching for the max or
                   min, start with the first
                   element in the array
                c) When searching for negative
                   odd number use i % 2 == -1
************************************************/
public class OneDimArrayLab
{
   public static void main(String[] args)
   {
      int [] array = {15, -5, 25, 75, 9, -2, -80, -100, 99, 21, 23, 40, 45, 67,
                       100, 44, 28, 1, 3};
                       
      System.out.println("Max: " + findMax(array));
      
      System.out.println("Min: " + findMin(array));
      System.out.println("Index of Max: " + findMaxIndex(array));
      System.out.println("Index of Min: " + findMinIndex(array));
      
      System.out.println("Is 3 in the list: " + find(array, 3));
      
      System.out.print("Positive Numbers: ");
      printArray(posArray(array));
      
      System.out.print("Negative Numbers: ");
      printArray(negArray(array));
      
      System.out.print("Even Numbers: ");
      printArray(evenMembers(array));
      
      System.out.print("Odd Numbers: ");
      printArray(oddMembers(array));
     
      
      System.out.println("Sum: " + sum(array));
      System.out.println("Avg: " + average(array));
   } // main
   
   public static int findMax(int [] a)
   {
      int max = a[0];
      for (int i : a)
      {
         if (i > max)
            max = i;
         else 
            max = max;
      } //for
      return max;
   } //findMax
   
   public static int findMin(int [] a)
   {
      int min = a[0];
      for (int i : a)
      {
         if (i < min)
            min = i;
         else
            min = min;
      } //for
      
      return min;
   } //findMin
   
   public static int findMaxIndex(int [] a)
   {
      int max = findMax(a);
      
      for (int i = 0; i<a.length; i++)
      {
         if (a[i] == max)
            return i;
      } //for
      
      return 0;
   } //findMaxIndex
   
   public static int findMinIndex(int [] a)
   {
      int min = findMin(a);
      
      for (int i = 0; i<a.length; i++)
      {
         if (a[i] == min)
            return i;
      } //for
      
      return 0;
   } //findMinIndex
   
   public static boolean find (int[] a, int target)
   {
      int count = 0;
      
      for (int i : a)
      {
         if(i == target)
            count++;
      } //for
      
      return count > 0;
   } //find
   
   public static int[] posArray(int[] a)
   {
      int arrayLength = 0;
      for (int i : a)
      {
         if (i > 0)
            arrayLength++;
      } //for
      
      int[] pos = new int[arrayLength];
      int tracker = 0;
      for (int j = 0; j<a.length; j++)
      {
         if (a[j] > 0) {
            pos[tracker] = a[j];
            tracker++;
         } //if
      } //for
      
      return pos;
   } //posArray
   
   public static int [] negArray(int[] a)
   {
      int arrayLength = 0;
      for (int i : a)
      {
         if (i < 0)
            arrayLength++;
      } //for
      
      int[] neg = new int[arrayLength];
      int tracker = 0;
      for (int j = 0; j<a.length; j++)
      {
         if (a[j] < 0) {
            neg[tracker] = a[j];
            tracker++;
         } //if
      } //for
      
      return neg;
   } //negArray
   
   public static int sum(int [] a)
   {
      int sum = 0;
      
      for (int i : a)
         sum += i;
      
      return sum;
   } //sum
   
   public static double average(int [] a)
   {
      return (double)(sum(a)/a.length);
   } //average
   
   public static int [] evenMembers(int[] a)
   {
      int arrayLength = 0;
      for (int i : a)
      {
         if (i % 2 == 0)
            arrayLength++;
      } //for
      
      int[] even = new int[arrayLength];
      int tracker = 0;
      for (int j = 0; j<a.length; j++)
      {
         if (a[j] % 2 == 0) {
            even[tracker] = a[j];
            tracker++;
         } //if
      } //for
      
      return even;
   } //evenMembers
   
   public static int [] oddMembers(int[] a)
   {
      int arrayLength = 0;
      for (int i : a)
      {
         if (i % 2 == 1 || i % 2 == -1)
            arrayLength++;
      } //for
      
      int[] odd = new int[arrayLength];
      int tracker = 0;
      for (int j = 0; j<a.length; j++)
      {
         if (a[j] % 2 == 1 || a[j] % 2 == -1) {
            odd[tracker] = a[j];
            tracker++;
         } //if
      } //for
      
      return odd;
   } //oddMembers

   
   public static void printArray(int [] a)
   {
      for (int i = 0; i<a.length; i++)
      {  
         if (i == a.length - 1)
            System.out.println(a[i]);
         else
            System.out.print(a[i] + ", ");
      } //for
   } //printArray
 } //OneDimArrayLab
 
 /* Output
 
  ----jGRASP exec: java OneDimArrayLab
 Max: 100
 Min: -100
 Index of Max: 14
 Index of Min: 7
 Is 3 in the list: true 
 Positive Numbers: 15, 25, 75, 9, 99, 21, 23, 40, 45, 67, 100, 44, 28, 1, 3
 Negative Numbers: -5, -2, -80, -100
 Even Numbers: -2, -80, -100, 40, 100, 44, 28
 Odd Numbers: 15, -5, 25, 75, 9, 99, 21, 23, 45, 67, 1, 3
 Sum: 408
 Avg: 21.0
 
  ----jGRASP: operation complete.
 */