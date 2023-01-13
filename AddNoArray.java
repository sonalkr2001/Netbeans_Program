//wap that accept 10 no and add new no at given position.
import java.util.*;
public class AddNoArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,p,n=0;
        int arr[]=new int[15];
        System.out.println("Enter 10 no");
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the new no");
        n=sc.nextInt();
        System.out.println("Enter the position");
        p=sc.nextInt();
        for(i=9;i>=p-1;i--)
        {
            arr[i+1]=arr[i];
        }
         arr[p-1]=n;

         System.out.println("Array after insert no are");
         for(i=0;i<=10;i++)
         {
             System.out.println(arr[i]);
         }
    }
 
}
