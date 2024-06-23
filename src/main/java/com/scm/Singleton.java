package com.scm;

public class Singleton {
    private static Singleton INSTANCE;
    public String value;

    private Singleton(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.value = value;
    }

    public static Singleton getINSTANCE(String value) {
        if (INSTANCE==null){
            synchronized (Singleton.class){
                if(INSTANCE==null){
                    INSTANCE = new Singleton(value);
                }
            }
        }
        return INSTANCE;
    }
}
