//wap that accept 10 no and seprate even and odd no and show.
import java.util.*;
public class SeprateEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,a=0,b=0;
        int arr[]=new int[10];
        int ev[]=new int[10];
        int od[]=new int[10];
        System.out.println("Enter 10 no");
        for(i=0;i<10;i++)
        {
           arr[i]=sc.nextInt();
           if(arr[i]%2==0)
           {
               ev[a]=arr[i];
               a++;
           }
           else
           {
               od[b]=arr[i];
               b++;
           }
        }
        System.out.println("Even no is:");
        for(i=0;i<a;i++)
        {
            System.out.println(ev[i]);
        }
        System.out.println("Odd no is:");
        for(i=0;i<b;i++)
        {
            System.out.println(od[i]);
        }

    }
 
}
