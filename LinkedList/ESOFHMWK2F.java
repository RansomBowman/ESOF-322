package esofhmwk2f;

/**
 *
 * @author ranso
 */
public class ESOFHMWK2F { //Typo. Supposed to be ESOFHMWK3F

    public static void main(String[] args) {
        LinkedList ll = new LinkedList("Ransom", 4838372, 15.00); //creates linked list
        
        ll.root.setNext(new Node("Elijah", 32456768, 55.00)); //creates second node in LL
        
        ll.root.next.setNext(new Node("Melbourne", 11111111, 35.00)); //creates third node in LL
        
        ll.root.print(); //prints first node
        ll.root.getNext().print(); //prints second node
        ll.root.next.getNext().print(); //prints third node
    }
    
}
