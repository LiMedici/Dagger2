package com.medici.demo;

import android.app.Application;

import com.medici.demo.todo.app.AppComponent;

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        /*mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .taskRepositoryModule(new TaskRepositoryModule())
                .build();*/
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
