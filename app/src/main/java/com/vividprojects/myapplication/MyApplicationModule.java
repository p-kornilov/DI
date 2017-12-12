package com.vividprojects.myapplication;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by Smile on 29.11.2017.
 */

@Module
public class MyApplicationModule {
    private String name;

    public MyApplicationModule(String name){
        this.name = name;
    }
    @Provides
    //@Singleton
    NetworkApi provideNApi(){
        NetworkApi na = new NetworkApi();
        na.setName(name);
        return na;
    }
}
