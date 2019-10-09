/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esofhmwk2f;

/**
 *
 * @author ranso
 */
public class Node { //LinkedList Node
    String name; 
    int ssNum;
    double sal;
    
    public Node next;
    
    public Node(String n, int ss, double sa){ //initializes node
        name = n;
        ssNum = ss;
        sal = sa;                                    
    }
    
    public Node getNext(){ return next;} //returns the next node in the list
    public void setNext(Node tmp){ next = tmp;} //creates the next node in the list
    public void print(){ //prints name, ssNum, and sal for the node being operated on
        System.out.println(name + " | " + ssNum + " | " + sal);
    }
}
