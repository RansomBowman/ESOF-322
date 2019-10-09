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
public class LinkedList { //LinkedList
    public Node root; //first node in LL
    
    LinkedList(String n, int ss, double sa){ //inititializes LL
        root = new Node(n, ss, sa); //creates new node in LL
    }
}
