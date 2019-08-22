package org.raisinz.service;

import org.raisinz.model.*;

public class Stackclient {

    public static void getStack(Stack obj){
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.getStackData();
        System.out.println("popped data : "+obj.pop((e)->{return e;}));
        System.out.println("popped data : "+obj.pop((e)->{return e;}));
        obj.getStackData();
    }
}
