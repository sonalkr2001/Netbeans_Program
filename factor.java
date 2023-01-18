//wap to accept a no and show their factor.
import java.util.*;
public class factor {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any integer value");
        n=sc.nextInt();
        while(i<=n/2)
        {
            if(n%i==0)
            {
                System.out.println(i);
            }
           i++;
        }
    }
  
}
