package org.raisinz.service;

import org.raisinz.model.*;

public class Stackclient {

    public static void getStack(Stack stack){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println("popped data : "+stack.pop((e)->{return e;}));
        System.out.println("popped data : "+stack.pop((e)->{return e;}));
        stack.getStackData();
    }

    public static void getLinkedlist(Linkedlist linkedlist){
        linkedlist.insertNode(100);
        linkedlist.insertNode(20);
        linkedlist.insertNode(30);
        linkedlist.insertNode(40);
        linkedlist.insertNode(50);
        System.out.println("Removed element : "+linkedlist.removeNode(e->e));
        System.out.println("Removed element : "+linkedlist.removeNode(e->e));
        linkedlist.getLinkedlistData();


    }
}
