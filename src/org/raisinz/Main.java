package org.raisinz;

import org.raisinz.model.Linkedlist;
import org.raisinz.model.Queue;
import org.raisinz.service.QueueClient;
import org.raisinz.model.Stack;
import org.raisinz.service.Stackclient;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nStack");
        Stack stack = new Stack(10);
        Stackclient.getStack(stack);
        System.out.println("\nLinkdelist");
        Linkedlist linkedlist = new Linkedlist();
        Stackclient.getLinkedlist(linkedlist);
        System.out.println("\nQueue");
        Queue queue = new Queue(10);
        QueueClient.getQueue(queue);
    }
}
