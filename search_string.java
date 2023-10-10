import java.util.Scanner;

public class search_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String st=sc.nextLine();
        int len= st.length();
        System.out.println("Enter character to check :");
        String ch=sc.next().charAt(0);
        for (int i=0;i<len;i++)
        {
            if(st.charAt(i)==ch)
            {
             System.out.println("Character is presemt inside the string at index :"+i);
             break; 
            }
        }
    

    }
}