/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Place;
import com.example.repository.PlaceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public class PlaceService implements IPlaceService {
    
    @Autowired
    private PlaceRepository placeRepository;

    @Override
    public List<Place> getAllPlaces() {
        return (List<Place>)placeRepository.findAll();      
    }

    @Override
    public Place getPlaceById(long id) {
        return placeRepository.findById(id).orElse(null);
    }
    
    
    
}
