package com.andreitop.newco.service;

import com.andreitop.newco.dto.AbstractDto;

import java.util.List;

public interface AbstractService<T extends AbstractDto> {

    List<T> findAll();

    T findById(Long id);

    void save(T trip);

    void delete(Long id);

    void update(T newTrip);
}
