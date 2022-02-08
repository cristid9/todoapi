package com.bytex.todo.repository;

import com.bytex.todo.model.TodoItem;
import org.springframework.data.repository.CrudRepository;

public interface TodoItemRepository extends CrudRepository<TodoItem, Long> {
    // Fill me
}
