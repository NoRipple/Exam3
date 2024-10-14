package com.example.exam3.BSConatct;

import com.example.exam3.Entity.People;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Classname: Conroller
 * Package: com.example.exam3.BSConatct
 * Description:
 *
 * @Author: No_Ripple(吴波)
 * @Creat： - 21:46
 * @Version: v1.0
 */
@RestController
@RequestMapping("")
public class Controller {
    @Autowired
    private Service service;

    @GetMapping
    public List<People> getAllContacts() {
        return service.getAll();
    }

    @PostMapping
    public void add(@RequestBody People people) {
        service.add(people);
    }

    @DeleteMapping("/{name}")
    public void delete(@PathVariable String name) {
        service.delete(name);
    }

    @GetMapping("/{name}")
    public void update(@PathVariable String name) {
        service.update(name);
    }
}
