package com.bytex.todo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TodoItem {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    // Fill in the rest of the fields


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
