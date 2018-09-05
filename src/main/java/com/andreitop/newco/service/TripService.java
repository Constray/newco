package com.andreitop.newco.service;

import com.andreitop.newco.dto.TripDto;
import com.andreitop.newco.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TripService<T extends TripDto> implements AbstractService<T> {

    private final TripRepository<T> tripRepository;

    @Autowired
    public TripService(TripRepository<T> tripRepository) {
        this.tripRepository = tripRepository;
    }

    public List<T> findAll() {
        return tripRepository.findAll();
    }

    public T findById(Long id) {
        return tripRepository.findById(id);
    }

    public void save(T trip) {
        tripRepository.save(trip);
    }

    public void delete(Long id) {
        tripRepository.delete(id);
    }

    public void update(T newTrip) {
        tripRepository.update(newTrip);
    }
}
