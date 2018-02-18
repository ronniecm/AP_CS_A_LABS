package FirstTerm;

/********************************************************************************
Name: Ronnie Mohapatra
Period: 8
Name of the Lab: Lab 13
Due Date:
Date Submitted:
What I Learned: a) More controlled use of while loops
                b) Usage of a counter variable
**********************************************************************************/
public class DrugPotency
{
   public static void main(String[] args)
   {
      int count = 0; //counter variable for counting months
      double potency = 100.0; //inital potency
      
      //print initial potency
      System.out.println("month: " + count + "  effectiveness: " + potency);
      
      while(potency > 50) //while loop for decreasing potency
      {
         count++; //increase number of months each iteration
         potency = potency * 0.96; //formula for decreasing 4%
         if (potency < 50) {
            //printing for last amount
            System.out.println("month: "+ count+ "  effectiveness: " + potency + " DISCARDED");
         } else {
            System.out.println("month: " + count + "  effectiveness: " + potency); //printing for every other amount
         }
      }
   } //main
}//DrugPotency

/* Output

 ----jGRASP exec: java DrugPotency
 month: 0  effectiveness: 100.0
 month: 1  effectiveness: 96.0
 month: 2  effectiveness: 92.16
 month: 3  effectiveness: 88.47359999999999
 month: 4  effectiveness: 84.93465599999999
 month: 5  effectiveness: 81.53726975999999
 month: 6  effectiveness: 78.27577896959998
 month: 7  effectiveness: 75.14474781081599
 month: 8  effectiveness: 72.13895789838334
 month: 9  effectiveness: 69.253399582448
 month: 10  effectiveness: 66.48326359915008
 month: 11  effectiveness: 63.82393305518407
 month: 12  effectiveness: 61.27097573297671
 month: 13  effectiveness: 58.82013670365764
 month: 14  effectiveness: 56.46733123551133
 month: 15  effectiveness: 54.20863798609088
 month: 16  effectiveness: 52.04029246664724
 month: 17  effectiveness: 49.95868076798135 DISCARDED
 
  ----jGRASP: operation complete.
 
 */