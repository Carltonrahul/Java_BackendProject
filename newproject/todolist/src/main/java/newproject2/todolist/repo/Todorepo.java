package newproject2.todolist.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import newproject2.todolist.model.Todoitem;

public interface  Todorepo extends JpaRepository<Todoitem ,Long>{

    List<Todoitem> findAll();

    Todoitem save(Todoitem todoitem);

    void deleteById(Long id);

       
}
