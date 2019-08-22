package org.raisinz;

import org.raisinz.model.Linkedlist;
import org.raisinz.model.Stack;
import org.raisinz.service.Stackclient;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        Stackclient.getStack(stack);
        Linkedlist linkedlist = new Linkedlist();
        Stackclient.getLinkedlist(linkedlist);
    }
}
