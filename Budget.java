/*
 * This file is used to create a budget class holds the personal income and expenses 
 and its functionalities to fit the intended program
 * Date Modified: Sep 12, 2022
 * @author QuangHo
*/

import java.util.ArrayList;
class Budget{
   
   private double income;// to holds the personal income
   private ArrayList<Expenses> list; // to holds the monthly expenses list
   private Expenses cumulativeExpenses;// to holds the accumulative expenses so far
   private Expenses planningBudget;// to holds the planning budget 
   private Expenses remainingExpenses;// to holds the remainning budget

   private double totalExpenses;// to holds the total amount of money already spent
   private double totalPlanning;// to holds the total amount of money for the planning budget
   private double totalRemains;// to holds the total amount of money still have before run out the planning budget
   private double availableMoney;// to holds the total amount of money still be able to use

   /*
      The default constructors
   */
   Budget(){
      this.income = 0;
      this.cumulativeExpenses = null;
      this.list = new ArrayList<Expenses>();
   }
   /*
      This constructors initializes the class with income input
   */
   Budget(double i){
      this.income = i;
      this.cumulativeExpenses = null;
      this.list = new ArrayList<Expenses>();
   }
   /*
      This getter returns the income;
   */
   public double getIncome() {
      return income;
   }
   /*
      This setter sets the income;
   */
   public void setIncome(double i) {
      income = i;
   }
   /*
      This method adds a new expenses to the list of expenses;
   */
   public boolean addExpense(Expenses e) {
      list.add(e);
      return true;
   }
   /*
      This method removes an existing expense from the list of expenses by its index
   */
   public boolean removeExpense(int index) {
      list.remove(index);
      return true;
   }
   /*
      This method gets an existing expense from the list of expenses by its index
   */
   public Expenses getExpense(int index) {
      return list.get(index);
   }

   /*
      This method updates an existing expense from the list of expenses
   */
   public boolean updateExpense(int index, Expenses newValue) {
      Expenses oldExpense = list.get(index);
      //update the data
      oldExpense.setMonth(newValue.getMonth());
      oldExpense.setHousing(newValue.getHousing());
      oldExpense.setUtilities(newValue.getUtilities());
      oldExpense.setFood(newValue.getFood());
      oldExpense.setTransportation(newValue.getTransportation());
      oldExpense.setMedical(newValue.getMedical());
      oldExpense.setInsurance(newValue.getInsurance());
      oldExpense.setClothing(newValue.getClothing());
      oldExpense.setOther(newValue.getOther());
      oldExpense.setTotal();
      return true;

   }


   /*
      This nethod initializes the planning budget object
   */
   public void setPlanningBudget(Expenses plan) {
      planningBudget = plan;
      totalPlanning = plan.getHousing() + plan.getUtilities() + plan.getFood() + plan.getTransportation()
                      + plan.getMedical()  + plan.getInsurance()  + plan.getClothing() + plan.getOther();
   }
    /*
      This nethod returns the planning budget object
   */
   public Expenses getPlanningBudget() {
      return planningBudget;
   }
   /*
      This method calculates each specific categories of expenes and returns it as a expense of object privately
   */
   private void alreadyExpenses() {
          String month = "ALL SO FAR";
          double housing = 0;
          double utilities = 0;
          double food = 0;
          double transportation = 0;
          double medical = 0;
          double insurance = 0;
          double clothing = 0;
          double other = 0;

         for(int i = 0; i < list.size(); i++){      
            housing += list.get(i).getHousing();
            utilities += list.get(i).getUtilities();
            food += list.get(i).getFood();
            transportation += list.get(i).getTransportation();
            medical += list.get(i).getMedical();
            insurance += list.get(i).getInsurance();
            clothing += list.get(i).getClothing();
            other += list.get(i).getOther();

         }
         totalExpenses = housing + utilities + food + transportation + medical + insurance + clothing + other;
         cumulativeExpenses = new Expenses(month, housing, utilities, food, transportation, medical, insurance, clothing, other);
   }

   /*
      This medthod calculates relative budget program
   */

   public String budget_calculation() {
      this.alreadyExpenses();
      totalRemains = totalPlanning - totalExpenses;
      availableMoney = income - totalExpenses;
      String str = "\n* Overall planning: " + totalPlanning + 
                  "\n* Overall expenses: " + totalExpenses + ", Percentage Used: " + String.format("%.2f", (totalExpenses / totalPlanning) * 100.0) + "%." +
                  "\n* Overall remain in the budget: " + totalRemains + ", Percentage Remain: " + String.format("%.2f", (totalRemains / totalPlanning) * 100.0) + "%." +
                  "\n* Available amount in your account: " + availableMoney + ", Percentage Available Money: " + String.format("%.2f", (availableMoney / income) * 100.0) + "%.";
      return str;            
       
   }
   
   /*
      This method display all budget information
   */

   public String budget_display() {
      String str = "* Fully information in your personal budget proram: ";
      for(int i = 0; i < list.size(); i++){
         str += "\nIndex: " + i + ". " + list.get(i).displayExpense() + "\n";
      }
      return str;
   }
   
}
   
