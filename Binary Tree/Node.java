/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esof.hmwk.pkg3;

/**
 *
 * @author ranso
 */
public class Node {
    int data;
    public Node left; //left node
    public Node right; //right node
    
    public Node(int dat){ data = dat;} //creates node
    public Node getRight(){ return right;} //return right child
    public Node getLeft(){ return left;} //return left child
    public void setRight(Node tmp){ right = tmp;} //sets right child to passed in node
    public void setLeft(Node tmp){ left = tmp;} //sets left child to passed in node
    public void print(){ System.out.println(data); //prints data for node being operated on
    
    }
}


