package com.medici.demo.todo.app;

import android.content.Context;

import com.medici.demo.todo.task.TaskComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = TaskComponent.class)
public class AppModule {
    private final Context mContext;

    public AppModule(Context context){
        this.mContext = context;
    }

    @Provides
    @Singleton
    Context provideContext(){
        return mContext;
    }
}
