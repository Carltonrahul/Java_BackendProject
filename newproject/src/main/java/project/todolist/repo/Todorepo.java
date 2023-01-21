package project.todolist.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import project.todolist.model.Todoitem;

public interface  Todorepo extends JpaRepository<Todoitem ,Long>{

    
}
