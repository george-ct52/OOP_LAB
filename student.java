import java.util.*;
class student 
{ 
    String name;
    int rno;
    int marks[]=new int[5];

    Scanner sc = new Scanner(System.in);
    void read()
    {
        System.out.println("Enter name of the student :");
        name = sc.nextLine();
        System.out.println("Enter roll number of the student :");
        rno=sc.nextInt();
        
        System.out.println("Enter marks of 5 subjects :");
        for(int i=0;i<5;i++)
        {
            System.out.println("Mark of subject"+(i+1)+":");
            marks[i]=sc.nextInt();
        }
    }
    void display()
    {
        System.out.println("Name of the student :"+name);
        System.out.println("Roll no of the student :"+rno);
        for(int i=0;i<5;i++)
        {
            System.out.println("Mark of subject "+(i+1)+":"+marks[i]);
        }
    }
}
class program
{
    public static void main(String args[])
    {
      student s1 = new student();
      s1.read();
      s1.display();  
    }
}

