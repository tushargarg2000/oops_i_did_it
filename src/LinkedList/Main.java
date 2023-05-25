package LinkedList;

import java.util.Scanner;

class Node{ //Blueprint of the Node object (look like)

    int data; //this is data that will be present inside the object

    Node nextNodeAddress; //It can contain the address of
    // any object which is from the class Node

    //This is a constructor
    Node(int data){
        this.data = data;
        nextNodeAddress = null;
    }

}

class LinkedList{

    Node head; //This variable will always store the address of the
    //first Node of the Linked List.

    Node tail; //This will store the address of the object of the last
    //node of the LL.

    public void addNode(int data){

        Node newNode = new Node(data); //The random memory address we get
        //in the newNode variable
        System.out.println("Printing the address of the new Node"+newNode);

        //First Node
        if(head==null && tail==null){
            head = newNode;
            tail = newNode;
            System.out.println("This is the first Node");
            System.out.println("Add of newNode"+newNode+" headNode : "+head+"tailNode : "+tail);
            return;
        }

        //Other nodes
        tail.nextNodeAddress = newNode;
        tail = newNode;
        System.out.println("Add of newNode"+newNode+" headNode : "+head+"tailNode : "+tail);
    }


}


public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //Now I need to data value of each Node
        LinkedList ll = new LinkedList();

        for(int i=0;i<n;i++){
            int no = scanner.nextInt();
            ll.addNode(no);
        }

    }
}
