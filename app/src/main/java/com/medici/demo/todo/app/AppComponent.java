package com.medici.demo.todo.app;

import android.app.Application;

import com.medici.demo.DaggerAndroidApp;
import com.medici.demo.todo.base.ActivityBindModule;
import com.medici.demo.todo.task.TaskComponent;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = {AppModule.class, TaskRepositoryModule.class, AndroidInjectionModule.class, AndroidSupportInjectionModule.class, ActivityBindModule.class})
public interface AppComponent {
    // 必须具体到类型，不能是超类或者子类
    void inject(DaggerAndroidApp application);
    // TaskComponent.Builder taskComponent();
}
