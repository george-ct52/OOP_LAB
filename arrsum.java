import java.util.*;
class arrsum
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length : ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        int sum=0;
        System.out.println("Enter "+n+" values :");
        for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
          sum+=arr[i];
        }
        System.out.println("The sum of the array is :"+sum);
    
    }
}