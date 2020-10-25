package com.faelzaga.toDoList.repository;

import com.faelzaga.toDoList.entity.ToDoList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoListRepository extends CrudRepository<ToDoList,Integer> {

}
