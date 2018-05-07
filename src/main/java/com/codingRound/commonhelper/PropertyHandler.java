package com.codingRound.commonhelper;
/*
@author - Sijo Jose
*/

import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {
    private static PropertyHandler instance = null;

    private Properties props = null;

    private PropertyHandler() {
        // Here you could read the file into props object
        this.props = new Properties();
        try {
            props.load(PropertyHandler.class.getClassLoader().getResourceAsStream("env.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized PropertyHandler getInstance() {
        if (instance == null)
            instance = new PropertyHandler();
        return instance;
    }

    public String getValue(String propKey){
        return this.props.getProperty(propKey);
    }
}
