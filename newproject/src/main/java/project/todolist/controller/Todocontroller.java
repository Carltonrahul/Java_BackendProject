package project.todolist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.todolist.model.Todoitem;
import project.todolist.repo.Todorepo;

@RestController
@RequestMapping(value = "/todo api")
public class Todocontroller {

@Autowired

private Todorepo todorepo;


@GetMapping
public List<Todoitem> findAll(){

return todorepo.findAll();

}

@PostMapping
public Todoitem save( @Validated @NonNull @RequestBody Todoitem todoitem){

    return todorepo.save(todoitem);
}

@PutMapping 


public Todoitem update (@Validated @NonNull @RequestBody Todoitem todoitem){

    return todorepo.save(todoitem);
}
    


@DeleteMapping (value ="/{id}")

    public void delete(@PathVariable Long id){

        todorepo.deleteById(id);;
    }

}

