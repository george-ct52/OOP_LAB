import java.util.*;
class Employee
{
    void display()
    {
        System.out.println("Name of class is:"+getClass());
    }
    void calcSalary()
    {
        System.out.println("Salary of the Employee is 10000");
    }

}

class Engineer extends Employee
{

    void calcSalary()
    {

        System.out.println("Salary of Engineer is 20000");
   } 
 
    
}

public class singleobj
{
    public static void main(String[] args) 
    {
       Engineer eng =new Engineer();
       eng.display();
       eng.calcSalary();
    }      
}
