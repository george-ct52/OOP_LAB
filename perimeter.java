

class perimeter {
    int length,breadth,r;
    perimeter(int length,int breadth)
    {
        float perimeter=2*(length+breadth);
        System.out.println("The Perimeter of the rectangle ="+perimeter);
        
    }
    perimeter(int radius)
    {
        double perimeter =2*3.14*radius;
        System.out.println("The Perimeter of the circle ="+perimeter);
    }
    public static void main(String args[])
    {
       perimeter circle = new perimeter(4) ;

        perimeter rect = new perimeter(10,20); 
    }


}
