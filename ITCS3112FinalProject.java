
/**
 *  This ITIS3112FinalProject implements the funtionalities of as a budgeting financail program
    @author Quang Ho
    Date Mordified: 03/10/2020
 * @author QuangHo
 */
import java.util.Scanner;
public class ITCS3112FinalProject{
   public static void main (String[] args) {
      Scanner input = new Scanner(System.in); 
      Budget budget = new Budget();
      String ans = "";
      String choice = "";
      System.out.print("Do you want to start using this program? Enter yes or no: ");
      ans = input.nextLine().toLowerCase();
      if(ans.compareTo("yes") != 0){
         System.out.print("\nHave a nice day");
      }
      else {
         //start input information with income, personal information, planning budget, and first expense of a specific month
         System.out.print("\nFirst, please enter your income for this year(xxxxxx.00): ");
         
         double income = 0;
         //input validation
         if(input.hasNextDouble()) {
            income = input.nextDouble();
         }
         else {
            while(!input.hasNextDouble()) {
            System.out.println("Invalid income input!");
            System.out.print("\nPlease enter your income again for this year(xxxxxx.00): ");
            input.nextLine();//clear the buffer
            }
         }
                
         budget.setIncome(income);
         Person person = setPersonalInfo(input);
         System.out.println("\nPlease enter your planning budget for this year(Enter 0 for month choosen): ");
         Expenses plan = addAnExpense(budget, input);
         budget.setPlanningBudget(plan);//set the planning budget
         //add the first expense
         System.out.println("\nPlease enter your first expense: ");         
         Expenses firstExpense = addAnExpense(budget, input);
         budget.addExpense(firstExpense);
         input.nextLine();//clear the buffer
         System.out.println("-------------------------------------------------------");
         do {
   
         
            System.out.println("\nHere is your options to do with your budget program: ");
            System.out.println("-------------------------------------------------------");
   
            System.out.println("\tOption 1: Adding expenses(Enter letter a)");
            System.out.println("\tOption 2: Updating expenses(Enter letter u)");
            System.out.println("\tOption 3: Deleting expenses(Enter letter d)");
            System.out.println("\tOption 4: Viewing expenses and system calculations based on your data (Enter letter v)");
            System.out.println("\tOption 5: Viewing the personal information(Enter letter p)");
            System.out.println("\tOption 6: Set or get planning budget(Enter letter s)");
            System.out.println("\tOption 7: Quiting the program(Enter letter q)");
            System.out.println("-------------------------------------------------------");
   
            System.out.print("\nWhat option do you want. Enter a, u, d, v, p, or q : ");
            choice = input.nextLine();
            
            switch(choice.toLowerCase()) {
               case "a":
                  addExpenses(budget, input);
                  break;
               case "u":
                  displayAllExpenses(budget);
                  updateExpenses(budget, input);
                  break;  
               case "d":
                  displayAllExpenses(budget);
                  removeExpenses(budget, input);
                  break;
               case "v":
                  viewingBudget(budget, input);
                  break;
               case "p":
                  viewingPersonalInfo(person);
                  break; 
               case "s":
                  setAndGetPlanningBudget(budget, input);
                  break;      
               case "q":
                  System.out.println("Thank for using this personal budget program");
                  break;
               default:
               System.out.print("Invalid input. Please enter your choice again!");
               input.nextLine();//clear the buffer
               break;
            }
         }
         while(choice.toLowerCase().compareTo("q") != 0);  
       } 
     }

    /*
     This method set the personal information
    */
   public static Person setPersonalInfo(Scanner input){
      System.out.println("-------------------------------------------------------");
      System.out.println("\n\n*Please enter you personal information.");
      input.nextLine();//clear the buffer
      System.out.print("\tPlease enter your first name: ");
      String fname = input.nextLine();
      System.out.print("\tPlease enter your last name: ");
      String lname = input.nextLine();
      System.out.print("\tPlease enter your date of birth(mm/dd/yyyy): ");
      String dat = input.nextLine();
      System.out.print("\tPlease enter your phone number(704-xxx-xxxx): ");
      String pnum = input.nextLine();
      System.out.print("\tPlease enter your email(example@gmail.com): ");
      String email = input.nextLine();
      System.out.print("\tPlease enter your occupation: ");
      String occ = input.nextLine();
      System.out.println("\nThank for providing the personal information.");

      Person person = new Person(fname, lname, dat, pnum, email, occ);
      return person;
   };
    /*
     This method get the personal information
    */
   public static void viewingPersonalInfo(Person person){
      
           System.out.println(person.displayPerson());
   }
   /*
      This method adds a new expense
   */
  public static Expenses addAnExpense(Budget budget, Scanner input){
      System.out.println("-------------------------------------------------------");
      System.out.print("\n\nWhat month do you want to add(Choose from 1 to 12, or O for ALLYEAR Planning Budget): " );
      String month = "";
      //input validation
      if(input.hasNextInt()) {
            month = getMonth(input.nextInt());
      }
      else {
            while(!input.hasNextInt()) {
               System.out.println("Invalid month input!");
               System.out.print("\nPlease enter the month again: ");
               input.nextLine();//clear the buffer
               
            }
      }
      input.nextLine();//clear the buffer   
      System.out.print("\nHow much do you spend for the housing: " );
      double housing = 0;
      //input validation
      if(input.hasNextDouble()) {
            housing = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid housing input!");
               System.out.print("\nPlease enter your housing again: ");
               input.nextLine();//clear the buffer
               
            }
      }
      input.nextLine();//clear the buffer  
      System.out.print("\nHow much do you spend for the utilities: " );
      double utilities = 0;      //input validation
      if(input.hasNextDouble()) {
            utilities = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid utilities input!");
               System.out.print("\nPlease enter your utilities again: ");
               input.nextLine();//clear the buffer
            }   

      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the food: " );
      double food = 0;
      //input validation
      if(input.hasNextDouble()) {
            food = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid food input!");
               System.out.print("\nPlease enter your food again: ");
               input.nextLine();//clear the buffer
            }   

      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the transportation: " );
      double transportation = 0;
      //input validation
      if(input.hasNextDouble()) {
            transportation = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid transportation input!");
               System.out.print("\nPlease enter your transportation again: ");
               input.nextLine();//clear the buffer
            }   
      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the medical: " );
      double medical = 0;
      //input validation
      if(input.hasNextDouble()) {
            medical = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid medical input!");
               System.out.print("\nPlease enter your medical again: ");
               input.nextLine();//clear the buffer
            }
      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the insurance: " );
      double insurance = 0;
      //input validation
      if(input.hasNextDouble()) {
            insurance = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid insurance input!");
               System.out.print("\nPlease enter your insurance again: ");
               input.nextLine();//clear the buffer
            }
      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the clothing: " );
      double clothing = 0;
      //input validation
      if(input.hasNextDouble()) {
            clothing = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid clothing input!");
               System.out.print("\nPlease enter your clothing again: ");
               input.nextLine();//clear the buffer
            }
      }  
      input.nextLine();//clear the buffer
      System.out.print("\nHow much do you spend for the other thing: " );
      double other = 0;
      //input validation
      if(input.hasNextDouble()) {
            other = input.nextDouble();
      }
      else {
            while(!input.hasNextDouble()) {
               System.out.println("Invalid other input!");
               System.out.print("\nPlease enter your other again: ");
               input.nextLine();//clear the buffer
            }
      }  


      Expenses newExpense = new Expenses(month, housing, utilities, food, transportation, medical, insurance, clothing, other);
      return newExpense;
  }
   /*
      This method adds new expenses
   */
   public static void addExpenses(Budget budget, Scanner input){

      boolean cont = true;
      
      do {
         
         Expenses newExpense = addAnExpense(budget, input);
         System.out.println();
         input.nextLine();// clear the buffer
         System.out.print("\nDo you want to add this expense to your records? Enter yes or no: ");
         String ans = input.nextLine();
         if(ans.toLowerCase().compareTo("yes") == 0){
            if(budget.addExpense(newExpense)) {
               System.out.print("You successfully added this expense to your records.");
            };

         };
         System.out.println();
         System.out.print("\nDo you want to add another expense? Enter yes or no: ");
         ans = input.nextLine();
         if(ans.toLowerCase().compareTo("yes") != 0){
            cont = false;
         }
      }
      while(cont);
   }
   /*
      This method deletes a new expense
   */
   public static void removeExpenses(Budget budget, Scanner input) {
      boolean cont = true;
      do {
         System.out.println("-------------------------------------------------------");
         System.out.print("\n\nWhat index of the expense that you want to remove? ");
         int index = input.nextInt();
         if(budget.removeExpense(index)){
         System.out.println("\n* You successfully removed this expense to your records.");
         }
         System.out.println();
         input.nextLine();// clear the bufferdp
         System.out.print("\nDo you want to remove another expense? Enter yes or no: ");
         String ans = input.nextLine();
         if(ans.toLowerCase().compareTo("yes") != 0){
            cont = false;
         }
      }
      while(cont);
   }
   /*
      This method updates a new expense
   */
   public static void updateExpenses(Budget budget, Scanner input) {
      
      boolean cont = true;
      do {
         System.out.println("-------------------------------------------------------");
         System.out.print("\n\nWhat index of the expense that you want to update? ");
         int index = input.nextInt();
         //update the chozen expense
         Expenses newValue = addAnExpense(budget, input);
         if(budget.updateExpense(index, newValue)){
            System.out.print("\n* You successfully updated this expense from your records.");
         }
         input.nextLine();// clear the bufferd
         System.out.print("\nDo you want to update another expense? Enter yes or no: ");
         String ans = input.nextLine();
         if(ans.toLowerCase().compareTo("yes") != 0){
            cont = false;
         }
      }
      while(cont);
      
   }
   /*
      This method display an expense as chosen
   */
   public static void displayAnExpense(Budget budget, Scanner input) {
      System.out.println("-------------------------------------------------------");
      System.out.print("\n\nWhat index of the expense do you want to see?  ");
      int index = input.nextInt();
      Expenses seeExpense = budget.getExpense(index);
      System.out.println("\n* Your interesting expense details: ");
      System.out.println(seeExpense.displayExpense());
   }
   /*
      This method display an expense as chosen
   */
   public static void displayAllExpenses(Budget budget) {
      System.out.println(budget.budget_display());
   }
    /*
      This method handles the choosing letter v
   */
   public static void viewingBudget(Budget budget, Scanner input) {
     String choice = "";
     do {
         System.out.println("-------------------------------------------------------");
         System.out.println("\n\nAll options that you could view: ");
         System.out.println("\tOption A: Viewing A Monthly Expense(Enter letter A)");
         System.out.println("\tOption B: Viewing Your Planning Budget(Enter letter B)");
         System.out.println("\tOption C: Viewing Entire Expenses(Enter letter C)");
         System.out.println("\tOption D: Viewing Your All Calculation in The Budget(Enter letter D)");
         System.out.println("\tOption Q: Quiting the view operation");
         System.out.print("What do you want to view: ");
         choice = input.nextLine().toUpperCase();
         switch(choice.toUpperCase()) {
               case "A":
                  displayAllExpenses(budget);
                  displayAnExpense(budget, input);
                  break;
               case "B":
                  System.out.println(budget.getPlanningBudget().displayExpense());
                  break;
               case "C":
                  displayAllExpenses(budget);
                  break;
               case "D":
                  System.out.println(budget.budget_calculation());
                  break;
               case "Q":
               System.out.println("You have finished view operations.");
                  break;
               default:
                  System.out.println("Invalid input for your choice. Choose another option: ");
                  break;
         }
      }
      while(choice.compareTo("Q") != 0);

   
   }
   public static String getMonth(int num) {
      String str = "";
      switch(num) {
         case 0:
            str = "ALLYEAR";
            break;
         case 1:
            str = "JANUARY";
            break;
         case 2:
            str = "FEBRUARY";
            break;
         case 3:
            str = "MARCH";
            break;
         case 4:
            str = "APRIL";
            break;
         case 5:
            str = "MAY";
            break;
         case 6:
            str = "JUNE";
            break;
         case 7:
            str = "JULY";
            break;
         case 8:
            str = "AUGUST";
            break;
         case 9:
            str = "SEPTEMBER";
            break;
         case 10:
            str = "OCTOBER";
            break;
         case 11:
            str = "NOVEMBER";
            break;   
         case 12:
            str = "DECEMBER";
            break;
         default:
            str = "Invalid input for the month.";
            break;

      }
      return str;
   }
   public static void setAndGetPlanningBudget(Budget budget, Scanner input){
      Expenses newExp = null;
      System.out.println("-------------------------------------------------------");
      System.out.println("For Planning Budget");
      System.out.println("\tTo set it(enter s).");
      System.out.println("\tTo get it(enter g).");
      System.out.print("Your choice: ");
      String choice = input.nextLine();
      switch(choice) {
         case "s":
            System.out.println("Please enter your planning budget as following fields:");
            newExp = addAnExpense(budget, input);
            budget.setPlanningBudget(newExp);
            break;
         case "g":
            newExp = budget.getPlanningBudget();
            break;
         default:
            System.out.println("Your input is invalid!");
            break;
               
      }
      if(newExp != null) {
         System.out.println("Here is your planning budget: ");
         System.out.println(newExp.displayExpense());
      } 
   }              
}
   