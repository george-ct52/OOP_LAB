import java.util.*;
class smallarr
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        
        System.out.println("Enter "+n+" values :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          
        }
        int small=arr[0];
        for(int i=0;i<n;i++)
        {
          if (arr[i]< small)
             small = arr[i];
        }
        System.out.println("The smallest element is :"+small);
    
    }
}