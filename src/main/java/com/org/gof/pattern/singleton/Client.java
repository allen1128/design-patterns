package com.org.gof.pattern.singleton;

public class Client {
    public static void main(String[] args){
        //DoubleCheckLockAppConfig appConfig = DoubleCheckLockAppConfig.getInstance();
        EnumAppConfig appConfig = EnumAppConfig.instance;
        System.out.println(appConfig.getParamA());
        System.out.println(appConfig.getParamB());
    }
}
