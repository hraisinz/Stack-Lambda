package org.raisinz.model;
import org.raisinz.model.*;

public class Linkedlist {

    private Node head;
    private final int underflowValue;
    private final String underflowMessage;

    public Linkedlist() {
        head=null;
        underflowValue=-1;
        underflowMessage="List is Empty";
    }

    public void insertNode(int data){
        head = new Node(data, head);
    }

    public int removeNode(Istack obj){
        if(head==null){
            System.out.println(underflowMessage);
            return underflowValue;
        }
        Node temp=head;
        head=head.getNext();
        return obj.getValue(temp.getData());

    }

    public void getLinkedlistData(){
        if(head == null){
            System.out.println(underflowMessage);
        }
        Node temp=head;
        while (temp!= null)
        {
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
}
