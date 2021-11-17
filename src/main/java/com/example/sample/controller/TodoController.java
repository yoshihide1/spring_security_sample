package com.example.sample.controller;

import java.util.List;

import com.example.sample.entity.TodoEntity;
import com.example.sample.entity.domain.Todo;
import com.example.sample.repository.TodoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/todo")
public class TodoController {
  @Autowired
  TodoRepository todoRepository;

  @GetMapping("/list")
  public String todoList(Model model) {
    List<TodoEntity> list = todoRepository.findAll();
    model.addAttribute("todoList", list);
    return "index";
  }

  @PostMapping("/add")
  public void add(Todo todo) {
    todoRepository.insert(todo);
  }

  @PostMapping("/remove/{id}")
  public void remove(@PathVariable int id) {
    todoRepository.remove(id);
  }

  @PostMapping("/done/{id}")
  public void checkout(@PathVariable int id) {
    // service作成そっちで処理
    todoRepository.done(id);
  }

}
