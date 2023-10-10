import java.util.*;
class nxnlargest
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns : ");
        int rows=sc.nextInt();
        int col=sc.nextInt();
        
        int arr[][]= new int[rows][col];
        
        System.out.println("Enter the  values :");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                arr[i][j]=sc.nextInt();
            }
          
        }
        int lrow=0,lcol=0;
        int large=arr[0][0];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<col;j++)
            {
                if (arr[i][j]>large)
                {
                    large=arr[i][j];
                    lrow=i;
                    lcol=j;
                }
            }
          
        }
        System.out.println(" The largest element is :"+large+" Found at row :"+lrow+" column :"+lcol);

    }
    
}   