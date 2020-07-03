import java.util.*;
import java.io.*;
public class Sign
{

    Scanner sc=new Scanner(System.in);
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int ch4;
    String u , p;
    String username;
    String password;
    String name;
    
    int l=0;
   
    
    void main()throws IOException
    {           
       do
       {
        l=0;
        System.out.println("Press:\n1.Sign Up \n2.Login");
        ch4=sc.nextInt();
        switch(ch4)
        {
            case 1:
            
            String y=sc.nextLine();
            System.out.println("Enter username");
            username=sc.nextLine();
            System.out.println("Enter password");
            password=sc.nextLine();
            System.out.println("Enter name");
            name=sc.nextLine();
            for(long l=0;l<=99000;l++)
            {
                System.out.println("Creating Account");
                System.out.println("\f");
            }
            System.out.println("Account Created!!");
            System.out.println("Name:"+name);
            System.out.println("Username:"+username);
            System.out.println("Password:"+password);
            System.out.println("*****************************************************************************************************************************************************************************************************************************");

            break;

            case 2:
            String x=sc.nextLine();
            System.out.println("Enter username");
            u=sc.nextLine();
            System.out.println("Enter password");
            System.out.println("Password:"+password);
            p=sc.nextLine();
            for(int k=0;k<10;k++)
            {
                if(u.equals(username))
                {
                    if(p.equals(password))
                        l++;
                    
                }
            }
            if(l>0)
            {
                System.out.println("*****************************************************************************************************************************************************************************************************************************");
                System.out.println("Welcome "+name);
            }
            else 
            {
                System.out.println("*****************************************************************************************************************************************************************************************************************************");
                System.out.println("Username or password not recognised");
            }

            break;

            default:
            System.out.println("Wrong choice");
        }
        

    }while(ch4!=3);
}
}
