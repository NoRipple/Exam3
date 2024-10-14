package com.example.exam3.BSConatct;

import com.example.exam3.Entity.People;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Classname: ServiceImpl
 * Package: com.example.exam3.BSConatct
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 21:49
 * @Version: v1.0
 */
public class Service {
    @Autowired
    private Repository repository;

    public List<People> getAll() {
        return repository.getAll();
    }

    public void add(People people) {
        repository.add(people);
    }

    public void delete(String name) {
        repository.delete(name);
    }

    public void update(String name) {
        People people = repository.getByName(name);
        repository.update(people);
    }
}
