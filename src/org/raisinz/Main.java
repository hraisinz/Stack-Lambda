package org.raisinz;

import org.raisinz.model.Linkedlist;
import org.raisinz.model.Queue;
import org.raisinz.model.QueueClient;
import org.raisinz.model.Stack;
import org.raisinz.service.Stackclient;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Stackclient.getStack(stack);
        Linkedlist linkedlist = new Linkedlist();
        Stackclient.getLinkedlist(linkedlist);
        Queue queue = new Queue(10);
        QueueClient.getQueue(queue);
    }
}
