import java.util.*;
class String4{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the mobile number: ");
     String mobileNumber=s.nextLine();
    if(mobileNumber.length()==10 && mobileNumber.matches("[0-9]+")){
      System.out.println("mobile number is valid ");
      System.out.println("_______");
      System.out.println(mobileNumber);
    }
    else{
      System.out.println("mobile number is not valid--please enter the valid input  ");
      System.out.println("_______");
    }
  }
}