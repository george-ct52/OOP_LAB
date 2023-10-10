import java.util.*;
class secondlargest

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
          
        }
        int temp;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if (arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        
            System.out.println("The second largest inside the array :" +arr[n-2]);
          
        
    


    }
}
