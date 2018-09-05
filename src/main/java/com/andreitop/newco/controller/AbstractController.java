package com.andreitop.newco.controller;

import com.andreitop.newco.dto.AbstractDto;
import com.andreitop.newco.service.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public abstract class AbstractController<T extends AbstractDto> {

    protected final AbstractService<T> service;

    @Autowired
    public AbstractController(AbstractService<T> service) {
        this.service = service;
    }

    public abstract List<T> findAll();

    public abstract T findById( final Long id);

    public abstract void create(@RequestBody final T object);

    public abstract void delete(final Long id);

    public abstract void update(@RequestBody final T newObject);
}
