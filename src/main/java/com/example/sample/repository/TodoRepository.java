package com.example.sample.repository;

import java.util.List;

import com.example.sample.entity.TodoEntity;
import com.example.sample.entity.domain.Todo;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TodoRepository {
  public void insert(Todo todo);

  public List<TodoEntity> findAll();

  public void remove(int id);

  public void done(int id);
}
