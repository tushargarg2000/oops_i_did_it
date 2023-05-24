package Abstraction;



public class NoBank implements AtmInterface{

    public int checkBalance(){
        return 0;
    }

    public String withdrawMoney(int money){
        return "";
    }

    public String addMoney(int money){
        return "";
    }

}
