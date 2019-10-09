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
public class ESOFHMWK3 {

    public static void main(String[] args) {
        BinaryTree biTree = new BinaryTree(1); //creates Binary Tree and the root node
        biTree.root.setLeft(new Node(2)); //adds left node to root
        biTree.root.setRight(new Node(3)); //adds left node to root
        biTree.root.right.setRight(new Node(4)); //adds right node to root's right node
        
    }
    
}
