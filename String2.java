import java.util.*;
class String2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
  System.out.println("Enter your Email: "+" ");
    String email=s.nextLine();
    if(email.contains(".") && email.contains("@")){
      System.out.println(email);
    }
    else{
      System.out.println("please provide your email that contains . and @");
    }
  }
}
