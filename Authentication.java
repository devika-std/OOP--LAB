import java.util.Scanner;
public class Authentication
{
    public static void main(String[] args) 
    {
        String username="Raju";
        String password="@raju123";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the username:");
        String u1=sc.nextLine();
        System.out.println("Enter your password:");
        String u2=sc.nextLine();
        try
        {
            if((u1.equals(username)) && (u2.equals(password)))
            {
                System.out.println("Access granted");
            }
            else
            {
                throw new CredentialException("Invalid credentials");
            }
        } 
        catch(CredentialException e)
        {
            System.out.println(e.getMessage());
        }   
    }
}
