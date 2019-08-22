package org.raisinz.model;

public class Stack {
    private int[] stk;
    private int sp;
    private final int overflowValue;
    private final String overflowMessage;
    private final String underflowMessage;
    private int count;

    public Stack(int size) {
        overflowValue=0;
        overflowMessage = "Stack Overflow";
        underflowMessage = "Stack Underflow";
        this.stk = new int[size];
        this.sp = size;
    }

    public void push(int v) {
        if (sp == overflowValue) System.out.println(overflowMessage);
        else stk[--sp] = v;
    }

    public int pop(Istack obj) {
        if (sp == stk.length) {
            System.out.println(underflowMessage);
            return -1;
        }
        else{
            sp++;
            return obj.getValue(stk[sp-1]);
        }
    }

    public void getStackData() {
        System.out.println("Stack Data");
        for (int i = sp; i < stk.length; i++) {
            System.out.println(stk[i]);
        }
    }

    public boolean isEmpty(){
        if(sp == stk.length) return true;
        else return false;

    }

    public int size(){
        if(sp == 0){
            count=0;
            return count;
        }
        else {
            count = stk.length - sp;
            return count;
        }
    }

    public int peek(){
        return stk[sp];
    }

}
