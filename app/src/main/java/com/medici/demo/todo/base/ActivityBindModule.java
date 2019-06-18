package com.medici.demo.todo.base;

import com.medici.demo.todo.annotation.ActivityScope;
import com.medici.demo.todo.task.TaskActivity;
import com.medici.demo.todo.task.TaskPresenterModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(subcomponents = ActivityComponent.class)
public abstract class ActivityBindModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = TaskPresenterModule.class)
    abstract TaskActivity taskActivityInjector();

}
