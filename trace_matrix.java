import java.util.*;
class trace_matrix
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the square matrix : ");
        int n=sc.nextInt();
        
        
        int arr[][]= new int[n][n];
        

        System.out.println("Enter the  values of the array :");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
          
        }


        int trace=0;
        for(int i=0;i<n;i++)
        {
            
            
            trace=trace+arr[i][i];
                      
        }

        System.out.println("The trace of the matrix is :"+trace);

    }
}

