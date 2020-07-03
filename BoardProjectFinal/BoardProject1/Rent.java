import java.util.*;
import java.io.*;
public class Rent
{
    Scanner sc = new Scanner(System.in);
    int cost;
    void Sedan(int days , int km, int hr)
    {

        System.out.println("Choose your car: \n1.Tata Indigo \n2.Honda City \n3.Skoda Octavia \n4.Skoda Rapid \n5.Maruti Ciaz \n6.Mercedes GLA \n7.Honda Amaze ");
        int ch=sc.nextInt();

        switch(ch)
        {
            case 1:
            if(days==0)
            {
                if(km<=20)
                    cost=20*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*20)+(km1*25);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*20)+(km4*25)+(km5*30);
                }
            }
            if(km==0)
            {
                cost=(days*1500)+(hr*120);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Tata Indigo");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 2:
            if(days==0)
            {
                if(km<=20)
                    cost=22*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*22)+(km1*26);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*22)+(km4*26)+(km5*30);
                }
            }
            if(km==0)
            {
                cost=(days*1520)+(hr*130);
            }

            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Honda City");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 3:
            if(days==0)
            {
                if(km<=20)
                    cost=24*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*24)+(km1*28);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*24)+(km4*28)+(km5*32);
                }
            }
            if(km==0)
            {
                cost=(days*1600)+(hr*160);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Skoda Octavia");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 4:
            if(days==0)
            {
                if(km<=20)
                    cost=24*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*24)+(km1*28);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*24)+(km4*28)+(km5*32);
                }
            }
            if(km==0)
            {
                cost=(days*1600)+(hr*160);
            }
            System.out.println("**********************************************************************************************************************************");

            System.out.println("Bill:-\n            Car:Skoda Rapid");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 5:
            if(days==0)
            {
                if(km<=20)
                    cost=22*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*22)+(km1*26);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*22)+(km4*26)+(km5*32);
                }
            }
            if(km==0)
            {
                cost=(days*1540)+(hr*140);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Maruti Ciaz");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 6:
            if(days==0)
            {
                if(km<=20)
                    cost=28*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*28)+(km1*35);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*28)+(km4*35)+(km5*40);
                }
            }
            if(km==0)
            {
                cost=(days*1900)+(hr*180);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Mercedes GLA");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 7:
            if(days==0)
            {
                if(km<=20)
                    cost=22*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*22)+(km1*26);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*22)+(km4*26)+(km5*32);
                }
            }
            if(km==0)
            {
                cost=(days*1600)+(hr*160);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Honda Amaze");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            default:
            System.out.println("Wrong choice ");
        }
    }
    int ch2;
    void Mini(int days, int km , int hr)
    {
        System.out.println("Choose your car:");
        System.out.println("1.Maruti Alto 800 \n2.Hyundai Santro \n3.Hyundai i10 \n4.Hyundai i20 \n5.Maruti Ritz \n6.Mini Cooper \n7.Maruti WagonR \n8.Volkswagen Polo");
        ch2=sc.nextInt();
        switch(ch2)
        {
            case 1:
            if(days==0)
            {
                if(km<=20)
                    cost=15*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*15)+(km1*20);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*15)+(km4*20)+(km5*25);
                }
            }
            if(km==0)
            {
                cost=(days*1000)+(hr*80);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Maruti Alto 800");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 2:
            if(days==0)
            {
                if(km<=20)
                    cost=15*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*15)+(km1*20);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*15)+(km4*20)+(km5*25);
                }
            }
            if(km==0)
            {
                cost=(days*1000)+(hr*80);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Hyundai Santro");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 3:
            if(days==0)
            {
                if(km<=20)
                    cost=15*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*15)+(km1*20);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*15)+(km4*20)+(km5*25);
                }
            }
            if(km==0)
            {
                cost=(days*1000)+(hr*80);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Hyundai i10");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 4:
            if(days==0)
            {
                if(km<=20)
                    cost=17*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*17)+(km1*22);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*17)+(km4*22)+(km5*27);
                }
            }
            if(km==0)
            {
                cost=(days*1200)+(hr*100);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Hyundai i20");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 5:
            if(days==0)
            {
                if(km<=20)
                    cost=17*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*17)+(km1*22);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*17)+(km4*22)+(km5*27);
                }
            }
            if(km==0)
            {
                cost=(days*1200)+(hr*100);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Maruti Ritz");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 6:
            if(days==0)
            {
                if(km<=20)
                    cost=25*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*25)+(km1*30);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*25)+(km4*30)+(km5*35);
                }
            }
            if(km==0)
            {
                cost=(days*1500)+(hr*120);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Mini Cooper");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 7:
            if(days==0)
            {
                if(km<=20)
                    cost=16*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*16)+(km1*19);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*16)+(km4*19)+(km5*25);
                }
            }
            if(km==0)
            {
                cost=(days*1150)+(hr*90);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Maruti WagonR");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 8:
            if(days==0)
            {
                if(km<=20)
                    cost=18*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*18)+(km1*23);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*18)+(km4*23)+(km5*28);
                }
            }
            if(km==0)
            {
                cost=(days*1300)+(hr*110);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Volkswagen Polo");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            default:
            System.out.println("Wrong Choice");

        }
    }

    void SUV(int days , int km , int hr)
    {
        System.out.println("Choose your car:");;
        System.out.println("1.Renault Duster \n2.Ford Ecosport \n3.Maruti Ertiga \n4.Mahindra XUV 500 \n5.Toyota Innova ");
        int ch2=sc.nextInt();
        switch(ch2)
        {
            case 1:
            if(days==0)
            {
                if(km<=20)
                    cost=25*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*25)+(km1*30);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*25)+(km4*30)+(km5*35);
                }
            }
            if(km==0)
            {
                cost=(days*1700)+(hr*180);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Renault Duster");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 2:
            if(days==0)
            {
                if(km<=20)
                    cost=25*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*25)+(km1*30);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*25)+(km4*30)+(km5*35);
                }
            }
            if(km==0)
            {
                cost=(days*1700)+(hr*180);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Ford Ecosport");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 3:
            if(days==0)
            {
                if(km<=20)
                    cost=27*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*27)+(km1*32);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*27)+(km4*32)+(km5*37);
                }
            }
            if(km==0)
            {
                cost=(days*1750)+(hr*160);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Maruti Ertiga");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 4:
            if(days==0)
            {
                if(km<=20)
                    cost=30*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*30)+(km1*35);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*30)+(km4*35)+(km5*40);
                }
            }
            if(km==0)
            {
                cost=(days*1850)+(hr*180);  
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Mahindra XUV 500");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            case 5:
            if(days==0)
            {
                if(km<=20)
                    cost=28*km;
                if(km>=20&&km<=50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    cost = (km2*28)+(km1*33);
                }
                if(km>50)
                {
                    int km1=km-20;
                    int km2=km-km1;
                    int km3=km-30;
                    int km4=km-km3;
                    int km5=km-(km4+km2);
                    cost=(km2*28)+(km4*33)+(km5*38);
                }
            }
            if(km==0)
            {
                cost=(days*1800)+(hr*170);
            }
            System.out.println("**********************************************************************************************************************************");
            System.out.println("Bill:-\n            Car:Toyota Innova");
            if(days==0)
                System.out.println("            Package:Kilometer based");
            else
                System.out.println("            Package:Time based");
            System.out.println("            Amount:"+cost);
            System.out.println("***********************************************************************************************************************************************************************************************************************************************************");
            break;

            default:
            System.out.println("Wrong choice");
        }
    }

    public void Rento()throws IOException
    {
        System.out.println("\f");
        System.out.println("The current Date and time are:");
        Date rightnow  = new Date();
        System.out.println(rightnow);
        GregorianCalendar obj = new GregorianCalendar();
        int hour = obj.get(Calendar.HOUR);
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        Rent obj1 = new Rent();

        System.out.println("Rules and Regulations:");
        System.out.println("1.The car has to be returned withing the selected time period. If not returned, we will charge an extra fine or Rs.100 per hour");
        System.out.println("2.The speed must not exceed over 120 Km/hr. If exceeded, a fine or Rs.500 will be charged");
        System.out.println("3.If the speed of the car exceeds over 150 Km/hr, you will not be allowed to rent another car for 1 month");
        System.out.println("4.Any accidents caused by external reasons will not be charged");
        System.out.println("5.In case of loss of property forgotten in the car we cannot be held responsible thereofore please take care of your belongings");
        System.out.println("");
        System.out.println("Choose a package:");
        System.out.println("1.Kilometer based \n2.Time based");
        int ch1=sc.nextInt();
        int km,hr,days;
        switch(ch1)
        {
            case 1:
            System.out.println("Enter the number of Kilometres that you want to drive the car:");
            km=sc.nextInt();
            days = 0;
            hr=0;
            System.out.println("Choose the type of car that you want to rent");
            System.out.println("1.Sedan \n2.Mini \n3.SUV");
            int ch3 = sc.nextInt();
            switch(ch3)
            {
                case 1:
                obj1.Sedan(days,km,hr);
                break;

                case 2:
                obj1.Mini(days,km,hr);
                break;

                case 3:
                obj1.SUV(days,km,hr);
                break;

                default:
                System.out.println("Wrong choice");
            }
            break;

            case 2:
            System.out.println("Enter number of days(Press 0 if you want to rent the car for less than 1 day)");
            days=sc.nextInt();
            System.out.println("Enter number of Hours");
            hr=sc.nextInt();
            km=0;
            System.out.println("Choose the type of car that you want to rent");
            System.out.println("1.Sedan \n2.Mini \n3.SUV");
            int ch4 = sc.nextInt();
            switch(ch4)
            {
                case 1:
                obj1.Sedan(days,km,hr);
                break;

                case 2:
                obj1.Mini(days,km,hr);
                break;

                case 3:
                obj1.SUV(days,km,hr);
                break;

                default:
                System.out.println("Wrong choice");
            }
            break;

            default:
            System.out.println("Wrong choice");
        }
        System.out.println("\nPress Enter to continue");
        String wait = in.readLine();        
        System.out.println("***********************************************************************************************************************************************************************************************************************************************************");

    }
}