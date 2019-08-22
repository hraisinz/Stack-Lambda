package org.raisinz.service;

import org.raisinz.model.Queue;

public class QueueClient {

    public static void getQueue(Queue queue){
        queue.push(10);
        queue.push(20);
        queue.push(30);
        queue.push(40);
        System.out.println("removed element : "+queue.pop(e->e));
        System.out.println("removed element : "+queue.pop(e->e));
        queue.getQueue();
    }
}
