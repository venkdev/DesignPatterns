package com.github.venkdev.designpatterns.creational.singleton;

public class Singleton {

    private Singleton(){}

    private static Singleton instance;

    //Using DCL
    public static Singleton getInstanceByDcl(){
        if (null == instance) {
            synchronized (Singleton.class) {
                if (null == instance)           {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    //Using Bill Pugh technique
    public static Singleton getInstanceByBillPughTechnique(){
        return BillPughInnerStaticClass.instance;
    }

    private static class BillPughInnerStaticClass {
        private static Singleton instance = new Singleton();
    }
}
