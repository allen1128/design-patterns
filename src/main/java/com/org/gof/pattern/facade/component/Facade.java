package com.org.gof.pattern.facade.component;

public class Facade {
    public static void generate(){
        ModuleAApi moduleAApi = new ModuleAApiImpl();
        ModuleBApi moduleBApi = new ModuleBApiImpl();
        ModuleCApi moduleCApi = new ModuleCApiImpl();
        moduleAApi.generate();
        moduleBApi.generate();
        moduleCApi.generate();
    }
}
