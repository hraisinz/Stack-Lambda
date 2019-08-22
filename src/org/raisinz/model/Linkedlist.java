package org.raisinz.model;

public class Linkedlist {
    private Node head;
    private final int underflowValue;
    private final String underflowMessage;
    private int count;

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
        System.out.println("Linkedlist Data");
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

    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }

    public int size(){
        Node temp=head;
        while (temp != null){
            count++;
            temp=temp.getNext();
        }
        return count;
    }
}
