import java.util.Scanner;

public class palindrome {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String st=sc.nextLine();
        int len= st.length();
        String rev="";
        for (int i=len-1;i>=0;i--)
        {
            rev=rev+st.charAt(i);
        }

        if (rev.equalsIgnoreCase(st))
        System.out.println("Entered string is a palindrome ");
        else
        System.out.println("Not palindrome");



    }

    
}
