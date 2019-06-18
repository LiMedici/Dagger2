package com.medici.demo.todo.task;


import com.medici.demo.todo.annotation.ActivityScope;

import dagger.BindsInstance;
import dagger.Subcomponent;

@ActivityScope
@Subcomponent(modules = TaskPresenterModule.class)
public interface TaskComponent {
    void inject(TaskActivity activity);

    @Subcomponent.Builder
    interface Builder{
        @BindsInstance
        Builder view(TaskContract.View view);

        TaskComponent build();
    }


}
