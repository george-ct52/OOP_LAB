import java.util.*;
class add_matrixes
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        
        int arr[][]= new int[rows][col];
        int arr2[][]= new int[rows][col];
        int pdt[][]= new int[rows][col];

        System.out.println("Enter the  values of first array :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
          
        }

        System.out.println("Enter the  values of second array :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
          
        }

        
	
	
	


        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
               System.out.print(sum[i][j]+" ");
            }
          System.out.println();
        }



        
    }
    
}   
