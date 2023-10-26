import java.util.*;
class employee
{
    String name;
    int empno,phnno;
    

    Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name of the Employee :");
        name = sc.nextLine();
        System.out.println("Enter employee number :");
        empno=sc.nextInt();
        System.out.println("Enter phone number :");
        phnno=sc.nextInt();
        
    }
    void display()
    {
        System.out.println("Name of the Employee :"+name);
        System.out.println("Employee Number :"+empno);
        System.out.println("Phone Number :"+phnno);

       
    }
}
class pgm
{
    public static void main(String args[])
    {
      employee[] e ;
      e= new employee[5];
      for (int i=0;i<5;i++)
      {
        System.out.println("Enter the details of employee "+(i+1));  
        e[i]=new employee();
        e[i].read();
      }  
      for (int i=0;i<5;i++)
      {
        System.out.println("Details of employee "+(i+1));  
        e[i].display(); 
        System.out.println();
      }
      
    }
}