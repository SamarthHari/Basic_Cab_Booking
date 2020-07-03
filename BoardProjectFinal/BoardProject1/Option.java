import java.util.*;
import java.io.*;
public class Option
{

    Scanner sc=new Scanner(System.in);
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    int ch;
    String u , p;

    int i=0;
    int l=0;
    int z;

    void Optionz()throws IOException

    {
        Scanner sc = new Scanner(System.in);

        int ch;
        long ll;

        System.out.println("Please Choose one of the following:\n1.Book a cab\n2.Rent a car \n3.Exit");
        ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            Cab obj = new Cab();
            obj.Cabo();
            break;

            case 2:
            Rent obj3 = new Rent();
            obj3.Rento();
            break;

            case 3:
            System.out.println("Exit");
            System.out.println("\nThank you!");
            System.out.println("****************************************************************************************************************************************************************************************************************");
            for(ll=0;ll<=10000000;ll++)
            {
            }
            for(ll=0;ll<=10000000;ll++)
            {
            }

            System.exit(0);
            break;

            default:
            System.out.println("Wrong choice");
        }   

    }

    public static void main(String args[])throws IOException
    {           
        Scanner sc=new Scanner(System.in);
        long l;
        int ch;
        Option obj=new Option();
        String username="";
        String password="";
        String name="";
        System.out.println("\f");
        for(l=0;l<=10000000;l++)
        {
        }

        System.out.println("                                                    .                                                                               `");
        for(l=0;l<=100000000;l++)   
        {
        }
        System.out.println("                                                    .              @'  @@  @@ @@@@@ @@    @@@+@` @@+@@@  @@@   @@  @@@@@            `");

        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("                                                    .              @+ '@@  @. @:    @@   #@`    @@   +@  @+@  @+@  @'               `");
        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("                                                    .              @+ @.@ +@  @     @;   @#     @,    @` @.@  @,@  @`               `");
        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("                                                    .              @+,@`@ @; :@@@@  @   .@`    ;@    `@`.@ @ @@+@ .@@@@             `");
        for(l=0;l<=100000000;l++)
        {
        }   
        System.out.println("                                                    .              @#@' @.@  @@    ,@   ,@     +@    +@ @@ @ @ @@ +@                `");

        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("                                                    .              @+@  @@+  @@    #@   `@:    ;@    @@ @' @## @+ @@                `");
        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("                                                    .              @@@  @@   @',,, @@,,, @@: .` @@ `@@  @  @@  @: @#,,,             `");
        for(l=0;l<=100000000;l++)       
        {
        }
        System.out.println("                                                    .              @@   @@   @@@@@ @@@@@  @@@@, `@@@@  .@  @+  @` @@@@@             `");
        for(l=0;l<=100000000;l++)
        {
        }
        System.out.println("WELCOME TO TRAVEL'o'CITY");        
        System.out.println("We are a Travel Service based in Mumbai helping Mumbaikars all around travel in and around Mumbai\n");
        System.out.println("**********************************************************************************************************************************************");

        do
        {
            l=0;
            System.out.println("Please Choose one of the following:\n1.Sign Up(You can only make 1 account.If more than one account is made, then the previous one will be deleted from our database) \n2.Login\n3.Continue as Guest\n4.Exit");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:

                String y=sc.nextLine();
                System.out.println("Enter username");
                username=sc.nextLine();
                System.out.println("Enter password");
                password=sc.nextLine();
                System.out.println("Enter name");
                name=sc.nextLine();
                for(long lo=0;lo<=99000;lo++)
                {
                    System.out.println("Creating Account");
                    System.out.println("\f");
                }
                System.out.println("Account Created!!");
                System.out.println("Name:"+name);
                System.out.println("Username:"+username);
                System.out.println("Password:"+password);
                obj.Optionz();
                break;

                case 2:
                String x=sc.nextLine();
                System.out.println("Enter username");
                String u=sc.nextLine();
                System.out.println("Enter password");

                String p=sc.nextLine();

                if(u.equals(username))
                {
                    if(p.equals(password))
                        l++;

                    {

                        if(l>0)
                        {
                            System.out.println("*****************************************************************************************************************************************************************************************************************************");
                            System.out.println("Welcome "+name);
                        }
                    }
                }
                else 
                {
                    System.out.println("*****************************************************************************************************************************************************************************************************************************");
                    System.out.println("Username or password not recognised");
                }
                obj.Optionz();
                break;
                case 3:
                obj.Optionz();
                break;
                case 4:
                System.out.println("Exit");
                System.out.println("\nThank you!");
                System.out.println("****************************************************************************************************************************************************************************************************************");
                for(long ll=0;ll<=10000000;ll++)
                {
                }
                for(long ll=0;ll<=10000000;ll++)
                {
                }

                System.exit(0);
                break;


                default:
                System.out.println("Wrong choice");
                obj.Optionz();
            }

        }while(ch!=4);
    }
}

