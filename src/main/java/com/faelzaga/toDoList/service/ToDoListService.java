package com.faelzaga.toDoList.service;

import com.faelzaga.toDoList.entity.ToDoList;
import com.faelzaga.toDoList.repository.ToDoListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ToDoListService {

    @Autowired
    ToDoListRepository toDoListRepository;

    public ToDoList create(ToDoList toDoList) {
        return toDoListRepository.save(toDoList);
    }

    public List<ToDoList> getAll() {
        return (List<ToDoList>) toDoListRepository.findAll();
    }

    public ToDoList getById(int id) {
        return toDoListRepository.findById(id).orElseThrow();
    }

    public List<ToDoList> getAllByDone(boolean done) {
        return toDoListRepository.findAllByDone(done);
    }

    public ToDoList update(int id, ToDoList toDoList) {
        ToDoList newToDoList = getById(id);

        newToDoList.setTitle(toDoList.getTitle());
        newToDoList.setDone(toDoList.getDone());

        return toDoListRepository.save(newToDoList);
    }

    public List<ToDoList> delete(int id) {
        toDoListRepository.deleteById(id);
        return this.getAll();
    }
}
