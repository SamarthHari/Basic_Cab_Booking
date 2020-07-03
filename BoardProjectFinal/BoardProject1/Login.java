import java.util.*;
import java.io.*;
public class Login
{
    void main()
    {
        Scanner sc=new Scanner(System.in);
        String x=sc.nextLine();
        System.out.println("Enter username");
        String u=sc.nextLine();
        System.out.println("Enter password");
        System.out.println("Password:"+password[0]);
        String p=sc.nextLine();
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
    }
}