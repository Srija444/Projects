import java.util.Scanner;
class String3{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("enter the password: ");
    String password=s.nextLine();
    boolean upper=false;
    boolean lower=false;
    boolean digit=false;
    boolean symbol=false;
    for(int i=0;i<password.length();i++){
      
    
    char c = password.charAt(i);
    if(Character.isUpperCase(c)){
      upper=true;
    }
      else if(Character.isLowerCase(c)){
        lower=true;
      }
      else if(Character.isDigit(c)){
        digit=true;
      }
      else{
        symbol=true;
      }
      
    }
    if(upper && lower && digit && symbol){
      System.out.println("password is valid ");
      System.out.println("--------");
      System.out.println(password);
    }
    else{
      System.out.println("invalid  password please check it ");
      System.out.println("--------");
    }
  }
}