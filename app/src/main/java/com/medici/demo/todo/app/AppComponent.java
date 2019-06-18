package com.medici.demo.todo.app;

import android.app.Application;

import com.medici.demo.todo.task.TaskComponent;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, TaskRepositoryModule.class})
public interface AppComponent {
    void inject(Application application);
    TaskComponent.Builder taskComponent();
}
