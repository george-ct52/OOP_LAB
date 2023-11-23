public class catchers
{
        public static void main(String[] args)
        {
                try 
                {
                    int n = 20 / 0;
                } 
                catch (ArithmeticException e) 
                {
                    System.out.println("Error message: " + e.getMessage());
                }
                int a[]={10,20,30,40,50};
                try
                {
                    System.out.println("The sixth position :"+a[6]);   
                } 
                catch (IndexOutOfBoundsException e) 
                { 
                   System.out.println("Error message: " + e.getMessage());

                    
                }

        }
}
        
    

