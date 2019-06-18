package com.medici.demo;

import android.app.Application;

import com.medici.demo.todo.app.AppComponent;
import com.medici.demo.todo.app.AppModule;
import com.medici.demo.todo.app.DaggerAppComponent;
import com.medici.demo.todo.app.TaskRepositoryModule;

public class App extends Application {

    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .taskRepositoryModule(new TaskRepositoryModule())
                .build();
    }

    public AppComponent getAppComponent(){
        return mAppComponent;
    }
}
