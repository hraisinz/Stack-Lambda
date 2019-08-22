package org.raisinz.model;

public class Stack {
    private int[] stk;
    private int sp;
    private final int overflowValue = 0;
    private final String overflowMessage = "Stack Overflow";
    private final String underflowMessage = "Stack Underflow";

    public Stack(int size) {
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

}
