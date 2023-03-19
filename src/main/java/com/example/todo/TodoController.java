/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 * 
 */

// Write your code here
package com.example.todo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

// import com.example.todo.TodoRepository;
import com.example.todo.TodoService;

@RestController
public class TodoController{
    TodoService tRepository = new TodoService();

    @GetMapping("/todos")
    public ArrayList<Todo> getTodos(){
        return tRepository.getTodos();
    };
    
    @GetMapping("/todos/{todoId}")
    public Todo getTodoById(@PathVariable("todoId") int todoId){
        return tRepository.getTodoById(todoId);
    };
    @PostMapping("/todos")
    public Todo addTodo(@RequestBody Todo todo){
        return tRepository.addTodo(todo);
    };
    
    @PutMapping("/todos/{todoId}")
    public Todo updateTodo(@PathVariable("todoId") int todoId, @RequestBody Todo todo){
        return tRepository.updateTodo(todoId, todo);
    };

    @DeleteMapping("/todos/{todoId}")
    public void deleteTodo(@PathVariable("todoId") int todoId){
        tRepository.deleteTodo(todoId);
    };


}