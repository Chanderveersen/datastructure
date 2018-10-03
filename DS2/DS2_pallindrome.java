import static java.lang.System.out;
import java.util.*;
class DS2_pallindrome{
              static Scanner sc=new Scanner(System.in);
              public static void main(String args[]){
              String x=sc.nextLine(), reverse="";


              for(int i=x.length()-1;i>=0;i--){
                        reverse+=x.charAt(i);
              }
              System.out.println(reverse);

              if(reverse.equals(x))
              System.out.println("Palindrome");
               else
               System.out.println("Not palindrome");
            }
}