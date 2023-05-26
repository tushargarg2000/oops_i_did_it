package OOPs4;


import java.util.Scanner;

class Main{
    public static void main(String[] args) {

        AccessModifierClass1 obj = new AccessModifierClass1();

//        obj.variable = 10;
        //  This is not allowed

//        BankAccount bankAccount = new BankAccount();
//
//        //bankAccount.password = "abc"; This is not allowed bcz password is a private variable
//
//        bankAccount.accNo = 2000;
//
//        bankAccount.balance = 50000; //This is possible

        //At any point you can never directly access the password :

        //Indirectly modify

        BankAccount bankAccount = new BankAccount(123,"abc123",5000);

        System.out.println("Ans a security question incase you forget your password");
        System.out.println("What is company of your first mobile ?");
        Scanner sc = new Scanner(System.in);
        String ans = sc.nextLine();
        bankAccount.setSecurityAns(ans);

//        bankAccount.balance = 0; //This should not be allowed

        //chnage the password : know the original password before changing it

        System.out.println("Enter the old password and new Passowrd");
        String old = sc.nextLine();
        String newPassword = sc.nextLine();


        String value = bankAccount.updatePassword(old,newPassword);

        System.out.println(value);


    }
}

class AccessModifierClass1 {

    private int variable;

}

class BankAccount{

    public int accNo;

    private String password;

    private int balance;

    private String securityAns;


    public BankAccount(int accNo, String password, int balance) {
        this.accNo = accNo;
        this.password = password;
        this.balance = balance;
    }

    public String updatePassword(String oldPassword,String newPassword){

        if(oldPassword.equals(password)){
            password = newPassword;
            return "Password updated successfully";
        }
        System.out.println("Did you forget your old password ? Y/N");
        Scanner sc = new Scanner(System.in);
        String response = sc.nextLine();
        if(response.equals("Y")){
            System.out.println("What is company of your first mobile ?");
            String ans = sc.nextLine();
            if(ans.equals(securityAns)){
                return "Your password was "+password;
            }else{
                return "Wrong security Ans.";
            }
        }

        return "Please retry the update password";
    }

    public String getSecurityAns(){

        //Incase I want to some validation
        return securityAns;

    }

    public void setSecurityAns(String securityAns) {
        this.securityAns = securityAns;
    }
}
