import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank(1 , 1234, "SBI" , 1000 , "Jalgaon");
        Bank bank1 = new Bank(2 , 4567, "HDFC" , 5000 , "Mumbai");
        Bank bank3 = new Bank(3 , 8910,"ICICI" , 500 , "Kanpur");
        System.out.println("Welcome to ATM");
        boolean want = true;
        while(want)
        {

            System.out.print("Please enter Your Card Id : ");
            int id = sc.nextInt();
            System.out.print("Enter Pin : ");
            int pin = sc.nextInt();

            if ((id == 1 && pin == 1234) || (id == 2 && pin == 4567) || (id == 3 && pin == 8910)) {
                Bank obj = null;
                if (id == 1 && pin == 1234) {
                    obj = bank;
                } else if (id == 2 && pin == 4567) {
                    obj = bank1;
                } else if (id == 3 && pin == 8910) {
                    obj = bank3;
                }
                System.out.println("1. Balance check");
                System.out.println("2. Withdraw Cash");
                System.out.println("3. Deposit Cash");

                System.out.println("Please insert the number of your transaction that you want to do : ");
                int option = sc.nextInt();
                if (option == 1) {
                    System.out.println("Your balance is " + obj.getBalance());
                } else if (option == 2) {
                    System.out.print("Enter the amount you want to withdraw : ");
                    int withdraw = sc.nextInt();
                    if (withdraw > obj.getBalance()) {
                        System.out.println("Insufficient Balance");
                    } else {
                        obj.setBalance(obj.getBalance() - withdraw);
                        System.out.println("Amount " + withdraw + " is debited successfully !!!");
                        System.out.println("Your balance is "+obj.getBalance());
                        System.out.println("Please take out your cash ");
                    }

                } else {
                    System.out.print("Enter the amount you want to deposit");
                    int deposit = sc.nextInt();
                    obj.setBalance(obj.getBalance() + deposit);
                    System.out.println("Your amount " + deposit + " is successfully deposited ");
                    System.out.println("Your Balance is " + obj.getBalance());
                }
            }
            else
            {
                System.out.println("wrong credentials");
                continue;
            }
            want = false;
        }


    }
}