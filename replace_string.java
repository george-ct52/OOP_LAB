import java.util.Scanner;

public class replace_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String st=sc.nextLine();
        int len= st.length();
        System.out.println("Enter character to replace  :");
        char key=sc.next().charAt(0);
        System.out.println("Enter character to be replaced with :");
        char rep=sc.next().charAt(0);
        String x = st.replace(key, rep);
        System.out.println("The new replaced string is :"+x);
    

    }
}