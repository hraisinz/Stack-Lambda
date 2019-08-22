package org.raisinz.model;

public class Queue {

    private int[] que;
    private int top;
    private int rear;
    private final String fullMessage;
    private final String emptyMessage;
    private int count;

    public Queue(int size) {
        fullMessage="Queue is full";
        emptyMessage="Queue is empty";
        que=new int[size];
        top =-1;
        rear=0;
    }

    public void push(int data){
        if(top < que.length -1){
            que[++top]=data;
        }
        else{
            System.out.println(fullMessage);
        }
    }

    public int pop(Iqueue obj){
        if(top != -1){
            int temp= que[rear];

            for (int i=rear;i<top;i++){
                que[i]=que[i+1];
            }
            top--;
            return obj.getValue(temp);
        }
        else {
            System.out.println(emptyMessage);
            return -1;
        }
    }
    
    public void getQueue(){
        System.out.println("Queue Data");
        if(top == -1){
            System.out.println(emptyMessage);
        }
        for (int i = 0; i <=top; i++) {
            System.out.println(que[i]);
        }
    }

    public boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }

    public int size(){
        if(top == -1){
            count=0;
            return count;
        }
        else {
            count=top+1;
            return count;
        }

    }
}
