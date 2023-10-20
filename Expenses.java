/*
 * This file is used to create a expenses class holds the personal expenses 
 and its functionalities to fit the intended program
 * Date Modified: Sep 12, 2022
 * @author QuangHo
*/


class Expenses{
   
   private String month;
   private double housing;
   private String h_note;
   private double utilities;
   private String u_note;
   private double food;
   private String f_note;
   private double transportation;
   private String t_note;
   private double medical;
   private String m_note;
   private double insurance;
   private String i_note;
   private double clothing;
   private String c_note;
   private double other;
   private String o_note;
   private double totalSpent;
   //default constructor
   Expenses(){
      this.housing = 0;
      this.utilities = 0;
      this.food = 0;
      this.transportation = 0;
      this.medical = 0;
      this.insurance = 0;
      this.clothing = 0;
      this.other = 0;
      this.totalSpent = 0;
   }
   //this constructor holds the real personal expenses and these expenses' notes
   Expenses(String month, double h, String hn, double u, String un, double f, String fn, double t, String tn,
   double m, String mn, double i, String in, double c, String cn, double o, String on) {
      this.month = month.toUpperCase();
      this.housing = h;
      this.h_note = hn;
      this.utilities = u;
      this.u_note = un;
      this.food = f;
      this.f_note = fn;
      this.transportation = t;
      this.t_note = tn;
      this.medical = m;
      this.m_note = mn;
      this.insurance = i;
      this.i_note = in;
      this.clothing = c;
      this.c_note = cn;
      this.other = o;
      this.o_note = on;
      this.totalSpent = housing + utilities + transportation + food + medical + insurance + clothing + other;
   }
   /*
      this constructor holds the real personal expenses without notes
   */
   Expenses(String month, double h, double u, double f, double t, double m, double i, double c, double o) {
      this.month = month.toUpperCase();
      this.housing = h;
      this.utilities = u;
      this.food = f;
      this.transportation = t;
      this.medical = m;
      this.insurance = i;
      this.clothing = c;
      this.other = o;
      this.totalSpent = housing + utilities + transportation + food + medical + insurance + clothing + other;

   }
   /*
      this method sets the month for the expense
   */
   public void setMonth(String m) {
      month = m.toUpperCase();
   }
   /*
      this method gets the month of the expense
   */
   public String getMonth(){
      return month;
   }
   /*
      this method sets the housing expense with note
   */
   public void setHousing(double h, String note) {
      housing = h;
      h_note = note;
   }
    /*
      this method sets the housing expense without note
   */
   public void setHousing(double h) {
      housing = h;
   }

   /*
      this method gets the housing expense with note
   */

   public String getHousingWithNote() {
      String str = "Housing Expense: " + housing +
                   "\nHousing Note " + h_note;  
      return str;
   }
   /*
      this method gets the housing expense without note
   */
   public double getHousing(){
      return housing;
   }
   /*
      this method sets the utilities expense with note
   */
   public void setUtilities(double u, String note) {
      utilities = u;
      u_note = note;
   }
    /*
      this method sets the utilities expense without note
   */
   public void setUtilities(double u) {
      utilities = u;
   }

   /*
      this method gets the utilities expense with note
   */
   public String getUtilitiesWithNote() {
      String str = "Utilities Expense: " + utilities +
                   "\nUtilities Note " + u_note;  
      return str;
   }
   /*
      this method gets the utilities expense without note
   */
   public double getUtilities(){
      return utilities;
   }
   /*
      this method sets the food expense with note
   */
   public void setFood(double f, String note) {
      food = f;
      f_note = note;
   }
    /*
      this method sets the food expense without note
   */
   public void setFood(double f) {
      food = f;
   }

   /*
      this method gets the food expense with note
   */
   public String getFoodWithNote() {
      String str = "Food Expense: " + food +
                   "\nFood Note " + f_note;  
      return str;
   }
   /*
      this method sets the food expense without note
   */
   public double getFood(){
      return food;
   }
   /*
      this method sets the transportation expense with note
   */
   public void setTransportation(double t, String note) {
      transportation = t;
      t_note = note;
   }
    /*
      this method sets the transportation expense without note
   */
   public void setTransportation(double t) {
      transportation = t;
   }

   /*
      this method gets the transportation expense with note
    */
   public String getTransportationWithNote() {
      String str = "Transportation Expense: " + transportation +
                   "\nTransportation Note " + t_note;  
      return str;
   }
   /*
      this method gets the transportation expense without note
   */
   public double getTransportation(){
      return transportation;
   }
   /*
      this method sets the medical expense with note
   */
   public void setMedical(double m, String note) {
      medical = m;
      m_note = note;
   }
    /*
      this method sets the medical expense withput note
   */
   public void setMedical(double m) {
      medical = m;
   }

   /*
      this method gets the medical expense with note
   */
   public String getMedicalWithNote() {
      String str = "Medical Expense: " + medical +
                   "\nMedical Note " + m_note;  
      return str;
   }
   /*
      this method gets the medical expense without note
   */
   public double getMedical(){
      return medical;
   }
   /*
      this method sets the insurance expense with note
   */
   public void setInsurance(double i, String note) {
      insurance = i;
      i_note = note;
   }
   /*
      this method sets the insurance expense without note
   */
   public void setInsurance(double i) {
      insurance = i;
   }

   /*
      this method gets the insurance expense with note
   */
   public String getInsuranceWithNote() {
      String str = "Insurance Expense: " + insurance +
                   "\nInsurance Note " + i_note;  
      return str;
   }
   /*
      this method sets the insurance expense without note
   */
   public double getInsurance(){
      return insurance;
   }
   /*
      this method sets the clothing expense with note
   */
   public void setClothing(double c, String note) {
      clothing = c;
      c_note = note;
   }
    /*
      this method sets the clothing expense without note
   */
   public void setClothing(double c) {
      clothing = c;
   }

   /*
      this method gets the clothing expense with note
   */
   public String getClothingWithNote() {
      String str = "Clothing Expense: " + clothing +
                   "\nClothing Note " + c_note;  
      return str;
   }
   /*
      this method gets the clothing expense without note
   */
   public double getClothing(){
      return clothing;
   }
   /*
      this method sets the other expenses with note
   */
   public void setOther(double o, String note) {
      other = o;
      o_note = note;
   }
    /*
      this method sets the other expenses without note
   */
   public void setOther(double o) {
      other = o;
   }

    /*
      this method gets the other expenses with note
   */
   public String getOtherWithNote() {
      String str = "Other Expenses: " + housing +
                   "\nOther Note " + h_note;  
      return str;
   }
   /*
      this method gets the other expenses without note
   */
   public double getOther(){
      return other;
   }
    /*
      this method sets the total of the expenses
    */  
   public void setTotal() {
      totalSpent = housing + utilities + transportation + food + medical + insurance + clothing + other;
   }

/*
   this method gets the other expenses without note
*/
   public double getTotal(){
      setTotal();
      return totalSpent;
   }
   /*
      this method displays entire expenses with notes
   */
   public String displayExpense() {
      String str = "\n* Expense in " + month + " includes: " +
      "\n\tHousing: " + housing + "\n\tUtilities: " + utilities + 
      "\n\tFood: " + food + "\n\tTransportation: " + transportation +
      "\n\tMedical: " + medical + "\n\tInsurance: " + insurance + 
      "\n\tClothing: " + clothing + "\n\tOther: " + other +
      "\n.........................................................." +
      "\n\tTotal Spent: " + totalSpent;
      return str;
   }
}