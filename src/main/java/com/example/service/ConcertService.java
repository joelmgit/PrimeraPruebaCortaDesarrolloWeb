/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.entity.Concert;
import com.example.repository.ConcertRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public class ConcertService implements IConcertService{
    
    @Autowired
    private ConcertRepository concertRepository;

    @Override
    public List<Concert> getAllConcerts() {
        return (List<Concert>)concertRepository.findAll();
    }

    @Override
    public Concert getConcertById(long id) {
        return concertRepository.findById(id).orElse(null);
    }

    @Override
    public void saveConcert(Concert concert) {
        concertRepository.save(concert);
    }

    @Override
    public void deleteConcert(long id) {
        concertRepository.deleteById(id);
    }
    
}
