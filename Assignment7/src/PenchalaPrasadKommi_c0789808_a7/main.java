package PenchalaPrasadKommi_c0789808_a7;
import java.util.*;
import java.io.*;

class User{
    float balance;
    String accountNo;

    User()
    {
        balance = 0.0f;
        accountNo = "0000";
        String fileName = accountNo +".txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName,false);
            fileWriter.write(balance+"\n");
            fileWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occurred while writing to the file");
        }
    }

    User(String accountNo)
    {
        this.accountNo = accountNo;
        String fileName = accountNo +".txt";
        File file = new File(fileName);
        if(!file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(fileName, false);
                balance = 0.0f;
                fileWriter.write(balance + "\n");
                fileWriter.close();
            } catch (Exception e) {
                System.out.println("An error occurred while writing to the file");
            }
        }
        else{
            try {
                Scanner reader = new Scanner(file);
                balance = Float.parseFloat(reader.nextLine());
                reader.close();
            }
            catch (Exception e)
            {
                System.out.println("An error occurred while reading from the file");
            }
        }
    }

    User(float balance,String accountNo)
    {
        this.balance = balance;
        this.accountNo = accountNo;
        String fileName = accountNo +".txt";
        try {
            FileWriter fileWriter = new FileWriter(fileName,false);
            fileWriter.write(balance+"\n");
            fileWriter.close();
        }
        catch(Exception e)
        {
            System.out.println("An error occurred while writing to the file");
        }
    }

    public void checkBalance() {
        String fileName = accountNo +".txt";
        File file = new File(fileName);
        try {
            Scanner reader = new Scanner(file);
            float bal = Float.parseFloat(reader.nextLine());
            System.out.println("Account balance : "+bal);
        }
        catch (Exception e)
        {
            System.out.println("An error occurred while reading from the file");
        }
    }

    public void deposit(float amount)
    {
        String fileName = accountNo +".txt";
        try {
            FileWriter fw = new FileWriter(fileName,false);
            balance += amount;
            fw.write(balance+"\n");
            fw.close();
            System.out.println("The amount "+amount+" is successfully deposited");
            checkBalance();
        }
        catch (Exception e)
        {
            System.out.println("An error occurred while reading from the file");
        }

    }

    public void withdraw(float amount)
    {
        String fileName = accountNo +".txt";
        if(amount > balance)
        {
            System.out.println("You don't have sufficient funds");
        }
        else {
            try {
                FileWriter fw = new FileWriter(fileName, false);
                balance -= amount;
                fw.write(balance + "\n");
                fw.close();
                System.out.println("You've successfully withdrawn an amount of "+amount);
                checkBalance();
            } catch (Exception e) {
                System.out.println("An error occurred while reading from the file");
            }
        }
    }


}

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the account Number : ");
        String accNo = sc.nextLine();
        User user = new User(accNo);
        while (true)
        {
            System.out.println("\n\n------------- MENU -------------");
            System.out.println("1.) Deposit");
            System.out.println("2.) Withdraw");
            System.out.println("3.) Check balance");
            System.out.println("4.) Exit");
            System.out.print("\n\n Please enter your choice -> ");
            try {
                int ch = sc.nextInt();
                System.out.println("\n--------------------------------");
                if(ch==1)
                {
                    System.out.print("\nPlease enter the amount to deposit : ");
                    float amount = sc.nextFloat();
                    user.deposit(amount);
                }
                else if(ch==2)
                {
                    System.out.print("\nPlease enter the amount to withdraw : ");
                    float amount = sc.nextFloat();
                    user.withdraw(amount);

                }
                else if(ch==3)
                {
                    user.checkBalance();
                }
                else if(ch==4)
                {
                    System.exit(1);
                }
                else {
                    throw new Exception("Invalid choice");
                }
            }
            catch (Exception e)
            {
                System.out.println("\nPlease enter a valid choice");
            }
        }

    }
}
