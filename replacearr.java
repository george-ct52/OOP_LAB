import java.util.*;
class replacearr
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
        System.out.println("Enter value to search :");
        int key = sc.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
          if (arr[i]==key)
          {
            f=1;
            break;
          }             
        }
        if (f==1)
         {
            System.out.println("Enter value to replace ");
            int rep = sc.nextInt();
            for(int i=0;i<n;i++)
            {
              if (arr[i]==key)
              {
                arr[i]=rep;
                
              }             
            }
         }
        else
            System.out.println("Element not found in the array");
         
        
        System.out.println("The new array is :");             
        
        for(int i=0;i<n;i++)
        {
          System.out.println(arr[i]);             
        }
        
    }
}