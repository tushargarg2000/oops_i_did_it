package OOPS_Lec2;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Tushar",1,180,23,"Brain");
        System.out.println("The value of yearsOfExp is "+d1.yearsOfExperience);

        d1.danceFunc(); //Use the method of the parent class by the child class

        Person person = new Person("Tushar",23,180);

        d1.name = "Vikash"; //Instance variable : require an object

        //Static variables are at a class Level and dont require an object to called

        Doctor.degree = "MBBS";

        Doctor.staticFunction(); //Only with the help of classes


    }
}
class Person{
    String name;
    int age;
    int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void dance(){
        System.out.println("this is a dance function in the parent class");
    }
}
class Doctor extends Person{

    String name;
    int yearsOfExperience;

    static String degree;

    String specialist;

    public Doctor(String name, int age, int height, int yearsOfExperience, String specialist) {
        super(name, age, height);
        this.yearsOfExperience = yearsOfExperience;
        this.specialist = specialist;
    }

    public void dance() {
        System.out.println("Dance function in the doctor class ");
    }
    public void danceFunc(){
        //Calling the parent's method / function
        super.dance();
    }

    static void staticFunction(){
        System.out.println("This is a static function ");
    }

    public void updateName(String newName){
        name = newName;
    }


}

class Lawyer extends Person{

    int yearsOfPractice;
    int casesSolved;

    public Lawyer(String name, int age, int height) {
        super(name, age, height);
    }
}
