/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.service;

import com.example.entity.Concert;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Joel Mora
 */
@Service
public interface IConcertService {
    public List<Concert> getAllConcerts();
    public Concert getConcertById(long id);
    public void saveConcert(Concert concert);
    public void deleteConcert(long id);
}
