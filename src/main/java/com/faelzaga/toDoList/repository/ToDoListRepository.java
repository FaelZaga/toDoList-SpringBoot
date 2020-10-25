package com.faelzaga.toDoList.repository;

import com.faelzaga.toDoList.entity.ToDoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList,Integer> {
    List<ToDoList> findAllByDone(boolean done);
}
