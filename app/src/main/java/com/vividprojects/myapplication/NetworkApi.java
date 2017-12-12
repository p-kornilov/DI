package com.vividprojects.myapplication;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by Smile on 29.11.2017.
 */

public class NetworkApi {

    private String name;

    public NetworkApi(){
    }

    public String getName() {
        if (name!=null)
            return name;
        else
            return "It works!";
    }

    public void setName(String name) {
        this.name = name;
    }
}
