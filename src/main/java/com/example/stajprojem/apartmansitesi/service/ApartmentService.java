package com.example.stajprojem.apartmansitesi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.example.stajprojem.apartmansitesi.model.Apartment;
import com.example.stajprojem.apartmansitesi.repository.ApartmentRepository;

@Service
public class ApartmentService {

    @Autowired
    private ApartmentRepository apartmentRepository;

    public List<Apartment> getAllApartments() {
        return apartmentRepository.findAll();
    }

    public Apartment saveApartment(Apartment apartment) {
        apartmentRepository.save(apartment);
        return apartment;
    }

    public void deleteApartment(Long id) {
        apartmentRepository.deleteById(id);
    }

    public Apartment getApartmentById(Long id) {
        return apartmentRepository.findById(id).orElse(null);
    }
}
