package com.andreitop.newco.controller;

import com.andreitop.newco.dto.AbstractDto;
import com.andreitop.newco.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public abstract class AbstractController<T extends AbstractDto> {

    private final AbstractService<T> service;

    @Autowired
    public AbstractController(AbstractService<T> service) {
        this.service = service;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<T> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public T findById(@PathVariable("id") final Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody final T object) {
        service.save(object);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") final Long id) {
        service.delete(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody final T newObject) {
        service.update(newObject);
    }
}
