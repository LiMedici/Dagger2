package com.medici.demo.todo.base;

import androidx.appcompat.app.AppCompatActivity;

import com.medici.demo.todo.annotation.ActivityScope;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@ActivityScope
@Subcomponent(modules = {AndroidInjectionModule.class})
public interface ActivityComponent extends AndroidInjector<BaseActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<BaseActivity>{

    }
}
