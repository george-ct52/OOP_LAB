class odd extends Thread
{
    public void run()
    {
        for(int i=1;i<=100;i=i+2)
        {
            System.out.println("Odd :"+i);
        }

    }
}
class even extends Thread
{
    public void run()
    {
        for(int j=2;j<=100;j=j+2)
        {
            System.out.println("Even :"+j);
        }

    }
}

public class Multithread 
{
    public static void main(String[] args) 
    {
    
    
    odd o =new odd();
    even e = new even();
    o.start();
    e.start();
    
    }
      
    
}
