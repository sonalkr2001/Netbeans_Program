//Accept character from user and show their ascii value.
import java.util.*;
public class Ascii {
    public static void main(String ar[])
    {
        char ch;
        int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter any character from keyboard");
       ch=sc.next().charAt(0);
        n=ch;
        System.out.println("Ascii value of character:"+" "+ch+" "+"is-"+n);
       
    }
}
