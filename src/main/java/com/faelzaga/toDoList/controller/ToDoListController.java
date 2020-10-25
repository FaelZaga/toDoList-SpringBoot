package com.faelzaga.toDoList.controller;

import com.faelzaga.toDoList.entity.ToDoList;
import com.faelzaga.toDoList.service.ToDoListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/todo")
public class ToDoListController {

    @Autowired
    ToDoListService toDoListService;

    @PostMapping("/create")
    public ResponseEntity<ToDoList> create(@RequestBody ToDoList toDoList) {
        return ResponseEntity.ok(toDoListService.create(toDoList));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ToDoList>> getAll() {
        return ResponseEntity.ok(toDoListService.getAll());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ToDoList> getById(@PathVariable int id) {
        return ResponseEntity.ok(toDoListService.getById(id));
    }

    @GetMapping("/getBy")
    public ResponseEntity<List<ToDoList>> getByDone(@RequestParam("done") boolean done) {
        return ResponseEntity.ok(toDoListService.getAllByDone(done));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<ToDoList> update(@PathVariable int id,@RequestBody ToDoList toDoList) {
        return ResponseEntity.ok(toDoListService.update(id,toDoList));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<List<ToDoList>> delete(@PathVariable int id) {
        return ResponseEntity.ok(toDoListService.delete(id));
    }
}
