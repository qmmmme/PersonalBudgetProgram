/*

*/

class Person {
   
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String phoneNumber;
   private String email;
   private String occupation;
   
   /*
      This constructor initializes all about personal information
   */
   Person(String fname, String lname, String date, String pnum, String email, String occup) {
      this.firstName = fname;
      this.lastName = lname;
      this.dateOfBirth = date;
      this.phoneNumber = pnum;
      this.email = email;
      this.occupation = occup;
   }
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName(String str){
      firstName = str;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName(String str){
      lastName = str;
   }
   public String getPhoneNumber() {
      return phoneNumber;
   }
   public void setPhoneNumber(String str){
      phoneNumber = str;
   }
   public String getEmail() {
      return email;
   }
   public void setEmail(String str){
      email = str;
   }
   public String getDateOfBirth() {
      return dateOfBirth;
   }
   public void setDateOfBirth(String str){
      dateOfBirth = str;
   }
   public String getOccupation() {
      return occupation;
   }
   public void setOccupation(String str){
      occupation = str;
   }
   public String displayPerson() {
      String str = "";
      str += "\n* Your personal information: " +
            "\n\tFirst Name: " + firstName + ", " + "Last Name: " + lastName +
            "\n\tDate of Birth: " + dateOfBirth +
            "\n\tPhone Number: " + phoneNumber +
            "\n\tEmail: " + email + 
            "\n\tOccupation: " + occupation;
      return str;
   }
}