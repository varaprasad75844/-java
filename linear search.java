import java.io.*;
import java.util.*;
class Linearsearch{
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int pos=-1;
        System.out.println("Enter no. of elements:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter"+n+"values into an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter saerch elements:");
        int key=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if (arr[i]==key)
            {
                pos=i+1;
                break;
            }
        }
        if (pos==-1)
        {
            System.out.println(key+"Elements not found");
        }
        else{
            System.out.println(key+"Found at"+pos+"position in the array");
        }
    }
}
