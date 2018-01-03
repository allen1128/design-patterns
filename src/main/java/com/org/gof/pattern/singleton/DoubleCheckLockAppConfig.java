package com.org.gof.pattern.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

//double check lock Singleton
public class DoubleCheckLockAppConfig {
    private volatile static DoubleCheckLockAppConfig instance = null;
    private String paramA;
    private String paramB;

    private DoubleCheckLockAppConfig() {
        readConfig();
    }

    //double check lock
    public static DoubleCheckLockAppConfig getInstance(){
        if (instance == null){
            synchronized(DoubleCheckLockAppConfig.class){
                if (instance == null){
                    instance = new DoubleCheckLockAppConfig();
                }
            }
        }

        return instance;
    }

    private void readConfig() {
        Properties properties = new Properties();
        InputStream is = null;

        try {
            is = DoubleCheckLockAppConfig.class.getClassLoader().getResourceAsStream("application.properties");
            properties.load(is);
            paramA = properties.getProperty("paramA");
            paramB = properties.getProperty("paramB");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public String getParamA() {
        return paramA;
    }

    public String getParamB() {
        return paramB;
    }
}
