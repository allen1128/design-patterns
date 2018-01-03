package com.org.gof.pattern.singleton;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public enum EnumAppConfig {
    instance;

    private String paramA;
    private String paramB;

    private EnumAppConfig() {
        readConfig();
    }

    private void readConfig() {
        Properties properties = new Properties();
        InputStream is = null;

        try {
            is = EnumAppConfig.class.getClassLoader().getResourceAsStream("application.properties");
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
