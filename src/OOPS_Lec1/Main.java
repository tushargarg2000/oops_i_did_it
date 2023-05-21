package OOPS_Lec1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Person p = new Person("Vikash",23,180,"Btech");
//        //p is the reference variable of the object in the memory
////
//        System.out.println(p.name);
//
//        Person p1 = new Person("Sakshi",21,160,"BTech");
//
//        System.out.println(p1.name);
//
//        Person p3 = new Person("Azrudeen",23,172,"Mtech");
//
//        System.out.println(p3.name);
//
//        Person p4 = new Person("Vibhuti",23);
//
//        System.out.println("The address of memory where Vibhut info is stored/reference "+p4);

        System.out.println("Welcome to Lotak Bank. To open an account please enter your details");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter accountNo");
        String accountNo = sc.nextLine();
        System.out.println("Enter Your Name");
        String name = sc.nextLine();
        System.out.println("Enter Initial Balance");
        int balance = sc.nextInt();
        System.out.println("Enter account type");
        String accountType = sc.nextLine();

        BankAccount bankAccount = new BankAccount(accountNo,name,balance,accountType);

        System.out.println("Enter type of operation " + "\n"+
                "1. Check balance " +
                "2. Add money " +
                "3. Withdraw money" +
                "4. Exit");

        int choice = sc.nextInt();

        while(choice!=4){

            switch (choice){
                case 1:
                    int balanceGot  = bankAccount.checkBalance();
                    System.out.println("The balance is"+balanceGot);
                    break;
                case 2:
                    System.out.println("Enter the money to add");
                    int money = sc.nextInt();
                    bankAccount.addMoney(money);
                    break;
                case 3:
                    System.out.println("Enter the money to withdraw");
                    int moneyToWithdraw = sc.nextInt();
                    bankAccount.withdrawMoney(moneyToWithdraw);
            }

            System.out.println("Thank you for operating !!");

            System.out.println("Enter type of operation " + "\n"+
                    "1. Check balance " +
                    "2. Add money " +
                    "3. Withdraw money" +
                    "4. Exit");

            choice = sc.nextInt();
        }

    }
}

//This is a class : Blueprint of the object
class Person{

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, int height, String qualification){
       this.name = name;
        this.age = age;
        this.height = height;
        this.qualification = qualification;
    }
    //Local variables have been initialized with the help of constructor


    //These are attributes that describe a particular class
    String name;
    int age;
    int height;
    String qualification;

    //Methods : functions that objects of this class can call

    public void sing(String name){
        System.out.println("This "+name+" is singing a song");
    }



}

class BankAccount {

    String accountNo;
    String accountName;
    int balance;
    String accountType;

    public BankAccount(String accountNo,String accountName,int balance,String accountType){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
        this.accountType = accountType;
    }


    //Functions

    int checkBalance(){
        return balance;
    }

    public void addMoney(int money){
        balance = balance + money;
        System.out.println("Money added successfully, new balance is "+balance);
    }

    public void withdrawMoney(int money){
        if(balance>money){
            balance = balance - money;
            System.out.println("Money withdrawn and new balance is "+balance);
        }else{
            System.out.println("Insufficient balance");
        }
    }

}
