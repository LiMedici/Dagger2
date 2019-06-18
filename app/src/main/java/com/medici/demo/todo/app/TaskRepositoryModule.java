package com.medici.demo.todo.app;

import android.content.Context;

import androidx.annotation.NonNull;

import com.medici.demo.todo.annotation.Local;
import com.medici.demo.todo.annotation.Remote;
import com.medici.demo.todo.source.TaskLocalDataSource;
import com.medici.demo.todo.source.TaskRemoteDataSource;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TaskRepositoryModule {

    @Provides
    @Singleton
    @Local
    TaskLocalDataSource provideTaskLocalDataSource(@NonNull Context context){
        return new TaskLocalDataSource(context);
    }

    @Provides
    @Singleton
    @Remote
    TaskRemoteDataSource provideTaskRemoteDataSource(){
        return new TaskRemoteDataSource();
    }

}
