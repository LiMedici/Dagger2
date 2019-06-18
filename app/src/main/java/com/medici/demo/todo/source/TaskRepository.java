package com.medici.demo.todo.source;

import com.medici.demo.todo.annotation.Local;
import com.medici.demo.todo.annotation.Remote;

import javax.inject.Inject;

public class TaskRepository {

    private TaskLocalDataSource localDataSource;
    private TaskRemoteDataSource remoteDataSource;

    @Inject
    public TaskRepository(@Local TaskLocalDataSource localDataSource,@Remote TaskRemoteDataSource remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }
}
