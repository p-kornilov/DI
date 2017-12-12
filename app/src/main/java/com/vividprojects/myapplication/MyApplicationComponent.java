package com.vividprojects.myapplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

/**
 * Created by Smile on 29.11.2017.
 */
@Singleton
@Component(modules = MyApplicationModule.class)
public interface MyApplicationComponent {
    void inject(MainActivity activity);
    NetworkApi getAPI();
}
