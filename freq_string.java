import java.util.Scanner;

public class freq_string {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String st=sc.nextLine();
        int len= st.length();
        System.out.println("Enter character to check :");
        char ch=sc.next().charAt(0);
        int count=0;
        for (int i=0;i<len;i++)
        {
            if(st.charAt(i)==ch)
            {
             count=count+1;
             
            }
        }
        
        System.out.println("Character is present "+count+" aspartimes .");
        

    }
}
