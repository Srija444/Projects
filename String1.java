import java.util.*;
public class String1
{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
    System.out.println("enter the name");
    String name=sc.nextLine();
    
    if(name.length()>=5 && name.length()<=15){
        System.out.println(" full name is ="+name);
    }
    else{
        System.out.println("the name should be 5 to 15");
    }
    }
}