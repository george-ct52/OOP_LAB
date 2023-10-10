import java.util.*;
class transpose_matrix
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        
        int arr[][]= new int[rows][col];
        int t[][]= new int[col][rows];
        
        System.out.println("Enter the  values :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
          
        }
        
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                t[j][i]=arr[i][j];
            }
          
        }

        System.out.println("Array:");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



        System.out.println("Transpose Array:");
        for(int i=0;i<col;i++)
        {
            for(int j=0;j<rows;j++)
            {
                System.out.print(t[i][j]+" ");
            
            }
            System.out.println();
        }


    }
    
}   