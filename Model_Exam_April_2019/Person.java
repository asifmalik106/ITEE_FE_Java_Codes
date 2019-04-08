public class Person{
  static double LIVING_COST = 1000.0;
  double allowance;
  String cellPhoneNumber, emailAddresses[];

  Person() {
      this("0123456", LIVING_COST);
  }

  Person(String cellPhoneNumber, double allowance){
    // Answer for A  
    this.cellPhoneNumber = cellPhoneNumber;
      this.allowance = allowance;
  }

  public void setEmail(String email1){
      //Answer for B
      emailAddresses = new String[]{email1};
  }

  public void setEmail(String email1, String email2){
    //Answer for B
    emailAddresses = new String[]{email1, email2};
  }

  public void setEmail(String email1, String email2, String email3){
    //Answer for B
    emailAddresses = new String[]{email1, email2, email3};
  }

  public void sendSMS(){
    System.out.println(this + "Person sendSMS");
    sendEmail();
  }

  public void sendEmail(){
    System.out.println(this + "Person sendEmail");
  }

  public String toString(){
      return "I am Person: ";
  }
}