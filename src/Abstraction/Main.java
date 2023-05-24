package Abstraction;

public class Main{
    public static void main(String[] args) {


        ExternalPartners delhivery = new ExternalPartners();



        Delivery.getPackingAddress("address");
    }
}


//High level class : design purpose : easy building systems and a consistency
abstract class Delivery {

    abstract void doPackaging();

    public static void getPackingAddress(String address){
        System.out.println("getting it from database and adding packaging addreess");
    }

    public void getShippingAddress(){
        //Incase the designed want to give the implementation to some extent : he can write that impl here
    }

    abstract String deliveryPath();
}

class ExternalPartners extends Delivery{

    void doPackaging() {

        System.out.println("Packing at night and cheaper quality material : External Partners ");

    }

    public void getShippingAddress(){
        System.out.println("Shipping address to be taken from munshi service");
    }

//    public void getPackingAddress(String address){
//        System.out.println("Own style of packing address");
//    }

    public String deliveryPath(){

        String path  = "Banglore -> Mumbai -> Ahemdabad -> Jaipur -> Delhi -> Bathinda";
        return path;
    }

}