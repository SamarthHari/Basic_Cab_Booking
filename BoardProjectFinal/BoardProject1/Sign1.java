import java.util.*;
import java.io.*;
public class Sign1
{

    Scanner sc=new Scanner(System.in);
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int ch;
    String u , p;
    String username[]=new String[10];
    String password[]=new String[10];
    String name[]=new String[10];
    int i=0;
    int l=0;
    int z;
    
    void main()throws IOException
    {           
        do
        {
            l=0;
            System.out.println("Press:\n1.Sign Up \n2.Login");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:

                String y=sc.nextLine();
                System.out.println("Enter username");
                username[i]=sc.nextLine();
                System.out.println("Enter password");
                password[i]=sc.nextLine();
                System.out.println("Enter name");
                name[i]=sc.nextLine();
                for(long l=0;l<=99000;l++)
                {
                    System.out.println("Creating Account");
                    System.out.println("\f");
                }
                System.out.println("Account Created!!");
                System.out.println("Name:"+name[i]);
                System.out.println("Username:"+username[i]);
                System.out.println("Password:"+password[i]);
                break;

                case 2:
                String x=sc.nextLine();
                System.out.println("Enter username");
                u=sc.nextLine();
                System.out.println("Enter password");
                System.out.println("Password:"+password[0]);
                p=sc.nextLine();
                for(int k=0;k<10;k++)
                {
                    if(u.equals(username[k]))
                    {
                        if(p.equals(password[k]))
                            l++;
                        z=k;
                    }
                }
                if(l>0)
                {
                    System.out.println("*****************************************************************************************************************************************************************************************************************************");
                    System.out.println("Welcome "+name[z]);
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
            i++;
        }while(ch!=3);
    }
}

