package com.bytex.todo.controllers;

import com.bytex.todo.model.TodoItem;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/todo/v1")
public class TodoItemController {

    // Use the appropriate annotation for mapping the endpoint and its arguments
    public List<TodoItem> getAll(/*fill request args here*/) {
        // Fill me
        return null;
    }

    // Use the appropriate annotation for mapping the endpoint and its arguments
    public TodoItem getItem(/*fill request args here*/) {
        // Fill me
        return null;
    }

    // Use the appropriate annotation for mapping the endpoint and its arguments
    public TodoItem createItem(/*fill request args here*/) {
        // Fill me
        return null;
    }

    // Use the appropriate annotation for mapping the endpoint and its arguments
    public TodoItem updateItem(/*fill request args here*/) {
        // Fill me
        return null;
    }

    // Use the appropriate annotation for mapping the endpoint and its arguments
    public void deleteItem(/*fill request args here*/) {
        // Fill me
    }
}
