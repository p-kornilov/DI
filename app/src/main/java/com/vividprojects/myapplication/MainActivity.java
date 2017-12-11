package com.vividprojects.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity {

    //@Inject
    NetworkApi networkApi;

    //@Inject
    NetworkApi networkApi2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  MyApplicationComponent component = DaggerMyApplicationComponent.create();

        MyApplicationComponent component = DaggerMyApplicationComponent.builder()
                .myApplicationModule(new MyApplicationModule("Hello"))
                .build();


       // component.inject(this);

        networkApi = component.getAPI();
        networkApi2 = component.getAPI();

        boolean injected = networkApi == null ? false : true;
        TextView userAvailable = (TextView) findViewById(R.id.target);
        networkApi.setName("Test");
        userAvailable.setText("Dependency injection worked: " + networkApi.getName() + " " + networkApi2.getName());
    }
}
