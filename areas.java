import java.util.*;
class areas
{
    void area(int r)
    {
        double area=3.14*r*r;
        System.out.println("Area of the circle is :"+area);
    
    }
    void area(int l , int b)
    {
        int area=l*b;
        System.out.println("Area of the rectangle is :"+area);
    }
    void area(double base ,double height)
    {
        double area=0.5*base*height;
        System.out.println("Area of the triangle is :"+area);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        areas a=new areas();
        System.out.println("Choose one : \n 1.Area of Circle \n 2.Area of Rectangle \n 3.Area of Triangle ");
        int ch=sc.nextInt();
        if (ch==1)
        {
            System.out.println("Enter radius of the circle :");
            int r =sc.nextInt();
            a.area(r);
        }
        else if(ch==2)
        {
            System.out.println("Enter length and breadth of the triangle :");
            double base =sc.nextDouble();
            double height=sc.nextDouble();
            a.area(base,height);
            
        } 
        else if(ch==3)
        {
            System.out.println("Enter length and  breadth of the rectangle :");
            int l =sc.nextInt();
            int b=sc.nextInt();
            a.area(l,b);
        }
        else
        System.out.println("Wrong Choice !");
    }

}
