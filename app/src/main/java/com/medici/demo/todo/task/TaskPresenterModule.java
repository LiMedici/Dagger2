package com.medici.demo.todo.task;

import com.medici.demo.todo.annotation.ActivityScope;
import com.medici.demo.todo.source.TaskRepository;

import dagger.Module;
import dagger.Provides;

@Module
public class TaskPresenterModule {

    @Provides
    @ActivityScope
    TaskPresenter provideTaskPresenter(TaskRepository taskRepository,TaskContract.View view){
        return new TaskPresenter(taskRepository,view);
    }

}
