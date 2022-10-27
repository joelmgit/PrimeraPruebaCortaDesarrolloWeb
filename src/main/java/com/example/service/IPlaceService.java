/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.Place;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public interface IPlaceService {
    public List<Place> getAllPlaces();
    public Place getPlaceById(long id);
}
