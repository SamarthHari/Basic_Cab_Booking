import java.util.*;
import java.io.*;
import java.text.SimpleDateFormat;
public class Cab
{
    Scanner sc = new Scanner(System.in);
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(read);
    long l;
    void sedan()throws IOException
    {
        System.out.println("");
        System.out.println("Please Enter your address");
        String add=sc.nextLine();
        int abc = (int)(Math.random()*100);
        if(abc<=10)
        {
            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }
            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Honda City");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");

        }
        if(abc>10&&abc<=20)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Renault Logan");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
        if(abc>=21)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Tata Indigo");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
    }

    void mini()throws IOException
    {
        System.out.println("");
        System.out.println("Please Enter your address");
        String add=sc.nextLine();
        int abc = (int)(Math.random()*100);
        if(abc<=10)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Tata Indica");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
        if(abc>10&&abc<=20)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Hyundai Santro");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
        if(abc>=21)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Volkswagen Polo");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
    }

    void SUV()throws IOException
    {
        System.out.println("");
        System.out.println("Please Enter your address");
        String add=sc.nextLine();
        int abc = (int)(Math.random()*100);
        if(abc<=10)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Maruti Ertiga");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
        if(abc>10&&abc<=20)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }

            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");
            System.out.println("Car:Mahindra XUV 500");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
        if(abc>=21)
        {

            System.out.println("Please wait while we confirm the booking..........");
            for(l=0;l<=1000000000;l++)
            {
            }
            System.out.println("****************************************************************************************************************************************************************************************************************************************************************");System.out.println("Car:Toyota Innova");
            System.out.println("Address:"+add);
            System.out.println("\nPress Enter to Confirm");
            String str = in.readLine();
            System.out.println("Have A Safe Journey!!");
        }
    }

    public void  Cabo()throws IOException
    {

        System.out.println("\f");
        System.out.println("The current Date and time are:");
        Date rightnow  = new Date();
        System.out.println(rightnow);
        GregorianCalendar obj = new GregorianCalendar();
        int hour = obj.get(Calendar.HOUR_OF_DAY);
        int min=obj.get(Calendar.MINUTE);

        System.out.println("");
        System.out.println("Rules and Regulations: \n 1.You will have to pay by meter \n 2.The fares change as per the timing(peak and low hours)");
        System.out.println(" 3.No smoking in the cab \n 4.No bargaining regarding the fare \n 5.Please give the driver directions in case he may not know");      
        System.out.println(" 6.If the current time is within the peak hours or low hours, you will be notified about the change in cost");
        System.out.println(" 7.No cab can be booked more than 24 hours in advance");
        System.out.println("");
        System.out.println("Press: \n1.Ride now \n2.Ride later");
        int ch;ch=sc.nextInt();
        Cab obj1 = new Cab();
        switch(ch)
        {
            case 1:
            System.out.println("");
            if(hour>=19&&hour<=20)
                System.out.println("As the time now is peak time, you will have to pay 1.5 times more fare");
            if(hour>=15&&hour<=16)
                System.out.println("As now is a low time,you will have to pay only 0.8 times the fare");

            int ch1;
            System.out.println("Choose the type of car:\n1.Sedan \n2.Mini \n3.SUV ");
            ch1=sc.nextInt();
            switch(ch1)
            {
                case 1:
                obj1.sedan();
                break;
                case 2:
                obj1.mini();
                break;
                case 3 :
                obj1.SUV();
                break;
                case 4:
                System.out.println("Back");

                break;
                default:
                System.out.println("Wrong choice");
            }
            break;

            case 2:
            System.out.println("\f");
            System.out.println("The current Date and time are:");
            System.out.println(rightnow);
            System.out.println("\nAfter how long would you like  the cab to be sent?");
            int hr,m;
            do{
                System.out.println("\nNo cab can be booked more than 24 hours in advance");
                System.out.println("Enter the number of hours ");
                hr=sc.nextInt();
                System.out.println("Enter the number of minutes");
                m=sc.nextInt();
                if(m>=60)
                {
                    int d=m/60;
                    hr+=d;
                    m-=60*d;
                }
            }while(hr>24);

            int ch2;
            System.out.println("Choose the type of car:\n1.Sedan \n2.Mini \n3.SUV ");
            ch2=sc.nextInt();
            switch(ch2)
            {
                case 1:
                obj1.sedan();
                break;
                case 2:
                obj1.mini();
                break;
                case 3 :
                obj1.SUV();
                break;
                case 4:
                System.out.println("Back");
                break;
                default:
                System.out.println("Wrong choice");

            }
            hour+=hr;
            min+=m;
            if(min>=60)
            {
                int p=min/60;
                hour+=p;
                min-=60*p;
            }
            if(hour>=24)
            {
                hour-=24;
            }
            if(hour<12)
                System.out.println("\nWe will send the cab at "+hour+":"+min+" am");
            else
                System.out.println("\nWe will send the cab at "+hour+":"+min+" pm");  

            break;
            default:
            System.out.println("Wrong choice");

        }
        System.out.println("\nPress Enter to continue");
        String wait = in.readLine();        
        System.out.println("***********************************************************************************************************************************************************************************************************************************************************");


    }
}
