package com.example.todo;

import com.example.todo.Todo;

import java.util.*;

public interface TodoRepository{
    ArrayList<Todo> getTodos();

    Todo getTodoById(int todoId);

    Todo addTodo(Todo todo);
    
    Todo updateTodo(int todoId, Todo todo);

    void deleteTodo(int todoId);
}